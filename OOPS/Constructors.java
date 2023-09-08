public class Constructors {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Barun");
        System.out.println(s2.name);
        Student s3 = new Student(123);
        System.out.println(s3.roll);
        //Student s4= new Student("Aman", 657); error
    }
}
class Student {
    String name;
    int roll;

    Student() {
        System.out.println("constructor is called...");
    }

    Student(String name) {
        this.name = name;
    }

    Student(int roll) {
        this.roll = roll;
    }
}