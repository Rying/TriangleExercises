package com.tw.twu.java;

public class Triangle {
    public void Easiest() {
        System.out.println("*");
    }

    public void HorizontalLine(int number) {
        while (number-- > 0)
            System.out.print("*");
        System.out.println();
    }

    public void VerticalLine(int number) {
        while (number-- > 0)
            System.out.println("*");
    }

    public void RightTriangle(int number) {
        int index = 0;
        while (index++ < number)
            HorizontalLine(index);
        System.out.println();
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println("Easiest exercise ever");
        triangle.Easiest();
        System.out.println("Draw a horizontal line");
        triangle.HorizontalLine(3);
        System.out.println("Draw a vertical line");
        triangle.VerticalLine(8);
        System.out.println("Draw a right triangle");
        triangle.RightTriangle(3);
    }
}
