package InterviewQuestion;

public class MethodsInJava {
    double b = 0.01;
    static void staticMethods(){
        System.out.println("this is my STATIC Method");
    }
    void nonStaticMethod(){
        System.out.println("this is my NoN STATIC Method");
    }
    public static void main(String[] args) {
        System.out.println("this main Method");
        staticMethods();
        MethodsInJava nonStatic = new MethodsInJava();
        nonStatic.nonStaticMethod();

    }

}
