package com.infinitymanagement.blog.repository;

import com.infinitymanagement.blog.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {
}
