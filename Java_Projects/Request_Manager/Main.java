package Java_Projects.Request_Manager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        RequestManager manager = new RequestManager();
        int choice;

        do {
            System.out.println("\n==== SOLUTION REQUEST SYSTEM ====");
            System.out.println("1. Add Request");
            System.out.println("2. List Requests");
            System.out.println("3. Save Requests");
            System.out.println("4. Load Requests");
            System.out.println("5. Exit");
            System.out.print("Choice: ");

            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter user name: ");
                    String user = input.nextLine();
                    System.out.print("Enter request message: ");
                    String message = input.nextLine();
                    manager.addRequest(user, message);
                    break;

                case 2:
                    manager.listRequests();
                    break;

                case 3:
                    try {
                        manager.saveToFile("requests.txt");
                        System.out.println("Saved successfully.");
                    } catch (Exception e) {
                        System.out.println("Error saving file.");
                    }
                    break;

                case 4:
                    try {
                        manager.loadFromFile("requests.txt");
                        System.out.println("Loaded successfully.");
                    } catch (Exception e) {
                        System.out.println("Error loading file.");
                    }
                    break;
            }

        } while (choice != 5);

        System.out.println("Goodbye!");
    }
}

