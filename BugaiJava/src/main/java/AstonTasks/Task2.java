package AstonTasks;

import java.util.Scanner;

//2. Составить алгоритм: если введенное имя совпадает с Вячеслав, то вывести “Привет, Вячеслав”, если нет,
//то вывести "Нет такого имени"
public class Task2 {

    public static void method() {
        System.out.println("Введите имя: ");
        try (Scanner scan = new Scanner(System.in)) {
            String name = scan.nextLine();
            if (name.equals("Вячеслав")) {
                System.out.println("Привет, Вячеслав");
            } else {
                System.out.println("Нет такого имени");
            }
        }
    }

    public static void main(String[] args) {
        method();
    }
}
