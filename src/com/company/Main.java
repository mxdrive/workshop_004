package com.company;

public class Main {

    //Написать программу, которая позволяет вычислять площадь треугольника по координатам трех его вершин.
    //У вас должен быть класс Точка, в котором будут храниться координаты и метод вывода их на экран. И должен быть
    // класс Треугольник, в котором будут храниться вершины. И будет метод вычисления площади, а также конструктор
    // с параметрами, чтобы передать точки.

    public static void main(String[] args) {
        //create three Points()
        //send Points() to Triangle()
        int[] a1 = {3, 2}; //x1, y1
        int[] a2 = {7, 5}; //x2, y2
        int[] a3 = {0, 0};
        Triangle triangle = new Triangle();
        System.out.println(triangle.calculate(a1, a2, a3));
    }
}
