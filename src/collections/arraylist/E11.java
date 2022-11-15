package collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;

// 11. Write a Java program to reverse elements in a array list.
public class E11 {
  
  public static void solution(ArrayList<String> array) {
    System.out.println("\nExercise 11:");
    System.out.println("input: " + array);
    System.out.println("Sorting elements...");
    Collections.sort(array);
    System.out.println("sorted: " + array);
    
    Collections.reverse(array);
    System.out.println("reversed: " + array);
  }
}
