package Arrays;

import java.util.HashMap;

public class HshMap {
    public static void main(String[] args) {

        HashMap<String, String> identification = new HashMap<>();

             // we have in HashMap key and value
        identification.put("FirstName", "Nik");
        identification.put("LastName", "Ahmadi");
        identification.put("DoB" , "01/16/1991");
        identification.put("Gender", "Male");

        System.out.println(identification);
        System.out.println(identification.get("FirstName"));
        System.out.println(identification.get("DoB"));
        identification.put("Country" , "America");
        System.out.println(identification);
        identification.remove("DoB");
        System.out.println(identification);
        System.out.println(identification.size());

        for (String value : identification.values()){
            System.out.println(value);
        }
        for (String key : identification.keySet()){
            System.out.println(key);}

            for(String key : identification.keySet()){
                System.out.println("K: " + key +  "..  V:" + identification.get(key));
            }
        }







    }



