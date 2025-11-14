package org.example;
import java.util.*;

public class UserRegistry {
    private List<User> users = new ArrayList<>();
    private int nextId = 1;

    public void addUser(String name, String email, String password) {
        User user = new User(nextId++, name, email, password);
        users.add(user);
        System.out.println(" User registered successfully!");
    }

    public void viewUsers() {
        if (users.isEmpty()) {
            System.out.println(" No users found.");
            return;
        }
        System.out.println("\n--- Registered Users ---");
        users.forEach(System.out::println);
    }

    public void updateUser(int id, String name, String email) {
        for (User user : users) {
            if (user.getId() == id) {
                user.setName(name);
                user.setEmail(email);
                System.out.println(" User updated successfully!");
                return;
            }
        }
        System.out.println(" User not found.");
    }

    public void deleteUser(int id) {
        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()) {
            User user = iterator.next();
            if (user.getId() == id) {
                iterator.remove();
                System.out.println(" User deleted successfully!");
                return;
            }
        }
        System.out.println(" User not found.");
    }
}
