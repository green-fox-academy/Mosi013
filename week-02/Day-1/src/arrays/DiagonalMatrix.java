package arrays;

public class DiagonalMatrix {

  // - Create (dynamically) a two dimensional array
  //   with the following matrix. Use a loop!
  //
  //   1 0 0 0
  //   0 1 0 0
  //   0 0 1 0
  //   0 0 0 1
  //
  // - Print this two dimensional array to the output
  public static void main(String[] args) {
    int[][] matrix = new int[4][4];

    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {
        if (j == i) matrix[i][j] = 1;
        else matrix[i][j] = 0;
      }
    }

    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }
}
