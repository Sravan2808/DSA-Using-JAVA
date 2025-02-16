
import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      //Q1. Given an integer age as input, 
      //print whether the person is eligible 
      //to vote or not ?

    //Age>=18 -> Eligible

      //Input : 20 ==> Eligible
      //Input : 17 ==> Not Eligible

      // Scanner sc = new Scanner(System.in);
      // int age = sc.nextInt();
      // if(age>=18){
      //   System.out.println("Eligible");
      // }
      // else{
      //   System.out.println("Not Eligible");
      // }

      // Q2. Given two integers A and B as input,
      // print the larger

      // condn : A will not be equal to B
      
      // A = 4 and B = 6  Output : B
      // A = 8 and B = 4 output : A 

    
    // int A = sc.nextInt();
    // int B = sc.nextInt();
    // if(A>B){
    //   System.out.println("A");
    // }
    // else{
    //   System.out.print("B");
    // }
      
      // Given two integers A and B as input,
      // print the larger
      
      // A = 4 and B = 6  Output : B
      // A = 8 and B = 4 output : A 

    // int A = sc.nextInt();
    // int B = sc.nextInt();
    // if(A>B){
    //   System.out.println("A");
    // }
    // else if(B>A){
    //   System.out.println("B");
    // }
    // else{
    //   System.out.print("Both are same");
    // }

    //  Q4. Given temperature of patient in 
    //  farenheit as input,
    //  print whether the temperature is low, normal,
    //   high

    //normal from 98.2 till 98.8

    // input : 98.1 output : low
    // input : 98.9 output : high
    // input : 98.3 output : normal
    // input : 98.2 output : normal
    
    // float temp = sc.nextFloat();
    // if(temp<98.1){
    //   System.out.println("low");
    // }
    // else if(temp>98.1 || temp<=98.8){
    //   System.out.println("normal");
    // }
    // else{
    //   System.out.print("high");
    // }

     // int a = 100000;
    // int b = 100000;

    // long c = (long)a * (long)b;
    // System.out.println(c);

    // Q. Given an integer as input,
   //  print whether it is even or Odd
    //input : 3 output : odd
    //input : 14 output : even

    // int a = sc.nextInt();

    // if(a%2==0){
    //   System.out.println("even");
    // }
    // else{
    //   System.out.print("Odd");
    // }

    // Q5 : Given an integer as input, 
    // print its last digit
    // input : 103 output : 3
    // input : 5 output : 5
    // input : 51 output : 1

    // int num = sc.nextInt();
    // System.out.println(num%10);

    // Q6 : Given units of electricity consumed as 
     //an integer input A, print the bill amount. 
     //Provided below is the range of electricity 
     //consumed and rate at which it is 
     //charged:-
    //[1-50] ---> 1
    //[51-100] ---> 2
    //[101 and beyond] ---> 4

    //input : 20 output : 20*1 = 20

    //input : 80 output : 50*1 + 30*2 = 110

    //input : 120 output : 50*1 + 50*2 + 20 * 4=
   //   = 50 + 100 + 80 = 230
    
    
    // int unit = sc.nextInt();

    // if(unit >= 1 && unit<=50){
    //   System.out.print(unit*1);
    // }
    // else if(unit>=51 && unit<=100){
    //   System.out.print(50*1 + (unit-50)*2);
    // }
    // else{
    //   System.out.print(50*1+50*2+(unit-100)*4);
    // }

    // Q7 : Given an integer A as input
    //   If it is a multiple of 3, print Fizz
    //   If it is a multiple of 5, print Buzz
    //   If it is a multiple of 3 and 5, print Fizz-Buzz

      // input : 5 output : buzz
      // input : 6 output : fizz
      // input : 30 output : fizz-buzz
      // input : 4 output : No-fizz-buzz

      int a = sc.nextInt();
      if(a%3==0 && a%5==0){
        System.out.print("fizz-buzz");
      }
      else if(a%5==0){
        System.out.print("buzz");

      }
      else if(a%3==0){
       System.out.print("fizz");
      }
      else{
        System.out.print("No-fizz-buzz");
      }
      


  }
} 
