package homework2;

import java.util.Scanner;

/*Написать программу, которая проверяет, все ли значения элементов массива одинаковые.
Вывести: YES - если все одинаковы и NO - если имеется хоть одно различие.
Массив задаётся и инициализируется в начале программы.*/
public class Task3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Сколько элементов массива? ");
        int length = console.nextInt();
        int[] myArray = new int[length];
        System.out.println("Введите элементы массива ");
        for (int i = 0; i < length; i++) {
            myArray[i] = console.nextInt();
        }
        int value = myArray[0];
        boolean flag = true;
        for (int i = 1; i < length; i++) {
            if (value == myArray[i]) {
                flag = true;
            } else {
                flag = false;
            }
        }
        if (flag == true) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}