package com.hcm.payroll.Core.Application;

import com.hcm.payroll.Core.Domain.Entities.User;
import com.hcm.payroll.Core.Domain.Repositories.IUserRepository;

import java.util.List;
import java.util.Optional;

public class ApplicationServiceImpl implements IAplicationService {
    private final IUserRepository userRepository;

    public ApplicationServiceImpl(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Getter for userRepository
    public IUserRepository getUserRepository() {
        return userRepository;
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUserById(Long id) {
        Optional<User> userOptional = userRepository.findById(id);
        return userOptional.orElse(null);  // if the user is not found, return null
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User updateUser(User user) {
        if(user.getId() == null || !userRepository.findById(user.getId()).isPresent()) {
            return null;  // or you can throw an exception
        }
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}