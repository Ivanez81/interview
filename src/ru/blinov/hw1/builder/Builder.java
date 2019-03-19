package ru.blinov.hw1.builder;

public interface PersonBuilder {

    void setName(Name name);
    void setAddress(Address address);
    void setPhone(String phone);
    void setAge(int age);
    void setGender(String gender);

}
