public class CopyConstructor {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "Barun";
        s1.roll = 54;
        s1.password = "Abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;
        Student s2 = new Student(s1);
        s2.password = "uhef";
        s1.marks[2] = 100;
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}
class Student {
    String name;
    int roll;
    String password;
    int marks[];

    //shallow copy constructor copied properties of s1 on s2
    // Student(Student s1) {
    //     marks = new int[s1.marks.length];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks;
    // }
    
    //deep Copy constructor
    Student(Student s1){
        marks= new int[3];
        this.name= s1.name;
        this.roll= s1.roll;
        for(int i=0; i<marks.length; i++){
            this.marks[i]= s1.marks[i];

        }
        //value of marks is copied one by one
    }

    Student() {
        marks = new int[3];
        System.out.println("constructor is called...");
    }
    Student(String name) {
        this.name = name;
    }

    Student(int roll) {
        this.roll = roll;
    }
}
