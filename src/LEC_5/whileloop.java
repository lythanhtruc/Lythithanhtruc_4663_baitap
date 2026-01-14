package LEC_5;

import java.util.Scanner;

public class whileloop {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String phrase;

        do {
            System.out.print("Type your password: ");
            phrase = console.next();
        } while (!phrase.equals("duytan"));

        System.out.println("Correct password!");
    }
}
