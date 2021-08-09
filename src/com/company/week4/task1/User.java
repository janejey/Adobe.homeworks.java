package com.company.week4.task1;

public class User {
    final String firstName;
    final String lastName;
    final String username;
    final String email;

    public User(String firstName, String lastName, String username, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.email = email;
    }
    private User(User object) {
        this(object.firstName, object.lastName, object.username, object.email);
    }
    public User copy () {
        return new User(this);
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static void main(String[] args) {
        User user1 = new User("a", "b", "c", "d");
        User user2 = user1.copy();
        User user3 = new User("q", "w", "e", "r");
        UserGroup users = new UserGroup();
        users.addUser(user1);
        users.addUser(user2);
        users.addUser(user3);
        UserGroup clonedUsers = users.clone();
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(users);
        System.out.println(clonedUsers);
    }
}
