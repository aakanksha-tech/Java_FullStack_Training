package day2_basic_java_programs.oops_concept;
interface RemoteControl{void turnOn();}
class TV implements RemoteControl{public void turnOn(){System.out.println("TV ON");}}
class AirConditioner implements RemoteControl{public void turnOn(){System.out.println("AC ON");}}
public class RemoteControlDemo{public static void main(String[] a){new TV().turnOn();new AirConditioner().turnOn();}}