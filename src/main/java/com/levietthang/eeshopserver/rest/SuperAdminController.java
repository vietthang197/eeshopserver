package com.levietthang.eeshopserver.rest;

import com.levietthang.eeshopserver.entities.Role;
import com.levietthang.eeshopserver.entities.User;
import com.levietthang.eeshopserver.services.CustomUserService;
import com.levietthang.eeshopserver.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@ComponentScan(basePackages = {"com.levietthang.eeshopserver", "com.levietthang.eeshopserver.rest"})
@RequestMapping("/api/role")
public class SuperAdminController {

    @Autowired
    private RoleService roleService;

    @Autowired
    private CustomUserService userService;

    @PostMapping("/create")
    public Role insertRole(@RequestBody Role role) {
        return roleService.createRole(role);
    }

    @PutMapping("/set-admin-role")
    public User setAdminRole(@RequestBody User user) {
        return userService.setAdminRole(user);
    }
}
