package com.example.demo.Repo;

import com.example.demo.Domain.AppUser;
import com.example.demo.Domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<AppUser,Long> {
    AppUser findByUserName(String name);
}
