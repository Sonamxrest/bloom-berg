package com.example.assignment.model;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.annotation.Version;
import org.springframework.data.jpa.domain.AbstractPersistable;

import java.io.Serializable;
import java.sql.Date;


public class BaseEntity<T extends Serializable> extends AbstractPersistable<T> {

    @Version()
    private int version;

    @CreatedDate()
    private Date createdAt;

    @LastModifiedDate()
    private Date lastModifiedAt;

    @Override
    protected void setId(T id) {
        super.setId(id);
    }
}
