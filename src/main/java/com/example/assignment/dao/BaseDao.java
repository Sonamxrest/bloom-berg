package com.example.assignment.dao;

import org.springframework.dao.OptimisticLockingFailureException;

import java.util.List;

public interface BaseDao<T, ID>{

    T findOne(ID id) throws IllegalArgumentException;

    List<T> findAll();

    void delete(ID id);

    T save(T t) throws IllegalArgumentException, OptimisticLockingFailureException;

}
