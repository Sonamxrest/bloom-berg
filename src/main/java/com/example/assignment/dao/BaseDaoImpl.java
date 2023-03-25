package com.example.assignment.dao;

import com.example.assignment.repo.BaseRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class BaseDaoImpl<T, ID>  implements BaseDao<T,ID>{

    private final BaseRepository<T, ID> repository;


    @Override
    public T findOne(ID id) {
        return repository.findById(id).get();
    }

    @Override
    public List<T> findAll() {
        return repository.findAll();
    }

    @Override
    public void delete(ID id) {
        repository.deleteById(id);
    }

    @Override
    public T save(T t) {
        return repository.save(t);
    }
}
