import java.util.Scanner;
public class ManageStudent {
Student[] students = new Student[3];
Scanner scanner = new Scanner(System.in);

ManageStudent(){
    students[0] = new Student(1,"John",15);
    students[1] = new Student(2,"Nick",12);
    students[2] = new Student(3,"Tim",18);
}

public void show(){
    for(Student s : students){
        System.out.println(s.getId() + " - " + s.getName() + " - " +s.getAge());
    }
}
public void add(){
    System.out.println("Nhap id");
    int id = Integer.parseInt(scanner.nextLine());
    System.out.println("Nhap ten");
    String name = scanner.nextLine();
    System.out.println("Nhap tuoi");
    int age = Integer.parseInt(scanner.nextLine());
    Student student = new Student(id,name,age);
    Student [] student1 = new Student[students.length + 1];
    student1[student1.length - 1] = student;
    for (int i = 0; i < students.length; i++){
        student1[i] = students[i];
    }
    students = student1;
}
public void edit(){
    System.out.println("Nhap id can sua");
    int id = Integer.parseInt(scanner.nextLine());
    System.out.println("Nhap ten sinh vien can sua");
    String name = scanner.nextLine();
    System.out.println("Nhap lai tuoi");
    int age = Integer.parseInt(scanner.nextLine());
    Student  student2 = new Student(id,name,age);
    for (int i = 0; i < students.length; i++) {
        if (students[i].getId() == student2.getId()) {
            students[i].setName(student2.getName());
            students[i].setAge(student2.getAge());
            break;
        }
        else
            System.err.println("     Error");
    }
}


    public void delete() {
        System.out.println("Nhap id can xoa:");
        int id = Integer.parseInt(scanner.nextLine());

        // Kiểm tra xem ID có tồn tại trong mảng sinh viên hay không
        boolean found = false;
        for (Student student : students) {
            if (student.getId() == id) {
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay sinh vien co ID la " + id);
            return;
        }

        // Sao chép các sinh viên khác vào một mảng mới
        Student[] studentNew = new Student[students.length - 1];
        int index = 0;
        for (Student student : students) {
            if (student.getId() != id) {
                studentNew[index] = student;
                index++;
            }
        }
        students = studentNew;
}
public void search (){
    System.out.println("Nhap ten sinh vien");
    String name;
    name = scanner.nextLine();
    for (Student student: students) {
        if(name.equals(student.getName())){
            System.out.println(student.getId() + " - " + student.getName() + " - " +student.getAge());
        }
        else
            System.err.println("Không tìm thấy tên sinh viên");
    }
    }
    public void showForAge (){
    Student age;
        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students.length; j++) {
                if(students[i].getAge() < students[j].getAge()) {
                    age = students[i];
                    students[i] = students[j];
                    students[j] = age;
                }
            }
        }
        System.out.println("Danh sách mảng đã sắp xếp");
        show();
    }
}
