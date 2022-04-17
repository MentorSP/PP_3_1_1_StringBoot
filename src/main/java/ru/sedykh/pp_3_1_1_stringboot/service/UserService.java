package ru.sedykh.pp_3_1_1_stringboot.service;

import ru.sedykh.pp_3_1_1_stringboot.models.User;

import java.util.List;

public interface UserService {
    public List<User> index();
    public User showUser(Long id);
    public void save(User user);
    public void update(Long id, User user);
    public void delete(Long id);
}
