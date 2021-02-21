package com.infinitymanagement.blog.service;

import com.infinitymanagement.blog.model.Comment;

import java.util.List;
import java.util.Optional;

public interface CommentService {
    /**
     * Find Comment By Id
     * @param id    Comment ID
     * @return  Comment
     */
    Optional<Comment> findById(String id);

    /**
     * Find comments list created by given user
     * @param createdBy    User Id
     * @return comments list
     */
    List<Comment> findByCreatedById(String createdBy);

    /**
     * Find All Comments
     * @return comments list
     */
    List<Comment> findAll();

    /**
     * Save comment
     * @param comment   Comment
     * @return Comment
     */
    Comment save(Comment comment);

    /**
     * Delete comment
     * @param comment    Comment
     */
    void delete(Comment comment);
}
