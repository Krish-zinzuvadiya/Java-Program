
/* QB269
 * Write a program that reads in a list of names and corresponding
phone numbers from the user, and stores them in a HashMap.
The program should then prompt the user for a name and output
the corresponding phone number, or a message indicating that
the name is not in the map.

 */
import java.util.HashMap;
import java.util.*;

public class PhoneBookSimulator {
    public static void main(String[] args) {
        HashMap<String, String> phonebook = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        String name, number;
        while (true) {
            System.out.print("Enter Name");
            name = sc.nextLine();

            System.out.print("Enter Number");
            number = sc.nextLine();
            phonebook.put(name, number);
            System.out.print("Do you want to add Data ? Enter Yes or No :-");
            String choice = sc.nextLine();
            if (choice.equalsIgnoreCase("NO")) {
                break;
            }
        }

        while (true) {
            System.out.println("Enter the name you want to search from phonebook ?");
            String searchName = sc.nextLine();
            String searchNumber = phonebook.get(searchName);
            if (searchNumber != null) {
                System.out.println("Phone Number of " + searchName + " = " + searchNumber);
                break;
            } else {
                System.out.println("Name is not there in phonebook");
            }
        }
    }
}