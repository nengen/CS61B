public class DrawingTriangle {

  public static void main(String[] args) {
    int col = 0;
    int row = 0;
    int size = 5;

    while (row < size) {
      while (col <= row) {
        System.out.print('*');
        col += 1;
      }
      System.out.println();
      col = 0;
      row += 1;
    }

    }
  }
