package com.infinitymanagement.blog.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "status")
public class Status {
    /**
     * Status ID
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
     * Status Content
     */
    private String status;
}
