package InterviewQuestion;

public class MethodOverloading {

    void school(int a){
        System.out.println("My first NON Static Method");
    }
    static void school(double b, int a){
        System.out.println("My second static Method");
    }
    static void school(char c, double b, int a){
        System.out.println("My third static Method");
    }
    void school(char c, double b){
        System.out.println("my forth Non static Method");
    }
    void school(){
        System.out.println("My fifth Non Static Method");
    }

    public static void main(String[] args) {
        System.out.println("this is MY main Method");
        MethodOverloading overloading = new MethodOverloading();
        overloading.school(1);
        school(0.01,12);
        school('S', 0.012,45);
        overloading.school('A' , 0.23);
        overloading.school();

    }
}
