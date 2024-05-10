import java.util.Scanner;

public class StudentDatabaseapp {
    public static void main(String[] args){

        System.out.print("Enter number of students you want to enroll: ");
        Scanner s = new Scanner(System.in);
        int numOfStudents = s.nextInt();
        Student[] students = new Student[numOfStudents];

        for (int n=0; n<numOfStudents; n++){
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();
            System.out.println(students[n].showInfo());
        }
    }
}
