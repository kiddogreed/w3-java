public class JavaMethod {
   //create static method 
   static void myTestMethod(){
      int x=1;
      System.out.println(x);
   }

   static void testLastname(String fname){
         System.out.println(fname + " domingo");
   }

   //method with return value

   static int adder(int x, int y){
      return x+y;

   }

   //recursion method
   //adding number within its range

   public static void main(String[] args){
      //System.out.println(123);
      //call your static method inside main method
      // myTestMethod();
      // myTestMethod();
      // testLastname("rus");
      // testLastname("john");
      // testLastname("ell");

      //System.out.println(adder(10, 11));
      int result = sum(123);
      System.out.println(result);
   }
   public static int sum(int k) {
      if (k > 0) {
        return k + sum(k - 1);
      } else {
        return 0;
      }
    }

   
}
