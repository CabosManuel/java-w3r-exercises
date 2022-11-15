package collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;

// 8. Write a Java program to sort a given array list.
public class E08 {
  
  public static void solution(ArrayList<String> array) {
    System.out.println("\nExercise 08:");
    System.out.println("before: " + array.toString());
    Collections.sort(array);
    System.out.println("after: " + array.toString());
  }
}
