package ru.blinov.hw1.builder;

public class Main {
    public static void main(String[] args) {
        Generator generator = new Generator();
        PersonBuilder personBuilder = new PersonBuilder();
        generator.generatePerson(personBuilder);

        Person person = personBuilder.getPerson();
        System.out.println(person);
    }

}
