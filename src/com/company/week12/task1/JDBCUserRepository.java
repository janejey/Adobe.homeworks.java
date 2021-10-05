package com.company.week12.task1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUserRepository implements UserRepository {
    private final String url;
    private final String username;
    private final String password;

    public JDBCUserRepository(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }


    @Override
    public void save(User user) {
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            statement.execute("insert into users (name, surname, gender, age) values (' " + user.getName() + "'," + user.getSurname() + "', '" + user.getGender() + "', ' " + user.getAge() + ")");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        {

        }

    }

    @Override
    public void deleteAll() {
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            statement.execute("delete from users;");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        ;
        {
        }


    }
}
