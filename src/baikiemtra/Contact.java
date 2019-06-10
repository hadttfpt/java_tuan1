package baikiemtra;

import java.util.HashMap;
import java.util.Scanner;

public class Contact {
    public String name;
    public String phone;
    HashMap<String,String> addressBook = new HashMap<>();

    public void addPhone(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap name ");
        String name = sc.nextLine();
        System.out.println("Nhap phone ");
        String phone = sc.nextLine();
        addressBook.put(name, phone);
    }

    public void showBook(){
        addressBook.forEach((keyInt,valueInt)-> System.out.println(
                "Name "+keyInt+" , phone "+valueInt));
    }

    public void search(String name){
            System.out.println("So dien thoai can tin la " + addressBook.get(name));
    }
    public Contact() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
