package homework2;

/*Заполнить массив на 15 элементов числами Фибоначчи.
Вывести на консоль толко чётные элементы массива.*/
public class Task1 {
    public static void main(String[] args) {
        int[] fibonachiNumber = new int[15];
        fibonachiNumber[0] = 0;
        fibonachiNumber[1] = 1;
        for (int i = 2; i < 15; i++) {
            fibonachiNumber[i] = fibonachiNumber[i - 1] + fibonachiNumber[i - 2];
        }
        for (int i = 0; i < 15; i++) {
            if (fibonachiNumber[i] % 2 == 0) {
                System.out.println(fibonachiNumber[i]);
            }
        }
    }

}
