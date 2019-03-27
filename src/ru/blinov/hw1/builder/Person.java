package ru.blinov.hw1.builder;

public class Person {
    private Name name;
    private Address address;
    private String phone;
    private int age;
    private String gender;

    public Person(Name name, Address address, String phone, int age, String gender) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.age = age;
        this.gender = gender;
    }

    public Name getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name=" + name +
                ", address=" + address +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
