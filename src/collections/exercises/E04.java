package collections.exercises;

import java.util.ArrayList;

// 4. Write a Java program to retrieve an element (at a specified index) from a given array list.
public class E04 {
  
  public static void solution(ArrayList<String> array, int index) {
    System.out.println("\nExercise 04:");
    System.out.println(index + ": " + array.get(index));
  }
}
