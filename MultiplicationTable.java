import java.util.Scanner;

/**
 * MultiplicationTable
 */
public class MultiplicationTable {


  public static void main(String[] args) {
    
    Scanner scancer = new Scanner(System.in);


    
    String intro = """Greetings from hackergAds mutiplication table maker""";

    int tableNum = scancer.nextInt();
    int multiplyBy = scancer.nextInt();
    boolean hasNextInt = scancer.hasNextInt();
    
    System.out.println("Welcome");
    while (hasNextInt) {
      System.out.println(intro);

    }
    



  }
}