package com.codeclan.example.filesservice.respository;

import com.codeclan.example.filesservice.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
