package collections.arraylist;

import java.util.ArrayList;

// 6. Write a Java program to remove the third element from a array list.
public class E06 {
  
  public static void solution(ArrayList<String> array) {
    System.out.println("\nExercise 06:");
    array.remove(2);
    System.out.println(array.toString());
  }
}
