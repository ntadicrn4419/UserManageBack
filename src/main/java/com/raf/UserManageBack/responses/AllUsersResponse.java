package com.raf.UserManageBack.responses;

import com.raf.UserManageBack.models.User;

import java.util.List;

public class AllUsersResponse {
    private List<User> users;

    public AllUsersResponse(List<User> users){
        this.users = users;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
