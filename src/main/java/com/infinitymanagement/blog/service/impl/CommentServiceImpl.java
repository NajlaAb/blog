package com.infinitymanagement.blog.service.impl;

import com.infinitymanagement.blog.model.Comment;
import com.infinitymanagement.blog.repository.CommentRepository;
import com.infinitymanagement.blog.service.CommentService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CommentServiceImpl implements CommentService {

    /**
     * Comment Repository
     */
    private final CommentRepository commentRepository;

    public CommentServiceImpl(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    /**
     * {@inheritDoc}
     * @return
     */
    @Override
    public Optional<Comment> findById(String id) {
        return commentRepository.findById(id);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Comment> findByCreatedById(String createdBy) {
        return commentRepository.findByCreatedBy(createdBy);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Comment> findAll() {
        List<Comment> comments = new ArrayList<>();
        commentRepository.findAll().forEach(comments::add);
        return comments;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Comment save(Comment comment) {
        return commentRepository.save(comment);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void delete(Comment comment) {
        commentRepository.delete(comment);
    }
}
