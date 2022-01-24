import java.util.*;

public class findANumberInTwoDArray {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter no. of rows");
    int a = sc.nextInt();
    System.out.println("Enter no. of coloumns");
    int b = sc.nextInt();
    int matrix[][] = new int[a][b];
    for (int i = 0; i < a; i++) {
      for (int j = 0; j < b; j++) {
        matrix[i][j] = sc.nextInt();
      }
    }
    System.out.println("Enter the no. you want to find");
    int c = sc.nextInt();
    for (int i = 0; i < a; i++) {
      for (int j = 0; j < b; j++) {
        if (matrix[i][j] == c) {
          System.out.println("The no. is  at index" + i + ' ' + j);
        }
      }
    }
  }
}
