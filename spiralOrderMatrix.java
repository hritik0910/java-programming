import java.util.*;

public class spiralOrderMatrix {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter no. rows");
    int n = sc.nextInt();
    System.out.println("enter no. of cols");
    int m = sc.nextInt();
    int matrix[][] = new int[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrix[i][j] = sc.nextInt();
      }
      System.out.println("The spiral order matrix is:");
      int rowStart = 0;
      int rowEnd = n - 1;
      int colsStart = 0;
      int colsend = m - 1;
      while (rowStart <= rowEnd && colsStart <= colsend) {
        //1
        for (int cols = colsStart; cols <= colsend; cols++) {
          System.out.print(matrix[rowStart][cols] + " ");
        }
        rowStart++;

        //2
        for (int row = rowStart; row <= rowEnd; row++) {
          System.out.print(matrix[row][colsend] + " ");
        }
        colsend--;
        //3
        for (int col = colsend; col >= colsStart; col--) {
          System.out.print(matrix[rowEnd][col] + ' ');
        }
        rowEnd--;

        //4

        for (int row = rowEnd; row >= rowStart; row--) {
          System.out.println(matrix[row][colsStart] + " ");
        }
        colsStart++;
        System.out.println();  
    }
     
    }
  }
}
