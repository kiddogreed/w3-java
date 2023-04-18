
public class ObjectJava {
    public static void main(String[] args) {
      
      Calculatorz calcz = new Calculatorz();
      
      int res = calcz.add();

      System.out.println(res);
      
    }

    /**
     * Calculator
     */
    public static class Calculatorz {
      
      public int add(){
        System.out.println("add");
        return 5;
      }
      
    }
}
