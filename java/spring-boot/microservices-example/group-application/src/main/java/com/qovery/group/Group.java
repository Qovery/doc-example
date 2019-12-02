package com.qovery.group;

import java.util.List;

/**
 * Created by evoxmusic on 02/12/2019.
 */
public class Group {

    private String name;
    private List<User> users;

    public Group() {
    }

    public Group(String name, List<User> users) {
        this.name = name;
        this.users = users;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

}
