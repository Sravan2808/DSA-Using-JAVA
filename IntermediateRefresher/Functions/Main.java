import java.util.*;
public class Main {

  //Q1

  public static boolean checkEvenOrOdd(int num){
    if(num%2==0){
      return true;
    }
    return false;
  }

  public static String checkHeight(int height){
    if(height<10){
      return "Small";
    }
    else if(height>20){
      return "Large";
    }
    else{
      return "Medium";
    }
  }

 public static double areaOfRectangle(double l, double b){
  return l * b;
 }

private static int areaOfCircle(int r){
  //Math module
  //prebuilt collection of variable and 
  //function
  return (int)Math.ceil(Math.PI * r * r);
}

public static boolean isPrime(int num){
  int factor = 0;
  for(int j=1;j<=num;j++){
    if(num%j==0){
      factor++;
    }
  }
  if(factor==2){
    return true;
  }
  return false;
}
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

      //Q1.Given an integer N,
      // return whether the integer
      // is even or not.

      //12
      //True

      //5
      //False

      // int num = scanner.nextInt();
      // System.out.println(checkEvenOrOdd(num));

//Q2. Given an integer N, 
//return whether its height is 
//small, medium or large.

//if it is less than 10, then its small.
//if it is between 10 to 20, then its medium.
//if it is greater than 20, then large.

// int height = scanner.nextInt();
// System.out.println(checkHeight(height));


//break : 10.20pm


//Q3.Given two doubles as input, 
//return the area of the rectangle.

// double l = scanner.nextDouble();
// double b = scanner.nextDouble();

// System.out.println(areaOfRectangle(l,b));

//Q4. Given the radius(double) of the 
//circle, return the area of the circle.

//area = PI * r * r;

//int r = scanner.nextInt();
//System.out.println(areaOfCircle(r));

//Math.round : It takes fractional
//number as an input and round to nearest
//integer

// System.out.println(Math.round(10.2));
//System.out.println(Math.round(10.49));
//System.out.println(Math.round(10.51));
//System.out.println(Math.round(10.72));
//System.out.println(Math.round(10.50));
//System.out.println(Math.round(9.50));

//Math.ceil : It takes decimal number as
//an input and return the smallest number
//which is greater than or equal to provide 
//number

//System.out.println(Math.ceil(3.2));

//System.out.println(Math.ceil(3.0));

//System.out.println(Math.ceil(3.1));

//Math.floor
//It takes fractional number as an input
//and return the largest number that is
//smaller than or equal to provided number

//System.out.println(Math.floor(3.99));


//Q5.Given an integer N as an input,
// print all 
//the prime numbers between 1 to N.

//input : 20
//Output : 2 3 5 7 11 13 17 19
// int num = sc.nextInt();
      // for(int i=1;i<=num;i++){
      //   int factor = 0;
      //   for(int j=1;j<=i;j++){
      //     if(i%j==0){
      //       factor++;
      //     }
      //   }
      //   if(factor==2){
      //     System.out.println(i);
      //   }
      // }

      // or

int N = scanner.nextInt();

for(int i=1;i<=N;i++){
  if(isPrime(i)){
    System.out.println(i);
  }
}




  }
}