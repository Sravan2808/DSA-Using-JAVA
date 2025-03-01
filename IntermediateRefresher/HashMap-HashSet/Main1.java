
import java.util.*;
public class Main1 {

  //Q1. Given an array as input , return the corresponding
  //frequency map

  //input : [1,4,3,-2,1,0,2,1,3,4]

  //Output : {
    // 1 : 3,
    // 4 : 2,
    // 3 : 2,
    // -2: 1,
    // 0 : 1,
    // 2 : 1
//   }

  public static void main(String[] args) {
      //Syntax

      // HashMap<KeyType,valueType> name = new HashMap<>();

      HashMap<String,Integer> map = new HashMap<>();

      //Basic Operation

      //Inserting an element : put()

      map.put("Delhi",10);
      map.put("Haryana",15);
      map.put("Goa",10);
      map.put("Haryana",25);

      System.out.println(map);

      //check if key is present or not : containsKey()

      // System.out.println(map.containsKey("Delhi"));

      // System.out.println(map.containsKey("Maharashtra"));


      //fetch corresponding value associated
      //with key : .get(key)

      //System.out.println(map.get("Delhi"));

      //System.out.println(map.get("ABC"));

      //update the value : put()

      // map.put("Delhi",15);
      // System.out.println(map);

      //size : size()

      //System.out.println(map.size());

      //remove : remove(key)

      //map.remove("Delhi");
      //map.remove("ABC"); ignore 
      //System.out.println(map);

      //print all the keys: keySet()

      System.out.println(map.keySet());

      for(String str: map.keySet()){
        System.out.println("State = " + str);
      }


    }
  }
