package com.company;

class Triangle {
    private Point point1;
    private Point point2;
    private Point point3;

    Triangle(Point point1, Point point2, Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    double calculate() {
        double square = 0.5 * (((point1.getPoint2() - point3.getPoint2()) * (point2.getPoint1() - point3.getPoint1()))
                - ((point1.getPoint1() - point3.getPoint1()) * (point2.getPoint2() - point3.getPoint2())));
        if (square < 0) square *= -1;
        return square;
    }

    void showPoints() {
        point1.printPoints(1);
        point2.printPoints(2);
        point3.printPoints(3);
    }
}
