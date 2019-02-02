public class recursion{

  public static double sqrt(double n){
      return helper(n,1.0,0.00001);
  }

  public static double helper(double n, double guess, double tolerance){
    double check = Math.abs(n - (guess * guess)) / n;
    guess = (n/guess + guess)/ 2.0;
    if (check > tolerance) return helper(n,guess,tolerance);
    return guess;
  }

}
