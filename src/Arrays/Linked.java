package Arrays;

import java.util.LinkedList;

public class Linked {
    public static void main(String[] args) {

        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(1000);
        numbers.add(2000);
        //System.out.println(numbers);


        numbers.forEach(c -> System.out.println(c));
    }
}
