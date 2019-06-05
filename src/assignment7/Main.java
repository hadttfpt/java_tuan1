package assignment7;

public class Main {
    /*
    Tạo bảng phonebook gồm các trường: id, user_id , telephone, status
user_id là gía trị tương ứng để nối với bảng user cũ
Viết DAO class để quản lý việc truy xuất dữ liệu liên quan đến số điện thoại.
 Thêm 1 method để tìm số đt của 1 user nào đó
Tạo signleton instance cho class này
     */
    public static void main(String[] args){
        Dao d = new Dao();
        System.out.println(d.getUser(1));
    }
}
