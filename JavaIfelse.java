import java.util.Scanner;
public class JavaIfelse {
   public static void main(String[] args){
      //if
      // !not
      //>greater than  >= greater or equal   
      //<less than  <= less or equal
      // = assign value
      //== equal value
      //=== same type and value
      boolean x = false;
      if(x){
         System.out.println("Hello World");
      }else{
         System.out.println("Hi World");
      }

      //ternary

      String greeter = (x) ?"x:"+x+" is true" :"x:"+x+" is false";
      System.out.println(greeter);

      Scanner testScan = new Scanner(System.in);
      System.out.println("please enter some number to check the type:");
      int numInput = testScan.nextInt();

      String type = (numInput%2 == 0)?"Even":"Odd";

      System.out.println("Number you enter is:"+type);

      
   }
}
