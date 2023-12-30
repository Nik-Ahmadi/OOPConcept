package Inheritance;

public class Hybrid2 extends Hybrid1{
    public static void main(String[] args) {
        System.out.println("this is the main Methods");
        Hybrid2 hybrid2 = new Hybrid2();
        hybrid2.son();
        hybrid2.father();
        hybrid2.hybridInheritance();
        Hybrid3 hybrid3 = new Hybrid3();
        hybrid3.hybridInheritance();
        hybrid3.uncle();
    }
    void son(){
        System.out.println("i am the Hybrid1 son");
    }
}
