import java.util.*;
public class Main {

  //Q1. Given an int array as an input, and it's element
  //to the hashset and return hashset
  //contains only numbers
  //input : {1,2,1,2}
  //output : {1,2}

  private static HashSet<Integer> convertArraytoHS(int[] arr){
    HashSet<Integer> hs = new HashSet<>();

    for(int i=0;i<arr.length;i++){
      hs.add(arr[i]);
    }
    return hs;
  }
  
  //Given two hashset as an input and print their 
  //common element

  //Input : HS1 : {1,3,5,6}
//          Hs2 : {2,3,4,6}

  //output :  3 6

  private static void printIntersect(HashSet<Integer> hs1, 
  HashSet<Integer> hs2){
    for(int num: hs1){
      if(hs2.contains(num)){
        System.out.println(num);
      }
    }
  }



  public static void main(String[] args) {
      //Syntax of HashSet

      //It doesn't follow insertion order or sorting order
      

      //HashSet<DataType> setName = new HashSet<Type>(); 

      HashSet<Integer> hs = new HashSet<>();
     // System.out.print(hs);
      //Basic operation

      //Add : add()

      hs.add(78);
      hs.add(82);
      hs.add(-4);
      hs.add(80);
      
      //same element again
      //hs.add(78);
      System.out.println(hs);

    //Searching an element : contains()
    //it returns boolean value

    // System.out.println(hs.contains(82));

    // System.out.println(hs.contains(89));

    //removing an element : remove()
    //It will remove an element and return
    //true if it is present otherwise
    //it will return false
    
    // hs.remove(-4);

    // System.out.println(hs);

    //size : size()

    //System.out.println(hs.size());

     hs.add(null);
    //  System.out.println(hs);

    //Iterate over all the element

    //for each : enhanced version of for loop

    // for(Datatype name: sourceDS){
    //   //
    // }
    
    // for(Integer num : hs){
    //   System.out.println(num);
    
    // }

    //  for(int num : hs){
    //   System.out.println(num);
      
    // }


    //ArrayList vs HashSet

    //ArrayList:
    //  --Sequential order
    //  --duplicate are allowd

    //HashSet:
      //Sequence not maintained
      //Unique element present
    int[] arr = {3,4,5,3};
    //System.out.println(convertArraytoHS(arr));
    HashSet<Integer> hs1 = new HashSet<>();
    HashSet<Integer> hs2 = new HashSet<>();

    hs1.add(10);
    hs1.add(12);
    hs1.add(11);
    hs1.add(10);

    hs2.add(1);
    hs2.add(12);
    hs2.add(11);
    hs2.add(2);

    printIntersect(hs1,hs2);
  }
}

