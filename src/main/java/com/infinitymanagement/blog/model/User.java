package com.infinitymanagement.blog.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "user")
public class User {
    /**
     * User ID
     */
    private String id;

    /**
     * User Name
     */
    private String name;

}
