// QB267
/*Write a java program that reads in a list of integers from the user
and stores them in a HashSet. The program should then compute
the sum of all unique integers in the HashSet and output the
result to the user. If the user enters the same integer multiple
times, it should only be counted once in the sum.
 */

import java.util.*;

public class SumOfUniqueValues {
    public static void main(String[] args) {
        HashSet<Integer> uniqueValues = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter Integer Number ");
            int no = sc.nextInt();
            sc.nextLine();
            System.out.println("DO YOU WANT TO CONTINUE ? YES OR NO");
            uniqueValues.add(no);

            String choice = sc.nextLine();
            if (choice.equalsIgnoreCase("NO")) {
                break;
            }
        }
        int sum = 0;
        for (Integer i : uniqueValues) {
            sum = sum + i;
        }
        System.out.println("SUM = " + sum);
    }
}