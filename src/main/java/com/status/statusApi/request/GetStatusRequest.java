package com.status.statusApi.request;

public class GetStatusRequest {
    String userName;
    Integer pageSize;
    Integer pageNumber;

    public GetStatusRequest(String userName, Integer pageSize, Integer pageNumber) {
        this.userName = userName;
        this.pageSize = pageSize;
        this.pageNumber = pageNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserId(String userName) {
        this.userName = userName;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }
}
