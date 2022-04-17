package ru.sedykh.pp_3_1_1_stringboot.repository;


import ru.sedykh.pp_3_1_1_stringboot.models.User;

import java.util.List;

public interface UserDao {
    List<User> index();
    User showUser(Long id);
    void save(User user);
    void update(Long id, User user);
    void delete(Long id);
}
