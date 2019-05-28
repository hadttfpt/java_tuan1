package assignment3;

import java.util.Scanner;

public class SubThread extends Thread {
    public int x;

    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so");
        x = sc.nextInt();
        for (int j = 0; j < 20; j++) {
            for (int i = x + 1; true; i++) {
                if (checkSNT(i)) {
                    System.out.print(i+" -> ");
                    x = i;
                    break;
                }
            }

            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
    }

    public boolean checkSNT(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

