package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        //Map<String,Integer> map = new HashMap<>();
        Map<String,Integer> map = new TreeMap<>();

        //insertion operation
        map.put("Apple",10);
        map.put("Dragonfruit",40);
        map.put("Banana",20);
        map.put("Custard_Apple",30);


        //retrieval operation
        System.out.println(map.get("Custard_Apple"));
        System.out.println(map.get("Apple"));


        //checking for key if present
        System.out.println(map.containsKey("Banana"));
        System.out.println(map.containsKey("Tomato"));

        //retrieving all the keys in the map
        Set<String> keySet = map.keySet(); //set which contains all keys in the map

        //iterating over keys and printing them
        for(String key: keySet)
        {
            System.out.println("Key = "+key);
        }

        //retrieving all the keys in the map and printing them
        for(String key: map.keySet())
        {
            System.out.println("Key = "+key);
        }

        //retrieving all the values in the map and printing them
        for(Integer value: map.values())
        {
            System.out.println("Value = "+value);
        }

        //print size of the map
        System.out.println("Size of map = "+map.size());

        //remove a key from the map
        map.remove("Custard_Apple");
        for(String key: map.keySet())
        {
            System.out.println("Key = "+key);
        }
        System.out.println("Size of map = "+map.size());
        for(Integer value: map.values())
        {
            System.out.println("Value = "+value);
        }

    }
}
