import java.util.Scanner;

public class SoSanh {

    public static void soSanhHaiSo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so thu nhat: ");
        int a = scanner.nextInt();

        System.out.print("Nhap so thu hai: ");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println(a + " lon hon " + b);
        } else {
            System.out.println(b + " lon hon " + a);
        }
    }

    public static void main(String[] args) {
        soSanhHaiSo();
    }
}
