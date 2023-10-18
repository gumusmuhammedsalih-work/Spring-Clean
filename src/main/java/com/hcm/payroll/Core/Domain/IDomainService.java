package com.hcm.payroll.Core.Domain;

import com.hcm.payroll.Core.Domain.Entities.User;
import org.springframework.stereotype.Service;

@Service
public interface IDomainService {
    boolean validateUser(User user);
}
