package BaitapAssignment3;

import java.util.Random;
import java.util.Scanner;

public class Bai4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        double random = 1.0 + rd.nextDouble() * 99.0;
        System.out.print("Nhập số thực (1–100): ");
        double user = sc.nextDouble();

        System.out.println("Số ngẫu nhiên: " + random);

        if (user > random) {
            System.out.println("Lớn hơn");
        } else if (user < random) {
            System.out.println("Nhỏ hơn");
        } else {
            System.out.println("Bằng nhau");
        }
    }
}
