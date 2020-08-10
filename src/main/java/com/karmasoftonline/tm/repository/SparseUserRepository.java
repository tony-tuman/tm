package com.karmasoftonline.tm.repository;

import com.karmasoftonline.tm.entity.SparseUser;
import org.springframework.data.repository.Repository;

public interface SparseUserRepository  extends Repository<SparseUser, Integer> {
    public Iterable<SparseUser> findAll();
}
