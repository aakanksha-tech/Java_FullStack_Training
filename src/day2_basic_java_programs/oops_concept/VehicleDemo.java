package day2_basic_java_programs.oops_concept;
abstract class Vehicle{abstract void start(); abstract void stop();}
class Car extends Vehicle{void start(){System.out.println("Car Start");} void stop(){System.out.println("Car Stop");}}
class Bike extends Vehicle{void start(){System.out.println("Bike Start");} void stop(){System.out.println("Bike Stop");}}
public class VehicleDemo{public static void main(String[] a){new Car().start(); new Bike().start();}}