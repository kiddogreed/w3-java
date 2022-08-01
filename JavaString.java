public class JavaString {
   public static void main(String[] args) {
      String greeting = "Hello";

      //length method
      System.out.println(greeting.length());

      //toUpper method
      // greeting.toUpperCase();
      //string concatinationg "test"+123 +"test"
      //concatinate 2 strings
      String firstName = "John ";
      String lastName = "Doe";
      System.out.println(firstName.concat(lastName));

      //index position 
      String txt = "Hello Everybody";
      System.out.println(txt.indexOf("e"));

   }
}
