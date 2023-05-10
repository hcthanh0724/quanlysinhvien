import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       ManageStudent manageStudent = new ManageStudent();
       while (true) {
           System.out.println("Quản lý sinh viên");
           System.out.println("1. Hiển thị");
           System.out.println("2.Thêm");
           System.out.println("3. Sửa");
           System.out.println("4. Xóa");
           System.out.println("5. Tìm kiếm theo tên");
           System.out.println("6. Sắp xếp theo tuổi");
           System.out.println("7. Thoát");
           int choice = Integer.parseInt(scanner.nextLine());
           switch (choice){
               case 1:
                   //hien thi
                   manageStudent.show();
                   break;
               case 2:
                   //them
                   manageStudent.add();
                   break;
               case 3:
                   //sua
                   manageStudent.edit();
                   break;
               case 4:
                   manageStudent.delete();
                   //xoa
                   break;
               case 5:
                   //tim kiem ten
                   manageStudent.search();
                   break;
               case 6:
                   //sap xep tuoi
                   manageStudent.showForAge();
                   break;
               case 7:
                   System.exit(1);
           }
       }
    }
}