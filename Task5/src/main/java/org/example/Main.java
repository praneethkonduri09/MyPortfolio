package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserRegistry registry = new UserRegistry();
        int choice;

        do {
            System.out.println("\n=== USER REGISTRY MENU ===");
            System.out.println("1. Register User");
            System.out.println("2. View All Users");
            System.out.println("3. Update User");
            System.out.println("4. Delete User");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter email: ");
                    String email = sc.nextLine();
                    System.out.print("Enter password: ");
                    String password = sc.nextLine();
                    registry.addUser(name, email, password);
                }
                case 2 -> registry.viewUsers();
                case 3 -> {
                    System.out.print("Enter user ID to update: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter new name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter new email: ");
                    String email = sc.nextLine();
                    registry.updateUser(id, name, email);
                }
                case 4 -> {
                    System.out.print("Enter user ID to delete: ");
                    int id = sc.nextInt();
                    registry.deleteUser(id);
                }
                case 5 -> System.out.println("👋 Exiting...");
                default -> System.out.println("❌ Invalid choice!");
            }
        } while (choice != 5);

        sc.close();
    }
}
