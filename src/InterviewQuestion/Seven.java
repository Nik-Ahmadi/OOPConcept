package InterviewQuestion;

public class Seven {
    Seven()
    {
        System.out.println("My zero constructor");
    }
    Seven(int a){
        this();
        System.out.println("My First Constructor");
    }
    Seven(double b,int a){
        this(1);
            System.out.println("My Second Constructor");
        }
     Seven(char c,double b,int a){
        this(0.12 ,12);
         System.out.println("my third Constructor");
     }
     Seven(int a, char c){
        this('A',0.25,12);
         System.out.println("my forth Constructor");
     }
     Seven(double b){
        this(98.23,'B');
         System.out.println("my fifth construtor");
     }


    public static void main(String[] args) {
        System.out.println("this is my main method");
        new  Seven(10);
    }
        }


