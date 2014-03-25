package com.rafali.flickruploader.model;

import java.io.File;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import se.emilsjolander.sprinkles.Model;
import se.emilsjolander.sprinkles.annotations.Column;
import se.emilsjolander.sprinkles.annotations.PrimaryKey;
import se.emilsjolander.sprinkles.annotations.Table;
import android.provider.MediaStore;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import com.rafali.common.ToolString;
import com.rafali.flickruploader.api.FlickrApi.PRIVACY;
import com.rafali.flickruploader.tool.Utils;
import com.rafali.flickruploader.tool.Utils.MediaType;
import com.rafali.flickruploader.ui.activity.FlickrUploaderActivity;

@Table("Media")
public class Media extends Model {

	@PrimaryKey
	@Column("id")
	private int id;

	@Column("path")
	private String path;

	@Column("name")
	private String name;

	@Column("mediaType")
	private int mediaType;

	@Column("size")
	private int size;

	@Column("md5Sum")
	private String md5Sum;

	@Column("date")
	private long date;

	@Column("imported")
	private long imported;

	@Column("flickrId")
	private String flickrId;

	@Column("flickrSets")
	private String flickrSets;

	@Column("privacy")
	private int privacy;

	@Override
	public String toString() {
		return this.id + " - " + path;
	}

	@Override
	public int hashCode() {
		if (this.path != null)
			return this.path.hashCode();
		return super.hashCode();
	}

	@Override
	public boolean equals(Object o) {
		if (o == this) {
			return true;
		}
		if (o instanceof Media) {
			return ((Media) o).path.equals(this.path);
		}
		return super.equals(o);
	}

	public String getFolderPath() {
		int lastIndexOf = this.path.lastIndexOf("/");
		if (lastIndexOf > 0) {
			return this.path.substring(0, lastIndexOf);
		}
		return "/";
	}

	public String getFolderName() {
		String folderPath = getFolderPath();
		int lastIndexOf = folderPath.lastIndexOf("/");
		if (lastIndexOf > 0) {
			return folderPath.substring(lastIndexOf);
		}
		return "";
	}

	public MediaType getMediaType() {
		return this.mediaType == MediaStore.Files.FileColumns.MEDIA_TYPE_VIDEO ? MediaType.video : MediaType.photo;
	}

	public void setMediaType(MediaType mediaType) {
		this.mediaType = (mediaType == MediaType.video ? MediaStore.Files.FileColumns.MEDIA_TYPE_VIDEO : MediaStore.Files.FileColumns.MEDIA_TYPE_IMAGE);
	}

	public void setMediaType(int mediaType) {
		if (mediaType == MediaStore.Files.FileColumns.MEDIA_TYPE_VIDEO || mediaType == MediaStore.Files.FileColumns.MEDIA_TYPE_IMAGE) {
			this.mediaType = mediaType;
		} else {
			throw new IllegalArgumentException("not supported mediaType : " + mediaType);
		}
	}

	public boolean isPhoto() {
		return this.mediaType == MediaStore.Files.FileColumns.MEDIA_TYPE_IMAGE;
	}

	public boolean isVideo() {
		return this.mediaType == MediaStore.Files.FileColumns.MEDIA_TYPE_VIDEO;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSize() {
		return this.size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public long getDate() {
		return this.date;
	}

	public void setDate(long date) {
		this.date = date;
	}

	public long getImported() {
		return this.imported;
	}

	public String getMd5Sum() {
		if (this.md5Sum == null) {
			// this call is expensive, around 7 hash/sec on a Moto X
			this.md5Sum = Utils.getMD5Checksum(path);
			saveAsync2();
		}
		return this.md5Sum;
	}

	public String getMd5Tag() {
		return "file:md5sum=" + getMd5Sum();
	}

	public void setMd5Sum(String md5Sum) {
		this.md5Sum = md5Sum;
	}

	public boolean isUploaded() {
		return ToolString.isNotBlank(flickrId);
	}

	public String getFlickrId() {
		return this.flickrId;
	}

	public void setFlickrId(String flickrId) {
		this.flickrId = flickrId;
	}

	public String getFlickrSets() {
		return this.flickrSets;
	}

	public void setFlickrSets(String photoSets) {
		this.flickrSets = photoSets;
	}

	public void addPhotoSet(String photosetId) {
		if (ToolString.isNotBlank(photosetId)) {
			if (ToolString.isBlank(flickrSets)) {
				this.flickrSets = photosetId;
			} else if (flickrSets != null && !flickrSets.contains(photosetId)) {
				ArrayList<String> photoSetsList = Lists.newArrayList(flickrSets.split(";"));
				photoSetsList.add(photosetId);
				this.flickrSets = Joiner.on(";").join(photoSetsList);
			}
		}
	}

	public PRIVACY getPrivacy() {
		switch (this.privacy) {
		case 1:
			return PRIVACY.PRIVATE;
		case 2:
			return PRIVACY.FAMILY;
		case 3:
			return PRIVACY.FRIENDS;
		case 4:
			return PRIVACY.FRIENDS_FAMILY;
		case 5:
			return PRIVACY.PUBLIC;
		default:
			break;
		}
		return null;
	}

	public void setPrivacy(PRIVACY privacy) {
		if (privacy == null) {
			this.privacy = 0;
		} else {
			switch (privacy) {
			case PRIVATE:
				this.privacy = 1;
				break;
			case FAMILY:
				this.privacy = 2;
				break;
			case FRIENDS:
				this.privacy = 3;
				break;
			case FRIENDS_FAMILY:
				this.privacy = 4;
				break;
			case PUBLIC:
				this.privacy = 5;
				break;
			default:
				this.privacy = 0;
				break;
			}
		}
	}

	private String sha1sig;

	public String getSha1Tag() {
		if (this.sha1sig == null) {
			this.sha1sig = ("file:sha1sig=" + Utils.SHA1(this.path + "_" + new File(this.path).length())).toLowerCase(Locale.US);
		}
		return this.sha1sig;
	}

	@Override
	protected void beforeCreate() {
		this.imported = System.currentTimeMillis();
	}

	public void saveAsync2() {
		FlickrUploaderActivity.updateStatic(this);
		executor.submit(new Runnable() {
			@Override
			public void run() {
				save();
			}
		});
	}

	static ExecutorService executor = Executors.newSingleThreadExecutor();
}
