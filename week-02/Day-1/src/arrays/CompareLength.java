package arrays;

public class CompareLength {
  // - Create an array variable named `firstArrayOfNumbers`
//   with the following content: `[1, 2, 3]`
// - Create an array variable named `secondArrayOfNumbers`
//   with the following content: `[4, 5]`
// - Print "secondArrayOfNumbers is longer" if `secondArrayOfNumbers` has more
//   elements than `firstArrayOfNumbers`
  public static void main(String[] args) {

    int[] firstArrayOfNUmbers = {1,2,3};
    int[] secondArrayOfNumbers = {4,5,6,7};

    if (firstArrayOfNUmbers.length < secondArrayOfNumbers.length){
      System.out.println("secondArrayOfNumbers is longer");
    }
  }

}
