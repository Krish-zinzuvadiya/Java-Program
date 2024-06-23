/* QB266
 * 
 * In my restaurant I used to manage it well as per the order. I never
want to skip any order from the customer. So I prepare a rule:
When I get the order I add it in the last of my cook queue. And
when the order is ready I used to pick it up from the first of the
cook queue.
So, write a java program with class Restaurant. Create a queue
cook which contains item names. Ask user weather he wants to
Order or take food. 

If user press 1 then ask for the name of the
item and it should be added in the cook queue.

If user press 2 then The first item from the queue should be
removed from the queue.

If user press 3 then he can see the items of the queue. If user
press 4 then he should move out from the Restaurant. 

 */

import java.util.ArrayDeque;
import java.util.*;

class Restaurant {

    ArrayDeque<String> cook;

    Restaurant() {
        cook = new ArrayDeque<>();
    }
}

class RestaurantSimulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Restaurant r = new Restaurant();
        int ch;
        do {
            System.out.println(
                    "Enter Your Choice\n 1 To What to Order? \n 2 for Serve the order \n 3. view Order\n 4. Move out from restaurant");
            ch = sc.nextInt();
            sc.nextLine();
            switch (ch) {
                case 1:
                    System.out.println("Enter Item to Order");
                    String item = sc.nextLine();
                    r.cook.addLast(item);
                    System.out.println("Your order for item " + item + " has been placed...");
                    break;

                case 2:
                    if (!r.cook.isEmpty()) {
                        String servingItem = r.cook.pollFirst();
                        System.out.println("Serving item " + servingItem + " to customer....");
                    } else {
                        System.out.println("NO ORDER TO SERVE");
                    }
                    break;

                case 3:

                    if (!r.cook.isEmpty()) {
                        System.out.println("----- LIST OF ITEMS IN QUEUE TO BE COOKED ------");
                        int i = 1;
                        for (String s : r.cook) {
                            System.out.println("Item " + i + " = " + s);
                            i++;
                        }
                    } else {
                        System.out.println("NO ORDER TO VIEW IN QUEUE");
                    }
                    break;

                case 4:
                    System.out.println("THANK YOU... VISIT AGAIN");
                    break;
            }
        } while (ch != 4);
    }
}