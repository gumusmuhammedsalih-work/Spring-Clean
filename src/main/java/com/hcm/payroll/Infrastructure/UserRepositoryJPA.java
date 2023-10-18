package com.hcm.payroll.Infrastructure;

import com.hcm.payroll.Core.Domain.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositoryJPA extends JpaRepository<User, Long> {
}