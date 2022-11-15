package collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;

// 9. Write a Java program to copy one array list into another.
public class E09 {
  
  static ArrayList<String> colorsCopy;
  
  public static void solution(ArrayList<String> arrayInput) {
    System.out.println("\nExercise 09:");
    System.out.println("input: " + arrayInput);
    
    colorsCopy = new ArrayList<String>();
    colorsCopy.add("1");
    colorsCopy.add("2");
    colorsCopy.add("3");
    System.out.println("copy: " + colorsCopy);
    
    Collections.copy(colorsCopy, arrayInput);
    
    System.out.println("copy: " + colorsCopy);
  }

  public static ArrayList<String> getCopy() {
    return colorsCopy;
  }
}
