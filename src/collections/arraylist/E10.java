package collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;

// 10. Write a Java program to shuffle elements in a array list.
public class E10 {
  
  public static void solution(ArrayList<String> arrayInput) {
    System.out.println("\nExercise 10:");
    System.out.println("input: " + arrayInput);
    System.out.println("Adding more elements...");

    arrayInput.add("cyan");
    arrayInput.add("magenta");
    arrayInput.add("yellow");

    Collections.shuffle(arrayInput);
    System.out.println("shuffled: " + arrayInput);
  }
}
