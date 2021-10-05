package com.company.week12.task1;

public class User {
    public String name;
    public String surname;
    public String gender;
    public int age;

    public User(String name, String surname, String gender, int age) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        if(gender != "female" || gender != "male") {
            throw new IllegalArgumentException("Please write a valid gender");
        }
        else {
            this.gender = gender;
        }
    }
    public int getAge () {
        return age;
    }
    public void setAge (int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
