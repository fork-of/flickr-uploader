/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * (build: 2013-10-30 15:57:41 UTC)
 * on 2013-11-11 at 18:08:00 UTC 
 * Modify at your own risk.
 */

package com.rafali.flickruploader.appinstallendpoint.model;

/**
 * Model definition for AndroidDevice.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the appinstallendpoint. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AndroidDevice extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer androidVersion;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean appInstalled;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String appVersion;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime dateCreation;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> emails;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String gcmId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String language;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String modelInfo;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String otherInfos;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getAndroidVersion() {
    return androidVersion;
  }

  /**
   * @param androidVersion androidVersion or {@code null} for none
   */
  public AndroidDevice setAndroidVersion(java.lang.Integer androidVersion) {
    this.androidVersion = androidVersion;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAppInstalled() {
    return appInstalled;
  }

  /**
   * @param appInstalled appInstalled or {@code null} for none
   */
  public AndroidDevice setAppInstalled(java.lang.Boolean appInstalled) {
    this.appInstalled = appInstalled;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getAppVersion() {
    return appVersion;
  }

  /**
   * @param appVersion appVersion or {@code null} for none
   */
  public AndroidDevice setAppVersion(java.lang.String appVersion) {
    this.appVersion = appVersion;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getDateCreation() {
    return dateCreation;
  }

  /**
   * @param dateCreation dateCreation or {@code null} for none
   */
  public AndroidDevice setDateCreation(com.google.api.client.util.DateTime dateCreation) {
    this.dateCreation = dateCreation;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getEmails() {
    return emails;
  }

  /**
   * @param emails emails or {@code null} for none
   */
  public AndroidDevice setEmails(java.util.List<java.lang.String> emails) {
    this.emails = emails;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getGcmId() {
    return gcmId;
  }

  /**
   * @param gcmId gcmId or {@code null} for none
   */
  public AndroidDevice setGcmId(java.lang.String gcmId) {
    this.gcmId = gcmId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * @param id id or {@code null} for none
   */
  public AndroidDevice setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getLanguage() {
    return language;
  }

  /**
   * @param language language or {@code null} for none
   */
  public AndroidDevice setLanguage(java.lang.String language) {
    this.language = language;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getModelInfo() {
    return modelInfo;
  }

  /**
   * @param modelInfo modelInfo or {@code null} for none
   */
  public AndroidDevice setModelInfo(java.lang.String modelInfo) {
    this.modelInfo = modelInfo;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getOtherInfos() {
    return otherInfos;
  }

  /**
   * @param otherInfos otherInfos or {@code null} for none
   */
  public AndroidDevice setOtherInfos(java.lang.String otherInfos) {
    this.otherInfos = otherInfos;
    return this;
  }

  @Override
  public AndroidDevice set(String fieldName, Object value) {
    return (AndroidDevice) super.set(fieldName, value);
  }

  @Override
  public AndroidDevice clone() {
    return (AndroidDevice) super.clone();
  }

}
