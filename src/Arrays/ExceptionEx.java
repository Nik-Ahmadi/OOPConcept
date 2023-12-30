package Arrays;

public class ExceptionEx {
    public static void main(String[] args) {
        // Exception has to blocks
        // Try and Catch
        // Exception type
        // if we want to create a custom error we use from ((throw))

        int [] number = {1, 2, 3, 4, 5};
        try {
            System.out.println(number[6]);
        }catch (Exception e) {
            System.out.println("something is Wrong!");
        }finally {
            System.out.println("Code Executed!");
        }


    int age = 12;
        if(age < 21){
          throw new ArithmeticException("your a child");

        }else {
            System.out.println("your young !");
        }


    }
}
