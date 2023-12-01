package homework1;

import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        System.out.println("Hello, input your data: ");
        Scanner console = new Scanner(System.in);
        int luckyTicket = console.nextInt();

        if (luckyTicket > 99999 && luckyTicket <= 999999) {

            int firstPart = luckyTicket / 1000;
            int secondPart = luckyTicket % 1000;
            int sumFirstPart = firstPart / 100 + ((firstPart / 10) % 10) + firstPart % 10;
            int sumSecondPart = secondPart / 100 + ((secondPart / 10) % 10) + secondPart % 10;
            if (sumFirstPart == sumSecondPart) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }


        } else {
            System.out.println("Wrong number");
        }
    }
}
