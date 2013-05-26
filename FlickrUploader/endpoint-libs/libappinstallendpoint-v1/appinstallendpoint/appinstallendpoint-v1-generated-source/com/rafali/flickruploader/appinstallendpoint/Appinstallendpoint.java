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
 * (build: 2013-05-23 17:46:09 UTC)
 * on 2013-05-26 at 04:44:26 UTC 
 * Modify at your own risk.
 */

package com.rafali.flickruploader.appinstallendpoint;

/**
 * Service definition for Appinstallendpoint (v1).
 *
 * <p>
 * This is an API
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link AppinstallendpointRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class Appinstallendpoint extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION == 14,
        "You are currently running with version %s of google-api-client. " +
        "You need version 1.14 of google-api-client to run version " +
        "1.14.2-beta of the  library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://ra-fa-li.appspot.com/_ah/api/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "appinstallendpoint/v1/";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public Appinstallendpoint(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  Appinstallendpoint(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * Create a request for the method "getAppInstall".
   *
   * This request holds the parameters needed by the the appinstallendpoint server.  After setting any
   * optional parameters, call the {@link GetAppInstall#execute()} method to invoke the remote
   * operation.
   *
   * @param id
   * @return the request
   */
  public GetAppInstall getAppInstall(java.lang.String id) throws java.io.IOException {
    GetAppInstall result = new GetAppInstall(id);
    initialize(result);
    return result;
  }

  public class GetAppInstall extends AppinstallendpointRequest<com.rafali.flickruploader.appinstallendpoint.model.AppInstall> {

    private static final String REST_PATH = "appinstall/{id}";

    /**
     * Create a request for the method "getAppInstall".
     *
     * This request holds the parameters needed by the the appinstallendpoint server.  After setting
     * any optional parameters, call the {@link GetAppInstall#execute()} method to invoke the remote
     * operation. <p> {@link GetAppInstall#initialize(com.google.api.client.googleapis.services.Abstra
     * ctGoogleClientRequest)} must be called to initialize this instance immediately after invoking
     * the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected GetAppInstall(java.lang.String id) {
      super(Appinstallendpoint.this, "GET", REST_PATH, null, com.rafali.flickruploader.appinstallendpoint.model.AppInstall.class);
      this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public GetAppInstall setAlt(java.lang.String alt) {
      return (GetAppInstall) super.setAlt(alt);
    }

    @Override
    public GetAppInstall setFields(java.lang.String fields) {
      return (GetAppInstall) super.setFields(fields);
    }

    @Override
    public GetAppInstall setKey(java.lang.String key) {
      return (GetAppInstall) super.setKey(key);
    }

    @Override
    public GetAppInstall setOauthToken(java.lang.String oauthToken) {
      return (GetAppInstall) super.setOauthToken(oauthToken);
    }

    @Override
    public GetAppInstall setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (GetAppInstall) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public GetAppInstall setQuotaUser(java.lang.String quotaUser) {
      return (GetAppInstall) super.setQuotaUser(quotaUser);
    }

    @Override
    public GetAppInstall setUserIp(java.lang.String userIp) {
      return (GetAppInstall) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String id;

    /**

     */
    public java.lang.String getId() {
      return id;
    }

    public GetAppInstall setId(java.lang.String id) {
      this.id = id;
      return this;
    }

    @Override
    public GetAppInstall set(String parameterName, Object value) {
      return (GetAppInstall) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "insertAppInstall".
   *
   * This request holds the parameters needed by the the appinstallendpoint server.  After setting any
   * optional parameters, call the {@link InsertAppInstall#execute()} method to invoke the remote
   * operation.
   *
   * @param content the {@link com.rafali.flickruploader.appinstallendpoint.model.AppInstall}
   * @return the request
   */
  public InsertAppInstall insertAppInstall(com.rafali.flickruploader.appinstallendpoint.model.AppInstall content) throws java.io.IOException {
    InsertAppInstall result = new InsertAppInstall(content);
    initialize(result);
    return result;
  }

  public class InsertAppInstall extends AppinstallendpointRequest<com.rafali.flickruploader.appinstallendpoint.model.AppInstall> {

    private static final String REST_PATH = "appinstall";

    /**
     * Create a request for the method "insertAppInstall".
     *
     * This request holds the parameters needed by the the appinstallendpoint server.  After setting
     * any optional parameters, call the {@link InsertAppInstall#execute()} method to invoke the
     * remote operation. <p> {@link InsertAppInstall#initialize(com.google.api.client.googleapis.servi
     * ces.AbstractGoogleClientRequest)} must be called to initialize this instance immediately after
     * invoking the constructor. </p>
     *
     * @param content the {@link com.rafali.flickruploader.appinstallendpoint.model.AppInstall}
     * @since 1.13
     */
    protected InsertAppInstall(com.rafali.flickruploader.appinstallendpoint.model.AppInstall content) {
      super(Appinstallendpoint.this, "POST", REST_PATH, content, com.rafali.flickruploader.appinstallendpoint.model.AppInstall.class);
    }

    @Override
    public InsertAppInstall setAlt(java.lang.String alt) {
      return (InsertAppInstall) super.setAlt(alt);
    }

    @Override
    public InsertAppInstall setFields(java.lang.String fields) {
      return (InsertAppInstall) super.setFields(fields);
    }

    @Override
    public InsertAppInstall setKey(java.lang.String key) {
      return (InsertAppInstall) super.setKey(key);
    }

    @Override
    public InsertAppInstall setOauthToken(java.lang.String oauthToken) {
      return (InsertAppInstall) super.setOauthToken(oauthToken);
    }

    @Override
    public InsertAppInstall setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (InsertAppInstall) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public InsertAppInstall setQuotaUser(java.lang.String quotaUser) {
      return (InsertAppInstall) super.setQuotaUser(quotaUser);
    }

    @Override
    public InsertAppInstall setUserIp(java.lang.String userIp) {
      return (InsertAppInstall) super.setUserIp(userIp);
    }

    @Override
    public InsertAppInstall set(String parameterName, Object value) {
      return (InsertAppInstall) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "listAppInstall".
   *
   * This request holds the parameters needed by the the appinstallendpoint server.  After setting any
   * optional parameters, call the {@link ListAppInstall#execute()} method to invoke the remote
   * operation.
   *
   * @return the request
   */
  public ListAppInstall listAppInstall() throws java.io.IOException {
    ListAppInstall result = new ListAppInstall();
    initialize(result);
    return result;
  }

  public class ListAppInstall extends AppinstallendpointRequest<com.rafali.flickruploader.appinstallendpoint.model.CollectionResponseAppInstall> {

    private static final String REST_PATH = "appinstall";

    /**
     * Create a request for the method "listAppInstall".
     *
     * This request holds the parameters needed by the the appinstallendpoint server.  After setting
     * any optional parameters, call the {@link ListAppInstall#execute()} method to invoke the remote
     * operation. <p> {@link ListAppInstall#initialize(com.google.api.client.googleapis.services.Abstr
     * actGoogleClientRequest)} must be called to initialize this instance immediately after invoking
     * the constructor. </p>
     *
     * @since 1.13
     */
    protected ListAppInstall() {
      super(Appinstallendpoint.this, "GET", REST_PATH, null, com.rafali.flickruploader.appinstallendpoint.model.CollectionResponseAppInstall.class);
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public ListAppInstall setAlt(java.lang.String alt) {
      return (ListAppInstall) super.setAlt(alt);
    }

    @Override
    public ListAppInstall setFields(java.lang.String fields) {
      return (ListAppInstall) super.setFields(fields);
    }

    @Override
    public ListAppInstall setKey(java.lang.String key) {
      return (ListAppInstall) super.setKey(key);
    }

    @Override
    public ListAppInstall setOauthToken(java.lang.String oauthToken) {
      return (ListAppInstall) super.setOauthToken(oauthToken);
    }

    @Override
    public ListAppInstall setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (ListAppInstall) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public ListAppInstall setQuotaUser(java.lang.String quotaUser) {
      return (ListAppInstall) super.setQuotaUser(quotaUser);
    }

    @Override
    public ListAppInstall setUserIp(java.lang.String userIp) {
      return (ListAppInstall) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String cursor;

    /**

     */
    public java.lang.String getCursor() {
      return cursor;
    }

    public ListAppInstall setCursor(java.lang.String cursor) {
      this.cursor = cursor;
      return this;
    }

    @com.google.api.client.util.Key
    private java.lang.Integer limit;

    /**

     */
    public java.lang.Integer getLimit() {
      return limit;
    }

    public ListAppInstall setLimit(java.lang.Integer limit) {
      this.limit = limit;
      return this;
    }

    @Override
    public ListAppInstall set(String parameterName, Object value) {
      return (ListAppInstall) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "removeAppInstall".
   *
   * This request holds the parameters needed by the the appinstallendpoint server.  After setting any
   * optional parameters, call the {@link RemoveAppInstall#execute()} method to invoke the remote
   * operation.
   *
   * @param id
   * @return the request
   */
  public RemoveAppInstall removeAppInstall(java.lang.String id) throws java.io.IOException {
    RemoveAppInstall result = new RemoveAppInstall(id);
    initialize(result);
    return result;
  }

  public class RemoveAppInstall extends AppinstallendpointRequest<com.rafali.flickruploader.appinstallendpoint.model.AppInstall> {

    private static final String REST_PATH = "appinstall/{id}";

    /**
     * Create a request for the method "removeAppInstall".
     *
     * This request holds the parameters needed by the the appinstallendpoint server.  After setting
     * any optional parameters, call the {@link RemoveAppInstall#execute()} method to invoke the
     * remote operation. <p> {@link RemoveAppInstall#initialize(com.google.api.client.googleapis.servi
     * ces.AbstractGoogleClientRequest)} must be called to initialize this instance immediately after
     * invoking the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected RemoveAppInstall(java.lang.String id) {
      super(Appinstallendpoint.this, "DELETE", REST_PATH, null, com.rafali.flickruploader.appinstallendpoint.model.AppInstall.class);
      this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }

    @Override
    public RemoveAppInstall setAlt(java.lang.String alt) {
      return (RemoveAppInstall) super.setAlt(alt);
    }

    @Override
    public RemoveAppInstall setFields(java.lang.String fields) {
      return (RemoveAppInstall) super.setFields(fields);
    }

    @Override
    public RemoveAppInstall setKey(java.lang.String key) {
      return (RemoveAppInstall) super.setKey(key);
    }

    @Override
    public RemoveAppInstall setOauthToken(java.lang.String oauthToken) {
      return (RemoveAppInstall) super.setOauthToken(oauthToken);
    }

    @Override
    public RemoveAppInstall setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (RemoveAppInstall) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public RemoveAppInstall setQuotaUser(java.lang.String quotaUser) {
      return (RemoveAppInstall) super.setQuotaUser(quotaUser);
    }

    @Override
    public RemoveAppInstall setUserIp(java.lang.String userIp) {
      return (RemoveAppInstall) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String id;

    /**

     */
    public java.lang.String getId() {
      return id;
    }

    public RemoveAppInstall setId(java.lang.String id) {
      this.id = id;
      return this;
    }

    @Override
    public RemoveAppInstall set(String parameterName, Object value) {
      return (RemoveAppInstall) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "updateAppInstall".
   *
   * This request holds the parameters needed by the the appinstallendpoint server.  After setting any
   * optional parameters, call the {@link UpdateAppInstall#execute()} method to invoke the remote
   * operation.
   *
   * @param content the {@link com.rafali.flickruploader.appinstallendpoint.model.AppInstall}
   * @return the request
   */
  public UpdateAppInstall updateAppInstall(com.rafali.flickruploader.appinstallendpoint.model.AppInstall content) throws java.io.IOException {
    UpdateAppInstall result = new UpdateAppInstall(content);
    initialize(result);
    return result;
  }

  public class UpdateAppInstall extends AppinstallendpointRequest<com.rafali.flickruploader.appinstallendpoint.model.AppInstall> {

    private static final String REST_PATH = "appinstall";

    /**
     * Create a request for the method "updateAppInstall".
     *
     * This request holds the parameters needed by the the appinstallendpoint server.  After setting
     * any optional parameters, call the {@link UpdateAppInstall#execute()} method to invoke the
     * remote operation. <p> {@link UpdateAppInstall#initialize(com.google.api.client.googleapis.servi
     * ces.AbstractGoogleClientRequest)} must be called to initialize this instance immediately after
     * invoking the constructor. </p>
     *
     * @param content the {@link com.rafali.flickruploader.appinstallendpoint.model.AppInstall}
     * @since 1.13
     */
    protected UpdateAppInstall(com.rafali.flickruploader.appinstallendpoint.model.AppInstall content) {
      super(Appinstallendpoint.this, "PUT", REST_PATH, content, com.rafali.flickruploader.appinstallendpoint.model.AppInstall.class);
    }

    @Override
    public UpdateAppInstall setAlt(java.lang.String alt) {
      return (UpdateAppInstall) super.setAlt(alt);
    }

    @Override
    public UpdateAppInstall setFields(java.lang.String fields) {
      return (UpdateAppInstall) super.setFields(fields);
    }

    @Override
    public UpdateAppInstall setKey(java.lang.String key) {
      return (UpdateAppInstall) super.setKey(key);
    }

    @Override
    public UpdateAppInstall setOauthToken(java.lang.String oauthToken) {
      return (UpdateAppInstall) super.setOauthToken(oauthToken);
    }

    @Override
    public UpdateAppInstall setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (UpdateAppInstall) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public UpdateAppInstall setQuotaUser(java.lang.String quotaUser) {
      return (UpdateAppInstall) super.setQuotaUser(quotaUser);
    }

    @Override
    public UpdateAppInstall setUserIp(java.lang.String userIp) {
      return (UpdateAppInstall) super.setUserIp(userIp);
    }

    @Override
    public UpdateAppInstall set(String parameterName, Object value) {
      return (UpdateAppInstall) super.set(parameterName, value);
    }
  }

  /**
   * Builder for {@link Appinstallendpoint}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
    }

    /** Builds a new instance of {@link Appinstallendpoint}. */
    @Override
    public Appinstallendpoint build() {
      return new Appinstallendpoint(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link AppinstallendpointRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setAppinstallendpointRequestInitializer(
        AppinstallendpointRequestInitializer appinstallendpointRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(appinstallendpointRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}