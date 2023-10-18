package com.hcm.payroll.Infrastructure.Repositories;

import com.hcm.payroll.Core.Domain.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface UserRepositoryJPA extends JpaRepository<User, Long> {
}