package com.status.statusApi.service;

import com.status.statusApi.models.Comment;
import com.status.statusApi.models.Status;
import com.status.statusApi.repository.StatusRepository;
import com.status.statusApi.request.GetCommentRequest;
import com.status.statusApi.request.GetStatusRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatusService {
    @Autowired
    private StatusRepository statusRepository;

    public List<Status> getAllStatus() {
       return statusRepository.findAll();
    }

    public void addStatus(Status status) {
       statusRepository.save(status);
    }

    public List<Status> getStatusByUserName(GetStatusRequest request) {
        return statusRepository.findByUserName(request.getUserName(),
                PageRequest.of(request.getPageNumber(),request.getPageSize()));
    }

    public void addComment(GetCommentRequest commentRequest) {
        String statusId = commentRequest.getStatusId();
        Status status = statusRepository.findById(statusId).get();
        status.getComments().add(new Comment(commentRequest.getUserName(),commentRequest.getText()));
        statusRepository.save(status);
    }
}
