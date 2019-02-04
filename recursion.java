import java.util.ArrayList;

public class recursion{

  /**
   * Finds the appromiate square root using Newton's square root approximation
   * @param  n         Value to be square rooted
   * @param  tolerance How close you want to be
   * @return           The square root given the tolerance
   */
  public static double sqrt(double n,double tolerance){
      return sqrthelper(n,1.0,tolerance);
  }

  /**
   * Recursively finds the square root
   * @param  n         Value whose square root you are finding
   * @param  guess     A guess of the root
   * @param  tolerance How close you want to be
   * @return           Approximate square root
   */
  private static double sqrthelper(double n, double guess, double tolerance){
    double check = Math.abs(n - (guess * guess)) / n;
    guess = (n/guess + guess)/ 2.0;
    if (check > tolerance) return sqrthelper(n,guess,tolerance);
    return guess;
  }

  /**
   * Finds the nth term of the fibonnaci sequence
   * @param  n The term you want to find
   * @return   The nth term
   */
  public static int fib(int n){
    return fibhelper(0,n,0,1);
  }

  /**
   * Helps to recursively find the nth term
   * @param  start    Starting term
   * @param  end      Ending term
   * @param  current  Current term
   * @param  nextTerm Next term
   * @return          The nth term
   */
  private static int fibhelper(int start, int end, int current, int nextTerm){
    if (start != end) return fibhelper(start + 1, end , nextTerm ,current+nextTerm);
    return current;
  }

  /**
   * makes All Sums from 1 to n inclusive
   * @param  n Last term
   * @return   An ArrayList with all the possible sums
   */
  public static ArrayList<Integer> makeAllSums(int n){
    ArrayList<Integer> L = new ArrayList<Integer>();
    return sumshelper(n,0,L);
  }

  /**
   * Helps to recursively find all sums
   * @param  n   Final term
   * @param  sum Sum thus far
   * @param  L   ArrayList of all the sums
   * @return     ArrayList with all sums
   */
  private static ArrayList<Integer> sumshelper(int n, int sum, ArrayList<Integer> L){
    if (n > 0){
      sumshelper(n - 1, sum, L);
      sumshelper(n - 1, sum + n, L);
    }
    if (n == 0) L.add(sum);;
    return L;
  }

}
