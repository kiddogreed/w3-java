public class MultidimensionArr {
  
  public static void main(String[] args) {
   
    int arr1 [][] = new int[3][4];


    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 4; j++) {
        
        arr1[i][j] =(int)(Math.random() * 100);
      }
     
    }
    
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 4; j++) {
        
        System.out.print(arr1[i][j] +" ");
      }
      System.out.println(" ");
    }

  }
}
