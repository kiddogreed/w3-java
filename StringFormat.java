/**
 * StringFormat
 */
public class StringFormat {

  public static void main(String[] args) {

    String str = "Java asdasdasdasd";

    // format string 
    String formatStr = String.format("Language: %10s", str);

    System.out.print(formatStr);
    System.out.print("etst");
  }
}