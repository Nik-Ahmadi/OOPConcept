package Inheritance;

public class SingleInheritance2 extends SingleInheritance1 {
    void downMethod(){
        System.out.println("this is my subclass Method");
    }
    public static void main(String[] args) {
        SingleInheritance2 down = new SingleInheritance2();
        down.downMethod();
        down.sub();
        System.out.println("this is my main Method");


    }
}
