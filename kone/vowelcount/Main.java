package kone.vowelcount;

import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) {
    
    int acount = 0;
    int ecount = 0;
    int icount = 0;
    int ocount = 0;
    int ucount = 0;
    
    
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a string, and I will count the vowels present in " +
                     "it: ");
    String input = in.nextLine();
    
    for (int i = 0; i < input.length(); i++) {
      char ch = input.charAt(i);
      if (ch == 'a' || ch == 'A') {
        acount++;
      } else if (ch == 'e' || ch == 'E') {
        ecount++;
      } else if (ch == 'i' || ch == 'I') {
        icount++;
      } else if (ch == 'o' || ch == 'O') {
        ocount++;
      } else if (ch == 'u' || ch == 'U') {
        ucount++;
      }
    }
  
    System.out.println("The vowel 'a' is present: " + acount + " times.");
    System.out.println("The vowel 'e' is present: " + ecount + " times.");
    System.out.println("The vowel 'i' is present: " + icount + " times.");
    System.out.println("The vowel 'o' is present: " + ocount + " times.");
    System.out.println("The vowel 'u' is present: " + ucount + " times.");
    
  }
  
}
