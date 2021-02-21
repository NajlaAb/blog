package com.infinitymanagement.blog.service.impl;

import com.infinitymanagement.blog.model.Status;
import com.infinitymanagement.blog.repository.StatusRepository;
import com.infinitymanagement.blog.service.StatusService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StatusServiceImpl implements StatusService {
    /**
     * Status Repository
     */
    private final StatusRepository statusRepository;

    public StatusServiceImpl(StatusRepository statusRepository) {
        this.statusRepository = statusRepository;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Optional<Status> findById(String id) {
        return statusRepository.findById(id);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Status> findByCreatedById(String createdBy) {
        return statusRepository.findByCreatedBy(createdBy);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Status> findAll() {
        List<Status> statusList = new ArrayList<>();
        statusRepository.findAll().forEach(statusList::add);
        return statusList;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Status save(Status status) {
        return statusRepository.save(status);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void delete(Status status) {
        statusRepository.delete(status);
    }
}
