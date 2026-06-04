package day2_basic_java_programs.oops_concept;
abstract class Animal{
	abstract void sound();
	}
class Dog extends Animal{
	void sound(){
		System.out.println("Bark");
		}
	}
class Cat extends Animal{
	void sound(){
		System.out.println("Meow");
		}
	}
public class AnimalDemo{public static void main(String[] a){new Dog().sound();new Cat().sound();}}