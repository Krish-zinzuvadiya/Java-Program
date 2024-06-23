import java.io.*;
import java.util.*;

public class BankPassbook {
    static Hashtable<Integer, Double> accounts;
    static Scanner sc = new Scanner(System.in);

    BankPassbook() throws Exception {
        accounts = new Hashtable<>();
        accounts.put(1111, 20000.00);
        accounts.put(2222, 20000.00);
        accounts.put(3333, 20000.00);
        for (Map.Entry<Integer, Double> element : accounts.entrySet()) {
            BufferedWriter writer = new BufferedWriter(new FileWriter(element.getKey() + ".txt"));
            writer.write("Account Id: " + element.getKey());
            writer.newLine();
            writer.write("Opening Balance: " + element.getValue());
            writer.newLine();
            writer.write("Cause        Amount     Balance");
            writer.newLine();
            writer.close();
        }
    }

    public static void main(String[] args) throws Exception {
        BankPassbook bank = new BankPassbook();
        while (true) {
            System.out.println();
            System.out.print("Enter Account id: ");
            int id = Integer.parseInt(sc.nextLine());
            if (accounts.containsKey(id)) {
                bank.options(id);
            } else {
                System.out.println("Account not found");
            }
        }

    }

    private void options(int accountId) throws IOException {
        while (true) {
            System.out.println("""

                    0 : Exit
                    1 : deposit
                    2 : withdraw
                    3 : print passbook
                    """);
            switch (sc.nextInt()) {
                case 0: {
                    System.out.println("Thank You!!!");
                    System.exit(0);
                    break;
                }
                case 1: {
                    deposit(accountId);
                    break;
                }
                case 2: {
                    withdraw(accountId);
                    break;
                }
                case 3: {
                    writeFinal(accountId);
                    print(accountId);
                    break;
                }
            }
        }
    }

    void deposit(int accountId) throws IOException {
        System.out.print("Enter ammount: ");
        double amount = Double.parseDouble(sc.next());
        accounts.put(accountId, accounts.get(accountId) + amount);
        writeToPassBook(accountId, "deposit", amount, accounts.get(accountId));
        System.out.println("Successfully deposited");
    }

    private void withdraw(int accountId) throws IOException {
        System.out.print("Enter ammount: ");
        double amount = Double.parseDouble(sc.next());
        if (amount > accounts.get(accountId)) {
            System.out.println("Not enough balance");
        } else {
            accounts.put(accountId, accounts.get(accountId) - amount);
            System.out.println("Successfully withdrawed");
            writeToPassBook(accountId, "withdraw", amount, accounts.get(accountId));
        }
    }

    private void writeToPassBook(int accountId, String msg, double amount, Double balance) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(accountId + ".txt", true));
        writer.write(msg + "      " + amount + "     " + balance);
        writer.newLine();
        writer.close();
    }

    private void writeFinal(int accountId) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(accountId + ".txt", true));
        writer.write("Closing Balance :" + accounts.get(accountId));
        writer.newLine();
        writer.close();
    }

    private void print(int accountId) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(accountId + ".txt"));
        String line = reader.readLine();
        while (line != null) {
            System.out.println(line);
            line = reader.readLine();
        }
        reader.close();
    }
}