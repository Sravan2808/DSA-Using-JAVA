// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      // System.out.println("Hello, World!");
      // Q1.Given an integer N as input. Print from 1 to N ?

      // input : 5
      // output : 1 2 3 4 5
      // constraint : n>1
      // int num=sc.nextInt();
      // int count=1;
      // while(count<=num){
      //   System.out.print(count + " ");
      //   count++;
      // }

      // Q2.Given an integer N as input. Print from N to 1 ?
      // input : 5
      // output :  5 4 3 2 1

      // int num = sc.nextInt();
      // while(num>=1){
      //   System.out.print(num + " ");
      //   num--;
      // }

      // Q3.Given an integer N as input. Print odd values from 1 to N ?
      // num%2!=0
      // Input : 8
      // Output : 1 3 5 7

  

      // int count=1;                                          
      // int num = sc.nextInt();
      // while(num<=num){
      //   if(num%2 != 0)                   
      //     System.out.println(num+" ");           
      //   num++;
      // }                                  (OR)

      // int num = sc.nextInt();
      // int count = 1;
      // while(count<=num){
      //   System.out.print(count + " ");
      //   count+=2;
      // }

      
      // Q4.Given an integer N as input. Print even values from 1 to N ?
      // int num = sc.nextInt();
      // int count = 2;
      // while(count<=num){
      //   System.out.print(count + " ");
      //   count+=2;
      // }

      // Q5.Given an integer N as input, print multiples Of 4 till N ?
      // input : 30
      // output: 4 8 12 16 20 24 28
      // int num=sc.nextInt();
      // int count = 4;
      // while(count<=num ){
      //   System.out.print(count + " ");
      //   count+=4;
      // } (OR)
      
      // Q5 : Given an integer N as input, print perfect squares till N ?
      // input : 30
      // Output : 1 4 9 16 15
      // int num = sc.nextInt();
      // int count=1;
      // while(count*count<=num){
      //   System.out.print(count*count + " ");
      //   count = count+1;
      // }
      // int num = sc.nextInt();
      // if(num == 0)
      // {
      //   System.out.print(0);
      // }
      // else{
      //   if(num<0){
      //     num = num * -1;
      //   }
      //   while(num>0){
      //     System.out.print(num%10 + " ");
      //     num=num/10;
      //   }
      // }

    //  int num = sc.nextInt();
     
    //   if(num == 0)
    //   {
    //     System.out.print(0);
    //   }
    //   else{
    //     if(num<0){
    //       num = num * -1;
    //     }
    //     int sum = 0;
    //     while(num>0){
    //       sum =sum+(num%10);
         
    //       num=num/10;
    //     }
    //      System.out.print(sum);
    //   }

    int num = sc.nextInt();
    int reverse = 0;
     while(num>0){
      int d = num%10;
      reverse = reverse*10+d;
          num=num/10;
        }
        System.out.print(reverse);
        
  }
}