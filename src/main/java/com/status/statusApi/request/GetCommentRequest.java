package com.status.statusApi.request;

public class GetCommentRequest {
    String statusId;
    String userName;
    String text;

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public GetCommentRequest(String statusId, String userName, String text) {
        this.statusId = statusId;
        this.userName = userName;
        this.text = text;
    }
}
