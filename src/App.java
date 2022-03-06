import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
       
       ArrayList<String> fruitList = new ArrayList<String>();

       fruitList.add("apple");
       fruitList.add("grapes");
       fruitList.add("banana");

       for(String fruit: fruitList){
       System.out.println(fruit);
       }

       //person = {Joan=22, Daniel=42, Anna=34}
       HashMap<String, Integer> people = new HashMap<String, Integer>();
       
       people.put("Joan", 22);
       people.put("Steve", 35);
       people.put("Amanda", 37);
       
       System.out.println(people); // {Joan = 22}

       // loop through the hash map and return each key/value pair
       for (Map.Entry<String, Integer> person : people.entrySet()) {
           String key = person.getKey();
           Integer value = person.getValue();
           System.out.println(key + " : " + value);
       }
    }
}
    
