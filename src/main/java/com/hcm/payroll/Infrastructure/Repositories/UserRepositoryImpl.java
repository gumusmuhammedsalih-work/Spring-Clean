package com.hcm.payroll.Infrastructure.Repositories;

import com.hcm.payroll.Core.Domain.Repositories.IUserRepository;
import com.hcm.payroll.Core.Domain.Entities.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;


public class UserRepositoryImpl implements IUserRepository {

    private final UserRepositoryJPA userRepositoryJPA;

    @Autowired
    public UserRepositoryImpl(UserRepositoryJPA userRepositoryJPA) {
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