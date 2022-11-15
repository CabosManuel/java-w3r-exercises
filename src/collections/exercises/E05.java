package collections.exercises;

import java.util.ArrayList;

// 5. Write a Java program to update specific array element by given element.
public class E05 {
  
  public static void solution(ArrayList<String> array, int index, String newElement) {
    System.out.println("\nExercise 05:");
    array.set(index, newElement);
    System.out.println(array.toString());
  }
}
