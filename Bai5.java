import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student{
    private String id;
    private String name;
    private double gpa;
    private static int countStudent;

    public Student(){
        countStudent++;
    }

    public void input(Scanner sc){
        System.out.print("Nhập mã sinh viên: ");
        this.id = sc.nextLine();
        System.out.print("Nhập tên sinh viên: ");
        this.name = sc.nextLine();
        System.out.print("GPA của sinh viên: ");
        this.gpa = Double.parseDouble(sc.nextLine());
    }

    public void print(){
        System.out.println("------------------------------");
        System.out.println("Mã sinh viên là: " + this.id);
        System.out.println("Tên sinh viên là: " + this.name);
        System.out.println("GPA của sinh viên là: " + this.gpa);
    }

    public double getGPA(){
        return this.gpa;
    }

    public static int getTotalStudent(){
        return countStudent;
    }
}


public class Bai5{
    public static void main(String[] args){
        List<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        double maxn = Double.MIN_VALUE;
        while(true){
            System.out.println("========== MENU SINH VIÊN =========");
            System.out.println("1. Nhập danh sách sinh viên. ");
            System.out.println("2. In danh sách sinh viên. ");
            System.out.println("3. Tìm sinh viên GPA cao nhất. ");
            System.out.println("4. In tổng số sinh viên đã tạo. ");
            System.out.println("5. Thoát. ");
            System.out.println("Lựa chọn của bạn: ");
            String option = sc.nextLine();
            switch(option){
                case "1":
                    Student s = new Student();
                    s.input(sc);
                    maxn = Math.max(maxn, s.getGPA());
                    list.addLast(s);
                    break;
                case "2":
                    for(var x : list){
                        x.print();
                    }
                    break;
                case "3":
                    System.out.println("Sinh viên có gpa cao nhất là: ");
                    for(var x : list){
                        if(maxn == x.getGPA()){
                            x.print();
                        }
                    }
                    break;
                case "4":
                    System.out.printf("Tổng số sinh viên đã tạo là: %d\n", Student.getTotalStudent());
                    break;
                case "5":
                    System.out.println("Tạm biệt. ");
                    System.exit(0);
                    break;
            }
        }
    }
}
