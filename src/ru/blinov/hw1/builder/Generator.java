package ru.blinov.hw1.builder;

public class Generator {

    public void generatePerson(Builder builder) {
        builder.setAddress(new Address("Russia", "Fryazino"));
        builder.setName(new Name("Ivanov", "Ivan", "Ivanovich"));
        builder.setAge(37);
        builder.setGender("male");
        builder.setPhone("+71234567890");
    }

}
