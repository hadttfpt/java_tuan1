package baikiemtra;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Contact c = new Contact();
        int choice;
        System.out.println("1.Add phone");
        System.out.println("2.Find contact by name");
        System.out.println("3.Display contacts");
        System.out.println("4.Exit");
        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();
        sc.nextLine();
        while (true) {
            switch (choice) {
                case 1:
                    c.addPhone();
                    break;
                case 2:
                    System.out.println("Nhap ten muon tim sdt");
                    String name = sc.nextLine();
                    c.search(name);
                    break;
                case 3:
                    c.showBook();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Loi");
                    break;
            }
        }
    }
}
