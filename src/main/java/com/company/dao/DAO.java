package com.company.dao;

import com.company.entity.Users;

public interface DAO {
    public Users getUser(long id);
    public String addUser(Users users);
    public String deleteUser(long id);
    public String updateUser(long id, Users users);
}
