package com.infinitymanagement.blog.service;


import com.infinitymanagement.blog.model.Status;

import java.util.List;
import java.util.Optional;

public interface StatusService {
    /**
     * Find status By Id
     * @param id    Status ID
     * @return  Status
     */
    Optional<Status> findById(String id);

    /**
     * Find status list created by given user
     * @param createdBy    User Id
     * @return status list
     */
    List<Status> findByCreatedById(String createdBy);

    /**
     * Find All status
     * @return status list
     */
    List<Status> findAll();

    /**
     * Save status
     * @param status   Status
     * @return Status
     */
    Status save(Status status);

    /**
     * Delete status
     * @param status    Status
     */
    void delete(Status status);
}
