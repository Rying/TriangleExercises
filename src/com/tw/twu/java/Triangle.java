package com.tw.twu.java;

public class Triangle {
    public void Easiest() {
        System.out.println("*");
    }

    public void HorizontalLine(int number) {
        while (number-- > 0)
            System.out.print("*");
    }

    public void VerticalLine(int number) {
        while (number-- > 0)
            System.out.println("*");
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.VerticalLine(8);
    }
}
