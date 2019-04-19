package demo;

import java.util.Scanner;

public class prime {
    public static boolean prime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return n > 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so n = ");
        int n = sc.nextInt();
        System.out.println("Cac so nguyen to nho hon " + n);
        for (int i = 0; i < n; i++) {
            if (prime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
