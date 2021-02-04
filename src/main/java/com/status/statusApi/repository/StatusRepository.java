package com.status.statusApi.repository;

import com.status.statusApi.models.Status;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StatusRepository extends MongoRepository<Status, String> {
    List<Status> findByUserName(String userName, PageRequest pageRequest);

}
