package com.infinitymanagement.blog.repository;

import com.infinitymanagement.blog.model.Comment;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CommentRepository extends CrudRepository<Comment, String> {
    /**
     * Find comment list created by given user
     * @param createdBy User ID
     * @return comments list
     */
    List<Comment> findByCreatedBy(String createdBy);
}
