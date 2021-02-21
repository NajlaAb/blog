package com.infinitymanagement.blog.repository;

import com.infinitymanagement.blog.model.Status;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StatusRepository extends CrudRepository<Status, String> {
    /**
     * Find Status list created by given user
     * @param createdBy User ID
     * @return Status list
     */
    List<Status> findByCreatedBy(String createdBy);
}
