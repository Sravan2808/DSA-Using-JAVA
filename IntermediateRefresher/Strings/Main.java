public class Main {
    //Q1. Print character in new line
    //String country = "India";
    //"India" -> ['I','n','d','i','a']
    //Output :
    //I
    //n
    //d
    //i
    //a
  
    private static void printCharByChar(String str){
      for(int i=0;i<str.length();i++){
        System.out.println(str.charAt(i));
      }
    }
  
    //Q2. Given a string, print ASCII of it's character in
    //new line
  
    //String : "India"
    //73
    //110
    //100
    //105
    //97
  
    //Hint : Java understand character as a number
    
    private static void printASCII(String str){
      for(int i=0;i<str.length();i++){
         char chr = str.charAt(i);
        // int code = chr;
        // System.out.println(code);
  
        System.out.println((int)chr);
      }
    }
  
  
    //Q.3 Given a string, print count of uppercase character.
  
    //String -> "kjRS78q31@3 Q"
    //output : 3 
  
    //Hint 1 : 'A' -> 65 'Z' -> 90
    //Hint 2 : you don't need hint 1.
    //'A' - 'Z'
    private static int countUpperCase(String str){
      int count = 0;
      for(int i=0;i<str.length();i++){
        char chr = str.charAt(i);
        // if(chr>=65 && chr<=90){
        //     count++;
        // }
        //"abc51A"
        //'a' -> 97 '0'- 48 97>=48 && 97<=57 --> false
        //'b' -> 98 '0' - 48 98>=48 && 98<=57 -->false
        //'c' -> 99 '0' - 48 99>=48 && 99<=57 -->false
        //'5' -> 53 '0' - 48 53>=48 && 53<=57 --> true
        if(chr>='0' && chr<='9'){
          count++;
        }
      }
      return count;
    }
  
    //Q4. Given a String, print the count of 
    //special characters
    //String -> "kjRS78q31@3 Q"
    //output : 2
    //apart from alpha numeric everything would be considered
    //as special character
    // String - alphabets (lower case
    //upper case)
    //number as character
  
    //'A' - 'Z' : 3
    //'a' - 'z'  : 2
    //'0' - '9' : 1
  
    //"" - 10
  
  
  
    private static int countSpecialCharacter(String str){
      int count = 0;
      for(int i=0;i<str.length();i++){
        char c = str.charAt(i);
        // if(
        //   !(c>='A' && c<='Z') &&
        //   !(c>='a' && c<='z') &&
        //   !(c>='0' && c<='9')
        // ){
        //   count++;
        // }
  
        if(
          (c>='A' && c<='Z') ||
          (c>='a' && c<='z') ||
          (c>='0' && c<='9')
        ){
          continue;
        }
        else{
          count++;
        }
      }
      return count;
    }
  
  
    //Q.5 Given a string, return reverse of String
  
    //Input : "Scaler"
    //Output : "relacS"
  
    // 0 - 'S' ==> "" + 'S' --> "S"
    // 1 - 'c' ==> "S" + 'c' --> "Sc"
    // 2 - 'a' ==> "Sc" + 'a' --> "Sca"
  
    // 0 - 'S' ==> 'S' + ""   --> "S"
    // 1 - 'c' ==> 'c' + "S"  --> "cS"
    // 2 - 'a' ==> 'a' + "cS" --> "acS"
    // 3 - 'l' ==> 'l' + "acS" --> "lacS"
    // 4 - 'e' ==> 'e' + "lacS" --> "elacS"
    // 5 - 'r' ==> 'r' + "elacS" --> "relacS"
  
    private static String reverse(String str){
      String result = "";
      // for(int i=str.length()-1;i>=0;i--){
      //   result += str.charAt(i);
      // }
      for(int i=0;i<str.length();i++){
        result = str.charAt(i) + result;
      }
      return result;
    }
  
    //Q6. Given a string, check whether it is palindrome or not
    //palindrome : String which read the same from start and end
  
    //Eg. MoM, madam, NitiN, malayalam, dad , lol etc.
  
    //Hint : re-use previous problem code
  
    private static boolean checkPalindrome(String str){
      String reverseStr = reverse(str);
      // System.out.println(str);
      // System.out.println(reverseStr);
      if(str.equals(reverseStr)){
        return true;
      } 
      return false;
    }
  
  
    public static void main(String[] args) {
        
        //Length of string : length()
  
        //Access the character
        //charAt(index)
  
        //System.out.println(country.length());
  
        //System.out.println(country.charAt(2));
  
        //printCharByChar("India");
  
       //printASCII("India");
       
       //System.out.print(countUpperCase("kjRS78q31@3 Q"));
        //System.out.print(countSpecialCharacter("kjRS78q31@3 Q"));
  
        //System.out.println(reverse("Scaler"));
  
        //System.out.println(checkPalindrome("mom"));
  
        String str1 = new String("test");
        String str2 = new String("test");
        System.out.println(str1==str2);
      
    }
  }