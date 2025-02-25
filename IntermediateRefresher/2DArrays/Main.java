import java.util.*;
public class Main {

  private static void printRowByRow(int[][] matrix){
    int N = matrix.length;
    int M = matrix[0].length;

    for(int i=0;i<N;i++){
      for(int j=0;j<M;j++){
        System.out.print(matrix[i][j]+" ");
      }
      System.out.println();
    }
  }

  //Q. Given a matrix of size N*M,
  //print it's sum
  //1 3 10
  //2 -5 3
  //3 9 2

  //output : 28

  private static void sumOfMatrix(int[][] matrix){
    int N = matrix.length;
    int M = matrix[0].length;
    int sum = 0;
    for(int row=0;row<N;row++){
      for(int col=0;col<M;col++){
          sum = sum + matrix[row][col];
      }
    }
    System.out.print(sum);
  }

  //Q. Give a matrix of N*M , 
  //print waveform

  //input 
  //1 3 10  (0)
  //2 -5 3  (1)
  //3 9 2   (2)
  //5 1 0   (3)
  //-3 2 1  (4)

  //Output :
  //1 3 10   (0)
  //3 -5 2   (1)(printing right to left)
  //3 9 2    (2)
  //0 1 5    (3)(right to left)
  //-3 2 1   (4)

  private static void printWave(int[][] matrix){
    int N = matrix.length;
    int M = matrix[0].length;

    for(int row=0;row<N;row++){
      if(row%2==0){
        for(int col=0;col<M;col++){
          System.out.print(matrix[row][col]+" ");
        }
      }
      else{
        for(int col=M-1;col>=0;col--){
          System.out.print(matrix[row][col]+" ");
        }
      }
      System.out.println();
    }
  }


  //Q.Given N*M matrix return
  // Row wise sum

  //input 
  //1 3 10  (0)
  //2 -5 3  (1)
  //3 9 2   (2)
  //5 1 0   (3)
  //-3 2 1  (4)

  //Output : [14 0 14 6 0]

  // private static int[] rowWiseSum(int[][] matrix){
  //   int N = matrix.length;
  //   int M = matrix[0].length;

  //   int[] ans = new int[N];

  //   for(int row=0;row<N;row++){
  //     int sum = 0;
  //     for(int col=0;col<M;col++){
  //       sum = sum + matrix[row][col];
  //     }
  //     ans[row] = sum;
  //   }
  //   return ans;
  // }

//Q. Given a matrix N*M, return colum wise max
//c1  c2  c3  c4
//1   3   -2  7
//9   0   8   1
//5   6   2   -3


//output: [9 6 8 7]

private static int[] columnWiseMax(int[][] matrix){
  int N = matrix.length;
  int M = matrix[0].length;

  int[] ans = new int[M];

  for(int col=0;col<M;col++){
    int max = matrix[0][col];
    for(int row=0;row<N;row++){
      if(matrix[row][col]>max){
        max = matrix[row][col];
      }
    }
    ans[col] = max;
  }
  return ans;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();
    int n = sc.nextInt();
    int arr[][] = new int[m][n];
    for(int i=0;i<m;i++){
      for(int j=0;j<n;j++){
        arr[i][j] = sc.nextInt();
      }
    }
    // Q1.)
    // for(int i=0;i<arr[0].length;i++){
    //   System.out.print(arr[0][i] +" ");
    // }
    // Q2.)
    // for(int i=0;i<arr.length;i++){
    //   System.out.print(arr[i][0] +" ");
    // }
    // Q3.)Given a matrix m*n ,print row by row
    // for(int i=0;i<arr.length;i++){
    //   for(int j=0;j<arr[i].length;j++){
    //     System.out.print(arr[i][j]+" ");
    //   }
    //   System.out.println();
    // }
    // Q4.)Given a matrix,print it column by column
    //  for(int col=0;col<n;col++){
    //   for(int row=0;row<n;row++){
    //     System.out.print(arr[row][col]+" ");
    //   }
    //   System.out.println();
    // }

    // Q5.) Given a matrix of size m*n ,print it's sum
    // sumOfMatrix(arr);

    // Q6.)Given a matrix of M*N , print  waveform
    // WaveForm(arr);

  //  int[] result = rowWiseSum(matrix);
    
    // for(int i=0;i<result.length;i++){
    //   System.out.print(result[i]+" ");
    // }
    
    int[] result = columnWiseMax(arr);
    for(int i=0;i<result.length;i++){
      System.out.print(result[i]+" ");
    }
      

  }
}