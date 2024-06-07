/*
 * Aim :- ->Store Dictionary Words and defination In Hashmap.
          ->1. Ask user Enter Word To Search In Dictionary Otherwise Enter Exit.
          ->2. If Word Found Then Prints it's Defination
          ->3. Otherwise Ask user To Word Not Found But Do You want To Add It. ..
          ->4. If User Say 'Yes' Then Ask Him For Defination Of New Word & Store It In Dictionary
               Otherwise Print Keep Searching Again
          ->5. At last Print All words Of Dictionary.
 */

import java.util.HashMap;
import java.util.Scanner;

public class Ex90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> dictionary = new HashMap<>();
        dictionary.put("red", "it is colour.");
        dictionary.put("dhoni", "thala for a reason.");
        dictionary.put("thara paisa", "thara pyar.");

        while (true) {
            System.out.print("Enter Word To Search In Dictionary Or Enter Exit : ");
            String input = sc.nextLine().toLowerCase();
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Thank You For Using Dictionary ! ");
                break;
            } else {
                if (dictionary.containsKey(input)) {
                    System.out.println(input + " Found ");
                    System.out.println("Defination = " + dictionary.get(input));
                } else {
                    System.out.println(input + " Not Found ");
                    System.out.print("Do You want To Add This Word ? (Yes/No) : ");
                    String answer = sc.nextLine().toLowerCase();
                    if (answer.equalsIgnoreCase("yes")) {
                        System.out.print("Enter Defination For " + input + " :- ");
                        String def = sc.nextLine();
                        dictionary.put(input, def);
                        System.out.println(input + " Added Successfully ");
                    } else {
                        System.out.println("Keep Searching Again !!!");
                    }
                }
            }
        }
        System.out.println("-----All Words Of Dictionary-----");
        for (String s : dictionary.keySet()) {
            System.out.println(s);
        }
    }
}
