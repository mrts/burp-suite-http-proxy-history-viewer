package com.github.mrts.burpsuitehistoryviewer.model;

public class HttpLogItem {

    private String time;
    private String url;
    private String host;
    private String port;
    private String protocol;
    private String method;
    private String path;
    private String extension;
    private String request;
    private String status;
    private String responselength;
    private String mimetype;
    private String response;
    private String comment;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getResponselength() {
        return responselength;
    }

    public void setResponselength(String responselength) {
        this.responselength = responselength;
    }

    public String getMimetype() {
        return mimetype;
    }

    public void setMimetype(String mimetype) {
        this.mimetype = mimetype;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        HttpLogItem httpLogItem = (HttpLogItem) o;

        if (!time.equals(httpLogItem.time))
            return false;
        if (!url.equals(httpLogItem.url))
            return false;
        if (!host.equals(httpLogItem.host))
            return false;
        if (!port.equals(httpLogItem.port))
            return false;
        if (!protocol.equals(httpLogItem.protocol))
            return false;
        if (!method.equals(httpLogItem.method))
            return false;
        if (!path.equals(httpLogItem.path))
            return false;
        if (extension != null ? !extension.equals(httpLogItem.extension) : httpLogItem.extension != null)
            return false;
        if (!request.equals(httpLogItem.request))
            return false;
        if (!status.equals(httpLogItem.status))
            return false;
        if (!responselength.equals(httpLogItem.responselength))
            return false;
        if (mimetype != null ? !mimetype.equals(httpLogItem.mimetype) : httpLogItem.mimetype != null)
            return false;
        if (!response.equals(httpLogItem.response))
            return false;
        return comment != null ? comment.equals(httpLogItem.comment) : httpLogItem.comment == null;
    }

    @Override
    public int hashCode() {
        int result = time.hashCode();
        result = 31 * result + url.hashCode();
        result = 31 * result + host.hashCode();
        result = 31 * result + port.hashCode();
        result = 31 * result + protocol.hashCode();
        result = 31 * result + method.hashCode();
        result = 31 * result + path.hashCode();
        result = 31 * result + (extension != null ? extension.hashCode() : 0);
        result = 31 * result + request.hashCode();
        result = 31 * result + status.hashCode();
        result = 31 * result + responselength.hashCode();
        result = 31 * result + (mimetype != null ? mimetype.hashCode() : 0);
        result = 31 * result + response.hashCode();
        result = 31 * result + (comment != null ? comment.hashCode() : 0);
        return result;
    }
}
