package com.rakuten.oops;

public class ShapeTest {
public static void main(String[] args) {
Shape s = new Shape();
System.out.println(s.getBorderWidth());
System.out.println(s.getColor());

Shape s1 = new Shape(10, "red");
System.out.println(s1.getBorderWidth());
System.out.println(s1.getColor());
}
}
