package com.github.mrts.burpsuitehistoryviewer.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.util.Base64;

public class HttpLogItemViewModel {

    private final StringProperty time;
    private final StringProperty url;
    private final StringProperty host;
    private final StringProperty port;
    private final StringProperty protocol;
    private final StringProperty method;
    private final StringProperty path;
    private final StringProperty extension;
    private final StringProperty request;
    private final StringProperty status;
    private final StringProperty responseLength;
    private final StringProperty mimeType;
    private final StringProperty response;
    private final StringProperty comment;

    public HttpLogItemViewModel(HttpLogItem logItem) {
        this.time = new SimpleStringProperty(logItem.getTime());
        this.url = new SimpleStringProperty(logItem.getUrl());
        this.host = new SimpleStringProperty(logItem.getHost());
        this.port = new SimpleStringProperty(logItem.getPort());
        this.protocol = new SimpleStringProperty(logItem.getProtocol());
        this.method = new SimpleStringProperty(logItem.getMethod());
        this.path = new SimpleStringProperty(logItem.getPath());
        this.extension = new SimpleStringProperty(logItem.getExtension());
        this.request = new SimpleStringProperty(base64Decode(logItem.getRequest()));
        this.status = new SimpleStringProperty(logItem.getStatus());
        this.responseLength = new SimpleStringProperty(logItem.getResponselength());
        this.mimeType = new SimpleStringProperty(logItem.getMimetype());
        this.response = new SimpleStringProperty(base64Decode(logItem.getResponse()));
        this.comment = new SimpleStringProperty(logItem.getComment());
    }

    private String base64Decode(String base64) {
        final byte[] decoded = Base64.getDecoder().decode(base64);
        return new String(decoded);
    }

    public String getTime() {
        return time.get();
    }

    public StringProperty timeProperty() {
        return time;
    }

    public String getUrl() {
        return url.get();
    }

    public StringProperty urlProperty() {
        return url;
    }

    public String getProtocol() {
        return protocol.get();
    }

    public StringProperty protocolProperty() {
        return protocol;
    }

    public String getHost() {
        return host.get();
    }

    public StringProperty hostProperty() {
        return host;
    }

    public String getPort() {
        return port.get();
    }

    public StringProperty portProperty() {
        return port;
    }

    public String getMethod() {
        return method.get();
    }

    public StringProperty methodProperty() {
        return method;
    }

    public String getPath() {
        return path.get();
    }

    public StringProperty pathProperty() {
        return path;
    }

    public String getExtension() {
        return extension.get();
    }

    public StringProperty extensionProperty() {
        return extension;
    }

    public String getRequest() {
        return request.get();
    }

    public StringProperty requestProperty() {
        return request;
    }

    public String getStatus() {
        return status.get();
    }

    public StringProperty statusProperty() {
        return status;
    }

    public String getResponseLength() {
        return responseLength.get();
    }

    public StringProperty responseLengthProperty() {
        return responseLength;
    }

    public String getMimeType() {
        return mimeType.get();
    }

    public StringProperty mimeTypeProperty() {
        return mimeType;
    }

    public String getResponse() {
        return response.get();
    }

    public StringProperty responseProperty() {
        return response;
    }

    public String getComment() {
        return comment.get();
    }

    public StringProperty commentProperty() {
        return comment;
    }

}
