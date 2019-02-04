public class driver{

  public static void main(String[] args) {
  System.out.println(recursion.sqrt(100.0,0.00001));
  System.out.println("Should be 10");
  System.out.println(recursion.sqrt(64.0,0.00001));
  System.out.println("Should be 8");
  //System.out.println(recursion.sqrt(-100.00));
  //System.out.println("Should be error");
  System.out.println(recursion.sqrt(2.0,0.000000000001));
  System.out.println("Should be 1.4 and then some");
  System.out.println(recursion.fib(0));
  System.out.println("Should be 0");
  System.out.println(recursion.fib(5));
  System.out.println("Should be 5");
  System.out.println(recursion.fib(6));
  System.out.println("Should be 8");
  System.out.println(recursion.fib(10));
  System.out.println("Should be 55");
  System.out.println(recursion.makeAllSums(3));
  System.out.println("Should be [0, 3, 2, 5, 1, 4, 3, 6]");
  System.out.println(recursion.makeAllSums(2));
  System.out.println("Should be [0,1,2,3]");
  }

}
