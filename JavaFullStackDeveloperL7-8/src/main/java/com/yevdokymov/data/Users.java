package com.yevdokymov.data;

import com.yevdokymov.data.User;

import java.util.List;

public class Users {
    private final List<User> users = List.of( new User("Adam","adamSM","123"),
            new User("Smith","joiner","341233"),
            new User("Liam","lmSoN","992387"),
            new User("Ky","ioLHD","7463"),
            new User("Jonny","smtOut","00000"),
            new User("Fiona","metro","17635"));

    public List<User> getUsers() {
        return users;
    }
}
