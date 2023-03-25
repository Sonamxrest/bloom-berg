package com.example.assignment.service;

import java.util.List;

public interface BaseService<T,ID> {
    T findOne(ID id);

    List<T> findAll();

    void delete(ID id);

    T save(T t);
}
