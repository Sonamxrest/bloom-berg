package com.example.assignment.service.serviceImpl;

import com.example.assignment.dao.BaseDao;
import com.example.assignment.service.BaseService;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class BaseServiceImpl<T, ID> implements BaseService<T, ID> {

    private final BaseDao<T, ID> baseDao;


    @Override
    public T findOne(ID id) {
        return baseDao.findOne(id);
    }

    @Override
    public List<T> findAll() {
        return baseDao.findAll();
    }

    @Override
    public void delete(ID id) {
        baseDao.delete(id);
    }

    @Override
    public T save(T t) {
        return baseDao.save(t);
    }
}
