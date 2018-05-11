package com.company;

class Point {
    private int p1;
    private int p2;

    Point(int p1, int p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    int getPoint1() {
        return p1;
    }

    int getPoint2() {
        return p2;
    }

    void printPoints(int index) {
        System.out.print("Point " + index + ": ");
        System.out.println(p1 + ", " + p2);
    }
}
