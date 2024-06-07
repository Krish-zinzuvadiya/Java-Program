/*
 * Aim :- ->Ask User To Enter Prifix And PrintAll Words Starts With That Prifix Along With Defination.
 */

import java.util.HashMap;
import java.util.Scanner;
import java.util.Hashtable;

public class Ex91 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hashtable<String, String> dictionary = new Hashtable<>();
        dictionary.put("red", "it is colour.");
        dictionary.put("dhoni", "thala for a reason.");
        dictionary.put("dhamal", "it is a movie.");
        dictionary.put("dhobi", "wash cloths.");
        dictionary.put("cry", "to call loudly.");
        dictionary.put("crow", "a bird of the genus Corvus.");
        dictionary.put("crispy", "crunchy friable hard short.");
        dictionary.put("partner", "one associated with another especially in an action.");
        dictionary.put("parrot", " one of the most intelligent birds.");

        System.out.print("Enter Prifix To Search In Dictionary :- ");
        String prifix = sc.nextLine();
        System.out.println("-----All Releted Words Of Dictionary-----");
        for (String s : dictionary.keySet()) {
            if (s.startsWith(prifix)) {
                System.out.println(s + " ----> " + dictionary.get(s));
            }
        }
    }
}
