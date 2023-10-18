package com.hcm.payroll.Core.Application;

import com.hcm.payroll.Core.Domain.Entities.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IAplicationService {
    User createUser(User user);

    User getUserById(Long id);
    List<User> getAllUsers();
    User updateUser(User user);
    void deleteUser(Long id);
}
