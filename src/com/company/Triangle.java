package com.company;

public class Triangle extends Point{
    double square;
    static int[] a1 = {3, 2}; //x1, y1
    static int[] a2 = {7, 5}; //x2, y2
    static int[] a3 = {0, 0}; //x3, y3

    Triangle() {
        super(a1, a2, a3);
    }

    double calculate(int[] a1, int[] a2, int[] a3) {
        square = 0.5 * (((a1[1] - a3[1]) * (a2[0] - a3[0])) - ((a1[0] - a3[0]) * (a2[1] - a3[1])));
        if (square < 0) square *= -1;
        return square;
    }
}
