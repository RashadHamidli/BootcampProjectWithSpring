package com.company.dao;

import com.company.entity.User;

public interface DAO {
    public void getUser();
    public String addUser(User user);
    public String deleteUser(long id);
    public String updateUser(long id);
}
