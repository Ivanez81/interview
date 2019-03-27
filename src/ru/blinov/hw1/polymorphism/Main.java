package ru.blinov.hw1.polymorphism;

public class Main {
    public static void main(String[] args) {
        Square square = new Square();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();

        square.draw();
        circle.draw();
        triangle.draw();
    }
}
