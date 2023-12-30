package InterviewQuestion;

public class ConstructorOverloading {
    // it is noting but the constructor with paramerter is called constructor overloading.
    // if we have multipale constructor with the same name and with defrient parameter is called
    // constructor overloading
    ConstructorOverloading(int a){
        System.out.println("my first constructor");

    }
    ConstructorOverloading(double b, int a ){
        System.out.println("my second constructor");

    }
    ConstructorOverloading(char c , int a , double b ){
        System.out.println("my thired constructor");

    }
    ConstructorOverloading(double b ){
        System.out.println("my forth constructor");

    }
    public static void main(String[] args) {
        System.out.println("this is my main method");
        new ConstructorOverloading(10);
        new ConstructorOverloading(0.002,20);
        new ConstructorOverloading('A', 30, 0.0002);
        new ConstructorOverloading(00.12);

    }

}
