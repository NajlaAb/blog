package com.infinitymanagement.blog.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "comment")
public class Comment {
    /**
     * Comment ID
     */
    private String id;

    /**
     * Created By ID
     */
    private String createdBy;

    /**
     * Date
     */
    private Date date;

    /**
     * Comment Content
     */
    private String comment;
}
