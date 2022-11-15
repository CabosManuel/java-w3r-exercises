package collections.arraylist;

import java.util.ArrayList;

// 7. Write a Java program to search an element in a array list.
public class E07 {
  
  public static void solution(ArrayList<String> array, String input) {
    System.out.println("\nExercise 07:");
    try {
      int index = array.indexOf(input);
      String element = array.get(index);
      System.out.println(index + ": " + element);
    } catch (Exception e) {
      System.err.println("No existe \"" + input + "\"");
    }
  }
}
