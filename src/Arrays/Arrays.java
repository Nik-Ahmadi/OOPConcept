package Arrays;

public class Arrays {
    public static void main(String[] args) {


        //Arrays
        int numbers [] = {1, 2, 3, 4, 5, 6, 7, 8, 9,};
        String[] names = {"ahmad" , "Fata" , "Nik"};


        // for loop
       for (int i = 0; i <numbers.length; i++){
            System.out.println(numbers[i]);
        }

        // for Loop other syntax
       for (String name: names){
           System.out.println(name);
       }

       // While loop Syntax
       int x = 0;
       while (x < numbers.length){
           System.out.println(numbers[x]);
           x++;
       }


    }
}
