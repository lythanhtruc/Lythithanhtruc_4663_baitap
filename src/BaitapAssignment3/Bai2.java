
package BaitapAssignment3;

import java.util.Random;

public class Bai2 {

    public static void main(String[] args) {
        Random rd = new Random();
        double n = 1.8 + rd.nextDouble() * (8.0 - 1.8);
        System.out.println("Số thực ngẫu nhiên: " + n);
    }
}
