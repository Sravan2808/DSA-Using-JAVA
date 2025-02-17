
import java.util.*; 
public class Main {
  public static void main(String[] args) {
      //To print string pass it in double quotes
      //System.out.print("Hello World");
        //System.out.print(1);

        //Quiz1
       // System.out.print("Hey There");

       //Quiz 2
       //system.out.print(10);
       //Output : Error (because s in smallcase)

       //Quiz 3

      // System.out.print("10*20");
       //Output : 10*20


    //Basic Arithmetic Operation
    //System.out.println(10*5);
     // System.out.print(10+5);
      //System.out.print(10-5);
     // System.out.print(10/5);

      //My Name is Vishal
      //I am from India

      //println - will print and move cursor to next line
      // System.out.println("My name is Vishal");
      // System.out.print("I am from India");


    //Single line comment : // (cntrl+/ or cmd+/)
    //multi line comment : /*   */

    /*
    System.out.println("My name is Vishal");
    System.out.print("I am from India");
    */
      

    //"Vishal" "Singh"
    //System.out.print("vishal" + " singh");

    //Vishal and age is 20
    //System.out.println("Vishal" + " and age is " + 20);

    //Quiz
    //System.out.print( 7 + 1 + "156");
    //Output : 8156

    //Quiz
    //System.out.print("156" + 7 + 1);

    // "156" + 7 = "1567"
    //"1567" + 1 = "15671"

    //Output : 15671

    //Implicit typecasting
    // int a = 123;
    // long ans = a;
    // System.out.print(ans);

    //By default integer are consider as int
    //int a = 10;
    //long p = 10000000000l;//10^10
    //System.out.print(p);
    
    //By default decimal value are considered as double
    // float b = 89.12f;
    // System.out.println(b);

    //l for long and f for float


    //explict type casting

    // long a = 20000000000l;
    // int b = (int)a;
    // System.out.println(b);

    // float a = 10.23f;
    // int b = 2;
    // System.out.print(a/b);

    Scanner scanner = new Scanner(System.in);
    // int a = scanner.nextInt();
    // System.out.print(a);


      // long a = scanner.nextLong();
      //  System.out.print(a);

      // float a = scanner.nextFloat();
      //  System.out.print(a);


      // double a = scanner.nextDouble();
      //  System.out.print(a); 

      //next and nextLine
      //next : reads the data till the time space is not encountered
      //read only one word from input
      // String str = scanner.next();
      // System.out.print(str);

      //It will read entire line : until it encounters /n
      //read entire line from input
      // String str = scanner.nextLine();
      // System.out.print(str);

      



      //Question 1: Take 2 names X and Y as an input and 
      //print X loves Y.

      // X = Ram
      // Y = Shyam

      //Ouput : Ram loves shyma

      // String X = scanner.next();
      // String Y = scanner.next();

      // System.out.print(X+" loves " + Y);



      //Question 2 : Take name(X) and age(Y) as input and 
      //print X age is Y

      // X = Alice
      // Y = 20

      // Output : Alice age is 20

      // String X = scanner.next();
      // byte Y = scanner.nextByte();
      // System.out.print(X+" age is " + Y);

      byte a = (byte)128;
      System.out.println(a);




  }
}