package com.company;

public class Main {

    //Написать программу, которая позволяет вычислять площадь треугольника по координатам трех его вершин.
    //У вас должен быть класс Точка, в котором будут храниться координаты и метод вывода их на экран. И должен быть
    // класс Треугольник, в котором будут храниться вершины. И будет метод вычисления площади, а также конструктор
    // с параметрами, чтобы передать точки.

    public static void main(String[] args) {
        //create three Points()
        //send Points() to Triangle()

        Triangle triangle = new Triangle(new Point(3, 2), new Point(7, 5), new Point(0, 0));
        System.out.println(triangle.calculate());
        triangle.showPoints();
    }
}
