package AstonTasks;

import java.util.Scanner;

//1. Составить алгоритм: если введенное число больше 7, то вывести “Привет”
public class Task1 {

    public static void method() {
        System.out.println("Введите число: ");
        try (Scanner scan = new Scanner(System.in)) {
            int num = scan.nextInt();
            if (num > 7) {
                System.out.println("Привет");
            } else {
                System.out.println("Вы ввели число меньше 7");
            }
        } catch (Exception e) {
            System.out.println("Вы ввели невалидное значение");
        }
    }

    public static void main(String[] args) {
        method();
    }
}
