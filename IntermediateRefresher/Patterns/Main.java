import java.util.*;
public class Main {
  public static void main(String[] args) {
      // System.out.println("Hello, World!");
      Scanner sc = new Scanner(System.in);
      // Q1.)Given N as input ,print *(n times)
        // input N = 4
        // input N = 3
        // int N = sc.nextInt();
        // for(int i=0;i<N;i++){
        //   System.out.print("*"+" ");
        // }

        // Q2.) Given N as an input ,print N*N matrix
        // input = 5   input = 3
        // output :     output : 
        // * * * * *            * * *
        // * * * * *            * * *
        // * * * * *            * * *
        // * * * * * 
        // * * * * * 
        // int n = sc.nextInt();
        // for(int r=1;r<=n;r++){
        //   for(int c=1;c<=n;c++){
        //     System.out.print("* ");
        //   }
        //   System.out.println();
        // }
      /*
      Q3.)Given N and M  as an input ,print rectangle of N*M 

          input : M=3,N=2                 input : M=4,N=3
           output:                        output:
                    * *                        * * *  
                    * *                        * * *
                    * *                        * * *
                                               * * * 
      */       
      // int m = sc.nextInt();
      // int n = sc.nextInt();
      //   for(int r=1;r<=m;r++){
      //     for(int c=1;c<=n;c++){
      //       System.out.print("* ");
      //     }
      //     System.out.println();
      //   }              


      // Q4.) Given N as input ,print staircase pattern
                // N=3     
                // output : * 
                         // * * 
                         // * * * 

                // int n = sc.nextInt();
                // for(int i=1;i<=n;i++){
                //   for(int j=1;j<=i;j++){
                //     System.out.print("* ");
                //   }
                //   System.out.println();
                // }

                // Q5.Given n as an input , print the pattern
                // input : 4
                /* 
                 // output : 
                              * 
                              * 2 
                              * 2 * 
                              * 2 * 4 
                
                
                */
                //   int n = sc.nextInt();
                // for(int i=1;i<=n;i++){
                //   for(int j=1;j<=i;j++){
                //     if(j%2 == 0){
                //       System.out.print(j+" ");
                //     }
                //     else{
                //       System.out.print("* ");
                //     }
                //   }
                //   System.out.println();
                // }

                // Q6.)Given N as input ,print below format
                /*
                input N = 4              input N = 5
                output :                   *    *
                          *  *             *    *
                          *  *             *    *  
                          *  *             *    *      
                          *  *             *    *
    
                */
                // int n = sc.nextInt();
                // for(int row = 1;row<=n;row++){
                //   System.out.print("*");
                //   for(int space = 1;space<=n-2;space++){
                //     System.out.print(" ");
                //   }
                //   System.out.print("*");
                //   System.out.println(" ");
                // }

                /**
                Q7.)Given N  as an input ,print below pattern
                input : N=4                      
                  output:
                          *****
                          ****
                          ***
                          **
                          *
                **/
                // int n = sc.nextInt();
                // for(int i=1;i<=n;i++){
                //   for(int j=1;j<=n+1-i;j++){
                //     System.out.print("*");
                //   }
                //   System.out.println();
                // }

                /* 
                  Q8.)Given N as input,Print the following
                  input N=4                   
                  output :
                  *   *
                  *  *
                  * *
                  **
                */

                // int N = sc.nextInt();
                // for(int i=1;i<=N;i++){
                //   System.out.print("*");
                //   for(int j=1;j<=N-i;j++){
                //     System.out.print(" ");
                //   }
                //   System.out.print("*");
                //   System.out.println();
                // }
                
                // Q9.)Given N as an input print the following pattern
                // input N=3
                // output
              //       *
              //     *  *
              //  *  *  *

              // int n = sc.nextInt();
              // for(int i=1;i<=n;i++){
              //   for(int space = 1;space<=n-i;space++){
              //     System.out.print(" ");
              //   }
              //   for(int star=1;star<=n;star++){
              //     System.out.print("*");
              //   }
              //   System.out.println();
              // }

              // Q10.)Given N as input print the following pattern
              // input N=4
              // output:
              // ********
              // ***  ***
              // **    **
              // *      *


                // int n = sc.nextInt();
                // for(int i=1;i<=n;i++){
                //   for(int star = 1;star<=n+1-i;star++){
                //     System.out.print("*");
                //   }
                //   for(int space=1;space<=(2*i-2);space++){
                //     System.out.print(" ");
                //   }
                //   for(int star2 = 1;star2<=n+1-i;star2++){
                //     System.out.print("*");
                //   }
                //   System.out.println();
                // }
                
                // Q.)Given n as an input print the following format
                // input n=3                 input = 4
                //output                      output
                // . . * . .                 . . . * . . .
                // . * * * .                 . . * * * . . 
                // * * * * *                 . * * * * * .
                                          // * * * * * * *

              // int n =sc.nextInt();
              // for(int row = 1;row<=n;row++){
              //   for(int space=1;space<=n-row;space++){
              //     System.out.print(" ");
              //   }
              //   for(int star1 = 1;star1<=(2*row-1);star1++){
              //     System.out.print("*");
              //   }
              //    for(int space=1;space<=n-row;space++){
              //     System.out.print(" ");
              //   }
              //   System.out.println();
                
              // }
  }
}