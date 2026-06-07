class Student{
    private int id;
    private String name;
    private int age;

    Student(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString(){
        return String.format("Id: %d, Name: %s, Age: %d", this.id, this.name, this.age);
    }
}

public class Bai1{
    public static void main(String[] args){
        Student s = new Student(123, "Nguyen Van A", 22);
        System.out.println(s);
    }
}
