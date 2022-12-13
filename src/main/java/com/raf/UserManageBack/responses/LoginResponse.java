package com.raf.UserManageBack.responses;

import com.raf.UserManageBack.models.Permission;

import java.util.List;

public class LoginResponse {
    private String jwt;
    private List<Permission> permissionList;

    public LoginResponse(String jwt, List<Permission> permissionList) {
        this.jwt = jwt;
        this.permissionList = permissionList;
    }

    public String getJwt() {
        return jwt;
    }

    public List<Permission> getPermissionList() {
        return permissionList;
    }
}
