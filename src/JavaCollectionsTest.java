import java.util.*;

/**
 * Andrew Howard
 *
 * Shows use of List to add and sort elements of type Product
 */
public class JavaCollectionsTest {

  public static void main(String[] args) {
    // Uses SortedSet
    List<Product> productList = new ArrayList<>();

    AudioPlayer a1 = new AudioPlayer("a1 1", "a1 2");
    AudioPlayer a2 = new AudioPlayer("a2 1", "a2 2");
    AudioPlayer a3 = new AudioPlayer("a3 1", "a3 2");
    AudioPlayer a4 = new AudioPlayer("a4 1", "a4 2");

    //Added out of order
    productList.add(a1);
    productList.add(a3);
    productList.add(a4);
    productList.add(a4);
    productList.add(a2);

    //Organizes List
    Collections.sort(productList);

    //Prints Organized List
    print(productList);

  }

  //Takes in type List and prints with formatting
  public static void print(List<Product> productList) {
    int i = 0;

    for (Product product : productList) {
      System.out.println(productList.get(i) + "\n-------------------------------");
      i++;
    }

  }

}
