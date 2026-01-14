package BaitapAssignment3;

import java.util.Random;

public class Bai3 {

    public static void main(String[] args) {
        Random rd = new Random();
        int n = rd.nextInt(78) + 3; // 3–80

        System.out.println("Số: " + n);
        if (n % 2 == 0) {
            System.out.println("Đây là số chẵn");
        } else {
            System.out.println("Đây là số lẻ");
        }
    }
}

