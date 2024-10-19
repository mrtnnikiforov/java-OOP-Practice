package lab1;

import java.util.Scanner;
import java.util.ArrayList;

public class toDo {
    static Scanner sc = new Scanner(System.in);

    static void addTask(ArrayList<String> list){
        System.out.println("Enter task to add: ");
        String task = sc.nextLine();
        list.add(task);
    }
    static void removeTask(ArrayList<String> list){
        System.out.println("Enter task to remove: ");
        String task = sc.nextLine();
        list.remove(task);
    }

    static void displayTasks(ArrayList<String> list){
        for (String s : list) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        ArrayList<String> toDoList = new ArrayList<String>();
        addTask(toDoList);
        addTask(toDoList);
        removeTask(toDoList);
        displayTasks(toDoList);
    }
}
