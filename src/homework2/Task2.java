package homework2;

/*Заполнить массив на 30 элементов случайными числами от -70 до +50.
Найти минимальный элемент и вывести его на консоль.
Найти максимальный элемент и вывести его на консоль.*/
public class Task2 {
    public static void main(String[] args) {
        int[] randomNumbers = new int[30];
        for (int i = 0; i < 30; i++) {
            double r = Math.random();
            randomNumbers[i] = (int)(r * 120) - 70;
            System.out.println(randomNumbers[i]);
        }
        int min = randomNumbers[0];
        int max = randomNumbers[0];
        for (int i = 1; i < 30; i++) {
            if (min < randomNumbers[i]) {
                min = randomNumbers[i];
            }
            if (max > randomNumbers[i]) {
                max = randomNumbers[i];
            }
        }

        System.out.println(min);
        System.out.println(max);

    }
}
