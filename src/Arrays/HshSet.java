package Arrays;

import java.util.HashSet;
import java.util.Iterator;

public class HshSet {
    public static void main(String[] args) {
        HashSet<String> passportNum = new HashSet<>();
        passportNum.add("P123456");
        passportNum.add("p654321");
        System.out.println(passportNum);

        passportNum.add("P123457");
        System.out.println(passportNum);
        HashSet<String> cars = new HashSet<>();
        cars.add("Toyota");
        cars.add("Honda");
        cars.add("Ford");
        System.out.println(cars.contains("Honda"));
        System.out.println(cars.contains("Ram"));


        for (String car :cars){
            System.out.println(car);
        }
        cars.forEach(c -> System.out.println(c));

        Iterator<String> i = cars.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}
