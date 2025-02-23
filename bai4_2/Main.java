package bai4_2;

public class  Main {
    public static void main(String[] args) {
        Student student = new Student("Khoa", "123", "Computer Science", 3, 2000.0);
        Staff staff = new Staff("Hoa", "357", "VKU", 35000.0);

        System.out.println(student);
        System.out.println(staff);
    }
}
