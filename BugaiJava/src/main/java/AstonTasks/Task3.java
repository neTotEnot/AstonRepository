package AstonTasks;

import java.util.Arrays;

//3. Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3
public class Task3 {

    public static void method(int[] array) {

        for (int j = 0; j < array.length; j++) {
            array[j] = (int) (Math.random() * 10);
        }
        System.out.println("Рандомный массив: " + Arrays.toString(array));
        for (int j : array) {
            if (j % 3 == 0)
                System.out.print(j + " ");
        }
    }

    public static void main(String[] args) {
        int[] array = new int[10];
        method(array);
    }
}