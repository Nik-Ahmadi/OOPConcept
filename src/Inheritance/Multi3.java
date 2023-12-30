package Inheritance;

public class Multi3 extends Multi2{
    void son(){
        System.out.println("i am son");
    }

    public static void main(String[] args) {
        System.out.println("this is my main Methods");
        Multi3 multi = new Multi3();
        multi.son();
        multi.father();
        multi.grandFather();
    }
}
