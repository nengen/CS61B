public class Larger{

  //def is almost equivalent to public static
  //Functions need declared types as well.
  //Functions can only return one thing
  //Must declare types of the parameters
  public static int larger(int x, int y) {
    if (x > y) {
      return x;
    }
    return y;
  }

  public static void main(String[] args) {
    System.out.println(larger(5, 10));
  }

}
