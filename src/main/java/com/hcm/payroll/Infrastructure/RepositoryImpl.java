package com.hcm.payroll.Infrastructure;

import com.hcm.payroll.Core.Domain.IRepository;
import com.hcm.payroll.Core.Domain.Entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class RepositoryImpl implements IRepository {

    private final UserRepositoryJPA userRepositoryJPA;

    @Autowired
    public RepositoryImpl(UserRepositoryJPA userRepositoryJPA) {
        this.userRepositoryJPA = userRepositoryJPA;
    }

    @Override
    public User save(User user) {
        return userRepositoryJPA.save(user);
    }

    @Override
    public Optional<User> findById(Long id) {
        return userRepositoryJPA.findById(id);
    }

    @Override
    public List<User> findAll() {
        return userRepositoryJPA.findAll();
    }

    @Override
    public void deleteById(Long id) {
        userRepositoryJPA.deleteById(id);
    }
}