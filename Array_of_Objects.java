class Student{
    int student_roll;
    String student_name;
}

public class Array_of_Objects {
    public static void main(String[] args){

        Student s1 = new Student();
        s1.student_name = "Jack";
        s1.student_roll = 12345;

        Student s2 = new Student();
        s2.student_name = "Pritom";
        s2.student_roll = 56789;

        Student student[] = new Student[2];
        student[0] = s1;
        student[1] = s2;

        for(int i=0;i<student.length;i++){
            System.out.println(student[i].student_name);
            System.out.println(student[i].student_roll);
        }

    }
}
