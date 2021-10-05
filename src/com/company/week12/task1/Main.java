package com.company.week12.task1;

public class Main {
    public static void main(String[] args) {
        User user = new User("a", "b", "female", 20);
        JDBCUserRepository jdbcUserRepository = new JDBCUserRepository(
                "jdbc:postgresql://localhost:5454/aca",
                "username",
                "password"
        );
        jdbcUserRepository.save(user);
        jdbcUserRepository.deleteAll();
    }
}
