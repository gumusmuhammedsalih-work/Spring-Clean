package com.hcm.payroll.Presentation;


import com.hcm.payroll.Core.Application.IAplicationService;
import com.hcm.payroll.Core.Domain.Entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class ApiController {

    private final IAplicationService applicationService;

    @Autowired
    public ApiController(IAplicationService applicationService) {
        this.applicationService = applicationService;
    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User createdUser = applicationService.createUser(user);
        return ResponseEntity.ok(createdUser);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id) {
        User user = applicationService.getUserById(id);
        if (user == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(user);
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = applicationService.getAllUsers();
        return ResponseEntity.ok(users);
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@PathVariable Long id,@RequestBody User user) {
        User existingUser = applicationService.getUserById(id);
        if (existingUser == null) {
            return ResponseEntity.notFound().build();
        }
        user.setId(id); // Ensure the ID is set on the updated user
        User updatedUser = applicationService.updateUser(user);
        return ResponseEntity.ok(updatedUser);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        User existingUser = applicationService.getUserById(id);
        if (existingUser == null) {
            return ResponseEntity.notFound().build();
        }
        applicationService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }
}