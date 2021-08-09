package com.company.week4.task1;

import java.util.Arrays;

public class UserGroup{
    final User[] userList;
    int index;
    public UserGroup () {
        userList = new User[10];
        index = -1;
    }
    public void addUser(User object) {
        index++;
        if(index >= 10) {
            return;
        }
        userList[index] = object;
    }

    public UserGroup clone () {
        UserGroup users = new UserGroup();
        for(int i = 0; i <= this.index; i++) {
            users.addUser(this.userList[i].copy());
        }
        return users;
    }

    @Override
    public String toString() {
        return "UserGroup{" +
                "userList=" + Arrays.toString(userList) +
                '}';
    }
}
