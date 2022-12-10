package com.raf.UserManageBack.bootstrap;

import com.raf.UserManageBack.models.Permission;
import com.raf.UserManageBack.models.User;
import com.raf.UserManageBack.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BootstrapData implements CommandLineRunner {

    private final UserRepository userRepository;

    private final PasswordEncoder passwordEncoder;

    @Autowired
    public BootstrapData(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void run(String... args) {

        System.out.println("Loading Data...");

        User user1 = new User();
        List<Permission> user1PermissionList = new ArrayList<>();
        user1PermissionList.add(Permission.CAN_READ_USERS);
        user1PermissionList.add(Permission.CAN_CREATE_USERS);
        user1PermissionList.add(Permission.CAN_UPDATE_USERS);
        user1PermissionList.add(Permission.CAN_DELETE_USERS);
        user1.setFirstname("User1");
        user1.setLastname("Useric1");
        user1.setEmail("user1@gmail.com");
        user1.setPassword(this.passwordEncoder.encode("user1"));
        user1.setPermissionList(user1PermissionList);
        this.userRepository.save(user1);

        User user2 = new User();
        List<Permission> user2PermissionList = new ArrayList<>();
        user2PermissionList.add(Permission.CAN_READ_USERS);
        user2PermissionList.add(Permission.CAN_CREATE_USERS);
        user2.setFirstname("User2");
        user2.setLastname("Useric2");
        user2.setEmail("user2@gmail.com");
        user2.setPassword(this.passwordEncoder.encode("user2"));
        user2.setPermissionList(user2PermissionList);
        this.userRepository.save(user2);

        User user3 = new User();
        List<Permission> user3PermissionList = new ArrayList<>();
        user3PermissionList.add(Permission.CAN_READ_USERS);
        user3PermissionList.add(Permission.CAN_CREATE_USERS);
        user3PermissionList.add(Permission.CAN_UPDATE_USERS);
        user3.setFirstname("User3");
        user3.setLastname("Useric3");
        user3.setEmail("user3@gmail.com");
        user3.setPassword(this.passwordEncoder.encode("user3"));
        user3.setPermissionList(user3PermissionList);
        this.userRepository.save(user3);

        System.out.println("Data loaded!");
    }
}
