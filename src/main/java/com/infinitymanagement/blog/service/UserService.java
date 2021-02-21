package com.infinitymanagement.blog.service;


import com.infinitymanagement.blog.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    /**
     * Find User By Id
     * @param id    User ID
     * @return  User
     */
    Optional<User> findById(String id);

    /**
     * Find All users
     * @return users list
     */
    List<User> findAll();

    /**
     * Save user
     * @param user   user
     * @return User
     */
    User save(User user);

    /**
     * Delete user
     * @param user    user
     */
    void delete(User user);
}
