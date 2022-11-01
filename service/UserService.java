package com.example.demo.service;

import com.example.demo.Domain.AppUser;
import com.example.demo.Domain.Role;
//import org.apache.catalina.User;

import java.util.List;

public interface UserService {
    AppUser saveUser(AppUser user);
    Role saveRole(Role role);

    void addRoleToUser(String username,String roleName);

    AppUser getUser(String username);

    List<AppUser> getUser();
}
