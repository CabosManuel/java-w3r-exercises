package collections.arraylist;

import java.util.ArrayList;

// 12. Write a Java program to extract a portion of a array list.
public class E12 {
  
  public static void solution(ArrayList<String> array) {
    System.out.println("\nExercise 12:");
    System.out.println("input: " + array);
    
    System.out.println("portion: " + array.subList(0, 4));
  }
}
