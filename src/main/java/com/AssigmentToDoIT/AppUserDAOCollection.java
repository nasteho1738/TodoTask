package com.AssigmentToDoIT;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class AppUserDAOCollection implements DAO {
    private List<AppUserDAOCollection> user = new ArrayList<>();
    @Override
    public Object persit(Object o) {
        return null;
    }

    @Override
    public Object findById(int id) {
        return null;
    }

    @Override
    public Collection findAll() {
        return null;
    }

    @Override
    public void remove(int id) {

    }
}

