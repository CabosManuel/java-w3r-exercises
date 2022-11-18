package collections.arraylist;

import java.util.ArrayList;

// 13. Write a Java program to compare two array lists.
public class E13 {
  
  public static void solution(ArrayList<String> list1, ArrayList<String> list2) {
    System.out.println("\nExercise 13:");
    ArrayList<String> compareList = new ArrayList<>();
    
    System.out.println("list 1: " + list1);
    System.out.println("list 2: " + list2);

    System.out.println("Comparing list 1 in list 2:");
    for (String string : list2) {
       compareList.add(list1.contains(string) ? "yes" : "no");
    }
    System.out.println(compareList);
  }
}
