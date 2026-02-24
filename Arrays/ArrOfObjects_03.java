
class Student
{
    int RollNo;
    String name;
    int marks;
}


public class ArrOfObjects_03 {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.RollNo=1;
        s1.name="Avi";
        s1.marks=99;
                Student s2=new Student();
        s2.RollNo=100;
        s2.name="Sayan";
        s2.marks=0;
                Student s3=new Student();
        s3.RollNo=69;
        s3.name="Mehek";
        s3.marks=89;

        Student students[]=new Student[3];

        students[0]=s1;
        students[1]=s2;
        students[2]=s3;

        // for (int i = 0; i < students.length; i++) {
        //     System.out.println(students[i].RollNo+ " " + students[i].marks + " "+students[i].name);
        // }

        for (Student student : students) {
            System.out.println(student.RollNo+ " " + student.marks + " "+student.name);
        }

    }
}
