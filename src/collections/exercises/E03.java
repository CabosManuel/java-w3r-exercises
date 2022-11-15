package collections.exercises;

import java.util.ArrayList;

// 3. Write a Java program to insert an element into the array list at the first position.
public class E03 {
  
  public static void solution(ArrayList<String> array, String newElement) {
    System.out.println("\nExercise 03:");
    array.add(0, newElement);
    System.out.println(array);
  }
}
