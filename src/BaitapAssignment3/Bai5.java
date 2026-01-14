
package BaitapAssignment3;
import java.util.Random;
import java.util.Scanner;

public class Bai5 {


    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);

        int random = rd.nextInt(10) + 1;
        int count = 0;
        int input;

        do {
            System.out.print("Nhập số (1–10): ");
            input = sc.nextInt();
            count++;
        } while (input != random);

        System.out.println("Đúng!");
        System.out.println("Số ngẫu nhiên: " + random);
        System.out.println("Số lần nhập: " + count);
    }
}

    

