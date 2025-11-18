package problemsolving;

public class StudentClass {
//    Assignment 1:
//
//    Create two Student objects and initialize their properties.
//
//    Print the details of each student and the total number of students.
//
//    Modify the age of one student and print the updated details.
//
//    Create another Student object and update the total number of students.
//
//    Print the details of the new student and the updated total number of students.


    String studentName;
    int studentAge;
    int studentRollNumber;

    public StudentClass(int studentRollNumber, String studentName, int studentAge) {
        this.studentRollNumber = studentRollNumber;
        this.studentName = studentName;
        this.studentAge = studentAge;
    }

    public static void main(String[] args) {
        int totalStudents = 0;
        StudentClass stu1 = new StudentClass(1," Rimjhim Mallick", 12);
        System.out.println("Student name is: "+stu1.studentName+ '\n'+"Roll number is: "+stu1.studentRollNumber+ '\n'+"Age of the student is: "+stu1.studentAge);
        totalStudents++;
        System.out.println("--------------------------------------------------");
        StudentClass stu2 = new StudentClass(2," Kaushik Mandal", 12);
        System.out.println("Student name is: "+stu2.studentName+ '\n'+"Roll number is: "+stu2.studentRollNumber+ '\n'+"Age of the student is: "+stu2.studentAge);
        totalStudents++;
        System.out.println("--------------------------------------------------");
        System.out.println("Total number of students are: "+totalStudents);
        System.out.println("--------------------------------------------------");
        stu1.studentAge = 13;
        System.out.println("Student name is: "+stu1.studentName+ '\n'+"Roll number is: "+stu1.studentRollNumber+ '\n'+"Age of the student is: "+stu1.studentAge);
        System.out.println("--------------------------------------------------");
        StudentClass stu3 = new StudentClass(3," Abrahim Lincon", 13);
        System.out.println("Student name is: "+stu3.studentName+ '\n'+"Roll number is: "+stu3.studentRollNumber+ '\n'+"Age of the student is: "+stu3.studentAge);
        totalStudents++;
        System.out.println("--------------------------------------------------");
        System.out.println("Total number of students are: "+totalStudents);

    }
}
