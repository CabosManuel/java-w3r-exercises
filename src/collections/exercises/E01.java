package collections.exercises;

import java.util.ArrayList;

// 1. Write a Java program to create a new array list, add some colors (string) and print out the collection
public class E01 {
  
  static ArrayList<String> colors = new ArrayList<String>();
  
  public static void solution(){
    System.out.println("Exercise 01:");
    colors.add("red");
    colors.add("green");
    colors.add("blue");

    System.out.println(colors.toString());
  }

  public static ArrayList<String> getColors() {
    return colors;
  }
}
