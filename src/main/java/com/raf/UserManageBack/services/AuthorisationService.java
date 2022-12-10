package com.raf.UserManageBack.services;
import com.raf.UserManageBack.models.Permission;
import com.raf.UserManageBack.models.User;
import com.raf.UserManageBack.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorisationService {
    private final UserRepository userRepository;

    @Autowired
    public AuthorisationService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public boolean isAuthorised(Permission requiredPermission, String userEmail) {
        User user = this.userRepository.findByEmail(userEmail);
        return user.getPermissionList().contains(requiredPermission);
    }
}
