import java.util.Scanner;

public class MultidimensionArr {
  
  public static void main(String[] args) {
    

    Scanner sc = new Scanner(System.in);

    System.out.println("create multidimension array");
    System.out.println("Enter the number of height");
    int row = sc.nextInt();
    System.out.println("enter the number of width");
    int column = sc.nextInt();
    System.out.println("--------------------------------------------------------");

    int MultidimensionArr[][] = new int[row][column];
//assign value for array
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < column; j++) {
        MultidimensionArr[i][j] = (int) (Math.random()* 100);
      }
  }

// display the array 
    for (int i = 0; i < row; i++) {
        for (int j = 0; j < column; j++) {
          if(j%2 == 0 && i % 2 == 0) {
            System.out.print("[x]"); 
          } else{
           System.out.print("[0]"); 
          }
        }
        System.out.println(" ");
    }
    
 
  }
}