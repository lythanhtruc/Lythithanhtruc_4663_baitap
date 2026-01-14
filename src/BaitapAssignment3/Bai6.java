package BaitapAssignment3;

import java.util.Random;
import java.util.Scanner;

public class Bai6 {

    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);

        int random = rd.nextInt(100) + 1;
        int guess;

        while (true) {
            System.out.print("Nhập số đoán: ");
            guess = sc.nextInt();

            if (guess == random) {
                System.out.println("🎉 Chúc mừng!");
                break;
            } else if (guess < random) {
                System.out.println("Nhỏ hơn");
            } else {
                System.out.println("Lớn hơn");
            }
        }
    }
}
