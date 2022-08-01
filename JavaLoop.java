public class JavaLoop {
   public static void main(String[] args){
     //loops 
      int i = 1;
      while (i < 6) {
        // System.out.println(i);
         i++;
      }
      int z = 5;
      do {
        
         //System.out.println(z);
         z--;
      } while (z > 0);

      for (int j = 0; j < z; j++) {
        // System.out.println(j);
      }


      //loops in arrays

      String[] cars = {"Raptor","Ferrari", "Honda"};

      for (String c :cars){
         System.out.println(c);

         //add break;  to stop loop 
         //add continue; to skip loop iteration
      }


   
   }
}
