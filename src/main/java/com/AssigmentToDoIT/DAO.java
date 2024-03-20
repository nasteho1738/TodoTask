package com.AssigmentToDoIT;

import java.util.Collection;

public interface DAO<T>{
    T persit(T t);
    T findById(int id);
    Collection<T> findAll();
    void remove(int id);
}
