package com.status.statusApi.controller;

import com.status.statusApi.models.Status;
import com.status.statusApi.request.GetCommentRequest;
import com.status.statusApi.request.GetStatusRequest;
import com.status.statusApi.service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StatusController {
    @Autowired
    StatusService statusService;

    @RequestMapping(method = RequestMethod.POST, value = "/status")
    public void addStatus(@RequestBody Status status) {
        statusService.addStatus(status);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/status")
    public List<Status> getStatusByUserName(@RequestBody GetStatusRequest request) {
        return statusService.getStatusByUserName(request);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/status/comment")
    public void addComment(@RequestBody GetCommentRequest commentRequest) {
         statusService.addComment(commentRequest);
    }
}