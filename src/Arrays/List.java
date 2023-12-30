package Arrays;

import java.util.ArrayList;
import java.util.ListIterator;

public class List {
    public static void main(String[] args) {

        // ArrayList syntax
        ArrayList<String> names = new ArrayList<>();
        names.add("Nik");
        names.add("Fata");
        names.add("Walid");

       /* System.out.println(names);
        names.add("Mahdi");
        System.out.println(names);


        names.remove(1);
        System.out.println(names);

        names.set(1,"Ali");
        System.out.println(names);
        System.out.println(names.get(1));

        names.size();
        int size = names.size();
        System.out.println(size);
        System.out.println(names.indexOf("Mahdi"));




        // Array list Loop
        for(int i=0; i < names.size(); i++){
            System.out.println(names.get(i));
        }
        for (String name: names){
            System.out.println(name);
        }
        //Iterator
        ListIterator<String> listIterator = names.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        */
        names.forEach(c -> System.out.println(c));












    }
}
