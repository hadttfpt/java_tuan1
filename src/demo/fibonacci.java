package demo;

import java.util.Scanner;

public class fibonacci {

    public static int fibo(int n) {
        int f0 = 0;
        int f1 = 1;
        int fn = 1;
        if (n == 0 || n == 1) {
            return n;
        } else {
            for (int i = 2; i < n; i++) {
                fn = f0 + f1;
                f0 = f1;
                f1 = fn;
            }
        }
        return fn;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua day ");
        int n = sc.nextInt();
        int sum = 0;
        System.out.println("Day fibonacci la ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibo(i) + " ");
            sum += fibo(i);
        }
        System.out.println();
        System.out.print("Tong cua day la " + sum);
    }
}

