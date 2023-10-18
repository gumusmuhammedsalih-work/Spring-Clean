package com.hcm.payroll.Core.Application;

import com.hcm.payroll.Core.Domain.Entities.User;

import java.util.List;

public interface IAplicationService {
    User createUser(User user);

    User getUserById(Long id);
    List<User> getAllUsers();
    User updateUser(User user);
    void deleteUser(Long id);
}
