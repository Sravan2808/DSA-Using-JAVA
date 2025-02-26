package IntermediateRefresher.Arraylists;

import java.util.*;
public class Main {
    
  //Print 2D ArrayList like below

  //[[10, 20, 30], 
 // [7, 8, 9], [1, 2, 3, 4]]

//  Output : 10 20 30
//           7  8  9
//           1  2  3  4


public static void print2DList(ArrayList<ArrayList<Integer>> list2D){
    int N = list2D.size();
    for(int i=0;i<N;i++){
      ArrayList<Integer> currList = list2D.get(i);
      for(int j=0;j<currList.size();j++){
        System.out.print(currList.get(j)+" ");
      }
      System.out.println();
    }
  }
  
  
  //Given N integer as an input return the numeric staircase
  //as a 2D ArrayList
  
  //input : 3
  //Output : 
  // 1     - row1
  // 1 2.  - row2
  // 1 2 3  -row3
  
  //input : 5
  //1   -row1  col = 1
  //1 2  --row2 col = 2
  //1 2 3  --row3 col = 3
  //1 2 3 4  --row4  col = 4
  //1 2 3 4 5 --row5  col=5
  
  private static ArrayList<ArrayList<Integer>> staircase(int num){
    ArrayList<ArrayList<Integer>> resultList = new ArrayList<>();
    
    for(int row=1;row<=num;row++){
      ArrayList<Integer> currList = new ArrayList<>();
        for(int col=1;col<=row;col++){
          currList.add(col);
        }
        
        resultList.add(currList);
    }
    return resultList;
}

  //Given an arraylist as an input
  //return an arraylist of the multiples 
  //of 5 or 7
  
  //input are greater than equal to 0

  //[1 5 2 3 0 7]
  //Output : [5 0 7]

  public static ArrayList<Integer> multiplies(ArrayList<Integer> list){
    ArrayList<Integer> answerList = 
    new ArrayList<>();

    int N = list.size();
    for(int i=0;i<N;i++){
      if(list.get(i)%5==0 || list.get(i)%7==0){
        answerList.add(list.get(i));
      }
    }
    return answerList;
  }

  //Given two integers A and B as 
  //input, 
  //return an ArrayList
  // containing first B multiples of A.

  //A = 2 B =4

  //Output : [2,4,6,8]

  //A=3 B = 5
  //Output : [3,6,9,12,15] 

  //3*1
  //3*2
  //3*3
  //3*4 
  //3*5

  public static ArrayList<Integer> findB(int A, int B){
    ArrayList<Integer> answerList = new ArrayList<>();
    

    for(int i=1;i<=B;i++){
      answerList.add(A*i);
    }

    return answerList;
  }

  public static void main(String[] args) {
      //ArrayList Syntax
      //ArrayList<Datatype> listName = 
      //new ArrayList<Datatype>();

      //It doesn't support primitive data type
      //int, float , double, boolean, char,long

      //int -> Integer
      //float -> Float
      //boolean -> Boolean
      //char -> Character
      //double -> Double

      // ArrayList<Integer> list = new ArrayList<>();

      

      //Basic operation

      //add

      // list.add(10);
      // list.add(20);
      // list.add(30);
      // list.add(40);
      // System.out.println("Before removal " +list);

    //get
    //System.out.println(list.get(2));

    //System.out.println(list.get(-1));
    // error

    //remove

    // int num = list.remove(0);
    // System.out.println(num);

    // System.out.println("after removal " +list);

    //update : set

    //list.set(index,value) 

    // list.set(3,50);

    // list.add(2,25);

    // System.out.println(list);

    // //size()
    // System.out.println(list.size());


    Scanner scanner = new Scanner(System.in);

    ArrayList<Integer> list =
     new ArrayList<>();

     int n = scanner.nextInt();

    for(int i=0;i<n;i++){
      list.add(scanner.nextInt());
    }


    // while(scanner.hasNextInt()){
    //   list.add(scanner.nextInt());
    // }

    // int N = list.size();
    // for(int i=0;i<N;i++){
    //   System.out.print(list.get(i)+" ");
    // }
    //System.out.println(list);
    ArrayList<Integer> list1 = new ArrayList<>();

    // answerList = multiplies(list);

    // System.out.print(answerList);

      list1 = findB(3,5);
      System.out.print(list1);

        // 2D Arrays : Arrays of Array
     // 2D ArrayList : ArrayList of ArrayList

      //Syntax

      // ArrayList<ArrayList<Datatype>> listName = 
      // new ArrayList<ArrayList<Datatype>>();

      ArrayList<ArrayList<Integer>> list2D = 
      new ArrayList<>();

      //Basic operation

      ArrayList<Integer> list1 = new ArrayList<>();
      list1.add(10);
      list1.add(20);
      list1.add(30);

      list2D.add(list1);

      ArrayList<Integer> list2 = new ArrayList<>();
      list2.add(0);
    
      list2D.add(list2);

      ArrayList<Integer> list3 = new ArrayList<>();
      list3.add(1);
      list3.add(2);
      list3.add(3);
      list3.add(4);
    
      list2D.add(list3);

      // System.out.println(list2D);
      // System.out.println();
      // System.out.println(list2D.get(2));

      // System.out.println(list2D.get(2).get(2));

      // System.out.println(list2D.get(1));

      // System.out.println(list2D.get(0).size());

      // System.out.println(list2D.size());

    //System.out.println(list2D);

    // list2D.get(2).remove(1);

    // list2D.remove(1);

    // System.out.println(list2D);

    //set

    //list2D.get(1).set(0,5);

    //System.out.println(list2D);

    //[[10, 20, 30], [0], [1, 2, 3, 4]]

    //[[10, 20, 30], [7,8,9], [1, 2, 3, 4]]

    //{7,8,9}

    // list2D.get(1).set(0,7);
    // list2D.get(1).add(8);
    // list2D.get(1).add(9);

    ArrayList<Integer> list4 = new ArrayList<>();
    list4.add(7);
    list4.add(8);
    list4.add(9);

    list2D.set(1,list4);

    //System.out.println(list2D);

    //print2DList(list2D);
    
    ArrayList<ArrayList<Integer>> resultList = staircase(5);
    for(int i=0;i<resultList.size();i++){
      for(int j=0;j<resultList.get(i).size();j++){
        System.out.print(resultList.get(i).get(j)+" ");
      }
      System.out.println();
    }

  }
}