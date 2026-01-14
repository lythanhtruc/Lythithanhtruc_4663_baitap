import java.util.Scanner;

public class BaiTap_LYTHITHANHTRUC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ho va ten: ");
        String hoVaTen = sc.nextLine();

        System.out.print("Nhap ma so sinh vien: ");
        int studentID = sc.nextInt();
        sc.nextLine();

        System.out.print("Nhap que quan: ");
        String hometown = sc.nextLine();

        System.out.print("Nhap GPA: ");
        float gpa = sc.nextFloat();
        sc.nextLine();

        System.out.print("Nhap nganh hoc (major): ");
        String major = sc.nextLine();

        System.out.print("Co hoc bong khong? (true/false): ");
        boolean scholarship = sc.nextBoolean();

        System.out.println("\n----- THONG TIN SINH VIEN -----");
        System.out.println("Ho va ten: " + hoVaTen);
        System.out.println("Ma so sinh vien: " + studentID);
        System.out.println("Que quan: " + hometown);
        System.out.println("GPA: " + gpa);
        System.out.println("Nganh hoc: " + major);
        System.out.println("Co hoc bong: " + scholarship);
    }
}


