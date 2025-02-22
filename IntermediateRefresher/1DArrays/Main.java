
import java.util.*;
class Main{
  public static boolean strictInc(int arr[]){
    for(int i=1;i<arr.length;i++){
      if(arr[i]<arr[i-1]) return false;
    }
    return true;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int arr[] = new int[N];
    for(int i=0;i<N;i++){
      arr[i] = sc.nextInt();
    }

    if(strictInc(arr)){
      System.out.print("true");
    }
    else{
      System.out.print("false");
    }
  }
}