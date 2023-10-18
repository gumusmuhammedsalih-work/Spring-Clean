package com.hcm.payroll.Core.Domain;

import com.hcm.payroll.Core.Domain.Entities.User;

public interface IDomainService {
    boolean validateUser(User user);
}
