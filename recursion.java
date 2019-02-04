import java.util.ArrayList;

public class recursion{

  public static double sqrt(double n,double tolerance){
      return sqrthelper(n,1.0,tolerance);
  }

  private static double sqrthelper(double n, double guess, double tolerance){
    double check = Math.abs(n - (guess * guess)) / n;
    guess = (n/guess + guess)/ 2.0;
    if (check > tolerance) return sqrthelper(n,guess,tolerance);
    return guess;
  }

  public static int fib(int n){
    return fibhelper(0,n,0,1);
  }

  private static int fibhelper(int start, int end, int current, int nextTerm){
    if (start != end) return fibhelper(start + 1, end , nextTerm ,current+nextTerm);
    return current;
  }

    public static ArrayList<Integer> makeAllSums(int n){
      ArrayList<Integer> L = new ArrayList<Integer>();
      return sumshelper(n,0,L);
    }

    private static ArrayList<Integer> sumshelper(int n, int sum, ArrayList<Integer> L){
      if (n > 0){
        sumshelper(n - 1, sum, L);
        sumshelper(n - 1, sum + n, L);
      }
      return L;
    }

}
