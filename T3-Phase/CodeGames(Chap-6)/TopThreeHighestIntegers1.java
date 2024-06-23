/* QB261	
Write a Java program that takes a list of integers as input from the user and stores them in a PriorityQueue.
The program should then remove and display the top three highest integers from the PriorityQueue.*/

import java.util.*;

public class TopThreeHighestIntegers1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

        System.out.print("Enter the number of integers: ");
        int numIntegers = scanner.nextInt();

        for (int i = 0; i < numIntegers; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            int value = scanner.nextInt();
            priorityQueue.add(value);
        }

        System.out.println("Top three highest integers:");
        // Removing and displaying the top three highest integers
        for (int i = 0; i < 3; i++) {
            if (!priorityQueue.isEmpty()) {
                int highestInt = priorityQueue.poll();
                System.out.println(highestInt);
            } else {
                System.out.println("Not enough integers in the PriorityQueue.");
                break;
            }
        }
    }
}