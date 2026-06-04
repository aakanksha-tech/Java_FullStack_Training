package day2_basic_java_programs.oops_concept;
abstract class Shape{abstract double calculateArea();}
class Circle extends Shape{double r=5; double calculateArea(){return 3.14*r*r;}}
class Rectangle extends Shape{double l=4,b=3; double calculateArea(){return l*b;}}
public class ShapeDemo{public static void main(String[] a){System.out.println(new Circle().calculateArea());System.out.println(new Rectangle().calculateArea());}}