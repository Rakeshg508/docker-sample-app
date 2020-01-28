package com.myexample.docker.services;

import com.myexample.docker.models.User;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

@Service
public class UserService {

    private List<User> users;

    @PostConstruct
    public void init() {
        users = new ArrayList<>();

        final User akash = createUser("S01", "Akash", "Oist", "Electronics & Telecommunications", 29);
        final User piyush = createUser("S02", "Piyush", "Bist", "Information Technology", 30);
        users.add(akash);
        users.add(piyush);
    }

    private User createUser(String id, String name, String collegeName, String departmentName, int age) {
        final User user = new User();
        user.setId(id);
        user.setName(name);
        user.setCollegeName(collegeName);
        user.setAge(age);
        user.setDepartmentName(departmentName);
        return user;
    }

    public List<User> getUsers() {
        return users;
    }
}
