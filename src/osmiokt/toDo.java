package osmiokt;

import java.util.ArrayList;
import java.util.Scanner;

public class toDo {
    static Scanner sc = new Scanner(System.in);

    static void addTask(ArrayList<String> list) {
        System.out.println("Enter task to add: ");
        String task = sc.nextLine();
        list.add(task);
    }

    static void removeTask(ArrayList<String> list) {
        if (list.isEmpty()) {
            System.out.println("No tasks to remove.");
            return;
        }

        System.out.println("Enter the number of the task to remove: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + ". " + list.get(i));
        }

        int index = sc.nextInt();
        sc.nextLine();

        if (index > 0 && index <= list.size()) {
            list.remove(index - 1);
            System.out.println("Task removed.");
        } else {
            System.out.println("Invalid index.");
        }
    }


    static void displayTasks(ArrayList<String> list) {
        for (String each : list) {
            System.out.println(each);
        }
    }

    public static void main(String[] args) {
        var toDoList = new ArrayList<String>();
        System.out.println("""
                Press the following numbers for:
                1 -> Add task
                2 -> Remove task
                3 -> Display all tasks
                4 -> End program
                """);
        System.out.println("Input: ");

        while (true) {
            int command = sc.nextInt();
            sc.nextLine();
            if (command == 4) break;
            switch (command) {
                case 1 -> addTask(toDoList);
                case 2 -> removeTask(toDoList);
                case 3 -> displayTasks(toDoList);
            }
        }
    }
}
