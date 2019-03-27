package ru.blinov.hw1.builder;

public class PersonBuilder implements Builder {
    private Name name;
    private Address address;
    private String phone;
    private int age;
    private String gender;

    @Override
    public void setName(Name name) {
        this.name = name;
    }

    @Override
    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }

    public Person getPerson() {
        return new Person(name, address, phone, age, gender);
    }
}
