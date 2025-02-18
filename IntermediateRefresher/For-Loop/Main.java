
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         // Q1.)Given N as input ,print from 1 to N
       //  int N = sc.nextInt();
       //   for(int i=1;i<=N;i++){
       //     System.out.print(i + " ");
       //   }
   
     //   Q2.)Given N as input ,Print all the odd number from 1 to N
           // input N=10
           // output: 1 3 5 7 9
   
           // int N = sc.nextInt();
           // for(int i=1;i<N;i+=2){
           //   System.out.print(i + " ");
           // }
   
       // Q3.)Print Factor of Positive Number N
       // int N = sc.nextInt();
       // for(int i=1;i<=N;i++){
       //   if(N%i==0)
       //   System.out.print(i + " ");
         // output : 1 2 3 4 6 8 12 24 
   
       // Q4.)Given a number N print if it is "Prime Number" or "Not Prime"
       // input N=17
       // output : "PrimeNumber"
       // input N=8
       // output "Not Prime"
   
   
       // int N = sc.nextInt();
       // int count = 0;
       // for(int i=1;i<=N;i++){
       //   if(N%i==0 ){
       //     count++;
       //   }      
       // }
       //   if(count == 2){
       //     System.out.print("PrimeNumber");
       //   }
       //   else{
       //     System.out.print("Not a PrimeNumber");
       //   }
   
         // or
        
       // int N = sc.nextInt();
       // int count = 0;
       // for(int i=2;i<N;i++){
       //   if(N%i==0 ){
       //     count++;
       //   }      
       // }
       //   if(count == 0){
       //     System.out.print("PrimeNumber");
       //   }
       //   else{
       //     System.out.print("Not a PrimeNumber");
       //   }
   
            //Solving question with T testcases.
         //   Scanner scanner = new Scanner(System.in);
          //Q. Given T testcases each testcase has an integer
         // N as input print it's last digit.
   
         //Step 1 : Write a logic for single TC
         // int num = scanner.nextInt();
         // System.out.println(num%10);
   
         //Step 2: Write a loop which will run for
         //T testcases
         // int T = scanner.nextInt();
         // for(int i=1;i<=T;i++){
   
         // }
   
         //Step 3 : put the logic which we have written
         //for single test case inside it.
   
         // int T = scanner.nextInt();
         
         // for(int i=1;i<=T;i++){
         //     int num = scanner.nextInt();
         //     System.out.println(num%10);
         // }
   
               //Scope of variable 
         //Lifetime of variable
         
         //int x = 10;
         //
         //
         //
         //System.out.print(x);
         //
         //
         //x was born on line number 9 and 
         //it will alive till the scope(line 17)
   
   
         //case 1:
   
         // int x = 10;
         // int y = 15;
   
         // {
         //   System.out.println(x+" "+y);
         // }
   
         //case 2:
   
         // int x = 10;
         
         // {
         //   int y = 15;
         //   System.out.println(x+" "+y);
         // }
         
         // System.out.println(x+" "+y);
   
         //case 3:
         // int x = 10;
         // int y = 15;
         // {
         //   y = 10;
         //   System.out.println(x+" "+y);
         // }
         // {
         //   System.out.println(x+" "+y);
         // }
   
         // int x = 10;
         // if(x>2){
         //   x = x + 1;
         // }
         // System.out.print(x);
   
   
   
         // int x = 10;
         // {
         //   int y = 15;
         //   System.out.println(x+" "+y);
         // }
         // {
         //   int y = 20;
         //   System.out.println(x+" "+y);
    }
}
