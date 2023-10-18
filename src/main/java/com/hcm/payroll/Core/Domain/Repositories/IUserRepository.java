package com.hcm.payroll.Core.Domain.Repositories;

import com.hcm.payroll.Core.Domain.Entities.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IUserRepository {
    User save(User user);
    Optional<User> findById(Long id);
    List<User> findAll();
    void deleteById(Long id);
}
