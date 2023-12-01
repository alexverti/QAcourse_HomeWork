package homework1;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        System.out.println("Введите номер квартиры: ");
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        System.out.println("Введите колличество квартир на этажеЖ ");
        int m = console.nextInt();
        int number_entrance = ((n - 1) / (9 * m)) + 1;
        if (n > 0) {
            System.out.println("Ваша квартира в подъезде № " + number_entrance);
        } else {
            System.out.println("Вы ввели неправильный номер квартиры!");
        }
    }
}
