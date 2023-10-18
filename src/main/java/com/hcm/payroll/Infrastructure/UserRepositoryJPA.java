package com.hcm.payroll.Infrastructure;

import com.hcm.payroll.Core.Domain.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;


public interface UserRepositoryJPA extends JpaRepository<User, Long> {
}