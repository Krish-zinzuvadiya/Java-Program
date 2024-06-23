// QB265	
/*Make the system as User interactive and give choices to user. 
Web browser history: Write a program that simulates a web browser history using an ArrayDeque. 
The program should allow the user to navigate back and forward through their history of visited web pages, 
similar to how a web browser works. The program should keep track of the URLs of visited web pages using 
an ArrayDeque, where each element in the deque represents a visited web page. When the user navigates to 
a new web page, you can push the URL onto the deque. When the user navigates back or forward, you can pop 
URLs off the front or back of the deque, respectively.*/

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class WebBrowserHistory {
    static Deque<String> history = new ArrayDeque<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            printMenu();
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character after reading the integer

            switch (choice) {
                case 1:
                    System.out.print("Enter the URL to visit: ");
                    String url = scanner.nextLine();
                    navigateTo(url);
                    break;
                case 2:
                    navigateBack();
                    break;
                case 3:
                    navigateForward();
                    break;
                case 4:
                    showHistory();
                    break;
                case 5:
                    System.out.println("Exiting the web browser.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }

    static void printMenu() {
        System.out.println("=========== Web Browser History ===========");
        System.out.println("1. Visit a new web page");
        System.out.println("2. Navigate back");
        System.out.println("3. Navigate forward");
        System.out.println("4. Show history");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    static void navigateTo(String url) {
        history.addLast(url);
        System.out.println("Navigated to: " + url);
    }

    static void navigateBack() {
        if (history.isEmpty()) {
            System.out.println("No history to navigate back.");
        } else {
            String url = history.pollLast();
            System.out.println("Navigated back to: " + url);
        }
    }

    static void navigateForward() {
        if (history.isEmpty()) {
            System.out.println("No history to navigate forward.");
        } else {
            String url = history.pollFirst();
            System.out.println("Navigated forward to: " + url);
        }
    }

    static void showHistory() {
        if (history.isEmpty()) {
            System.out.println("No history available.");
        } else {
            System.out.println("Web Browser History:");
            int index = 1;
            for (String url : history) {
                System.out.println(index++ + ". " + url);
            }
        }
    }
}