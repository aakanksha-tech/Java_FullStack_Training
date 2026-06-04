package day2_basic_java_programs.oops_concept;
interface Camera{void click();}
interface MusicPlayer{void play();}
class SmartPhone implements Camera,MusicPlayer{
 public void click(){System.out.println("Photo");}
 public void play(){System.out.println("Music");}
}
public class SmartPhoneDemo{public static void main(String[] a){SmartPhone s=new SmartPhone();s.click();s.play();}}