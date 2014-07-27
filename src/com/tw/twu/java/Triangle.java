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

    public void EnterBlank(int number, int rowNumber) {
        int totalBlankNum = number - rowNumber;
        while (totalBlankNum-- > 0)
            System.out.print(" ");
    }

    public void UpperIsoscelesTriangle(int number) {
        int rowNumber = 0;
        while (rowNumber++ < number - 1) {
            EnterBlank(number, rowNumber);
            HorizontalLine(2 * rowNumber - 1);
        }
    }

    public void IsoscelesTriangle(int number) {
        UpperIsoscelesTriangle(number);
        HorizontalLine(2 * number - 1);
    }

    public void LowerInvertedIsoscelesTriangle(int number) {
        int index = number - 1;
        for (; index > 0; index--) {
            EnterBlank(number, index);
            HorizontalLine(2 * index - 1);
        }
    }

    public void Diamond(int number) {
        UpperIsoscelesTriangle(number);
        HorizontalLine(2 * number - 1);
        LowerInvertedIsoscelesTriangle(number);
    }

    public void DiamondWithName(int number, String name) {
        UpperIsoscelesTriangle(number);
        System.out.println(name);
        LowerInvertedIsoscelesTriangle(number);
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
        System.out.println("Draw a isosceles triangle");
        triangle.IsoscelesTriangle(3);
        System.out.println("Draw a diamod");
        triangle.Diamond(3);
        System.out.println("Draw a diamod with name");
        triangle.DiamondWithName(3, "RenYing");
    }
}
