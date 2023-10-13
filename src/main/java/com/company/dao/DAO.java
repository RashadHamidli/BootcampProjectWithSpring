package com.company.dao;

import com.company.entity.User;

public interface DAO {
    public User getUser(long id);
    public String addUser(User user);
    public String deleteUser(long id);
    public String updateUser(long id,User user);
}
