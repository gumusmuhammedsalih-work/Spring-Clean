package com.hcm.payroll.Core.Application;

import com.hcm.payroll.Core.Domain.Entities.User;

import java.util.List;
import java.util.Optional;

public interface IRepository {
    User save(User user);
    Optional<User> findById(Long id);
    List<User> findAll();
    void deleteById(Long id);
}
