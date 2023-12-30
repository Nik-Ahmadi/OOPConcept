package Inheritance;

public class Hierar1 extends Hierar3{
    public static void main(String[] args) {
        System.out.println("I love software Testing");
        Hierar1 hierar1 = new Hierar1();
        Hierar2 hierar2 = new Hierar2();
        hierar2.ex();
        hierar2.ex1();
        hierar1.ex2();
        hierar1.ex();


    }
    void ex2(){
        System.out.println("this is child class number2");
    }
}
