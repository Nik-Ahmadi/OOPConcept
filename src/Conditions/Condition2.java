package Conditions;

public class Condition2 {
    public static void main(String[] args) {
       if(2 < 1){
           System.out.println("this is the first statement!");
           if(5 < 4){
               System.out.println("this is inside if");
           }
           else {
               System.out.println("this is nestate if");
           }
       }
       else {
           System.out.println("this the final Statement!");
       }
    }
}
