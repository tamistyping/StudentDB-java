import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int classYear;
    private String studentID;
    private String courses;
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 100;

    public Student(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter student first name: ");
        this.firstName = s.nextLine();

        System.out.println("Enter student last name: ");
        this.lastName = s.nextLine();

        System.out.println("Enter student class year (7-11): ");
        this.classYear = s.nextInt();

        setStudentID();
    }

    private void setStudentID(){
        id++;
        this.studentID = classYear + "" + id;
    }

    public void enroll(){
            do {
                System.out.print("Enter course to enroll (Q to quit): ");
                Scanner scan = new Scanner(System.in);
                String course = scan.nextLine();
                if (!course.equalsIgnoreCase("Q")) {
                    courses = courses + "\n " + course;
                    tuitionBalance = tuitionBalance + costOfCourse;
                } else {break;}
            } while(true);
    }

    public void viewBalance(){
        System.out.println("Your balance is: £" + tuitionBalance);
    }

    public void payTuition(){
        viewBalance();
        System.out.print("Enter your payment: £");
        Scanner s = new Scanner(System.in);
        int payment = s.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of £" + payment);
        viewBalance();
    }

    public String showInfo(){
        return "Name: " + firstName + " " + lastName + "\nCourses Enrolled:" + courses  + "\nStudent ID:" + studentID + "\nBalance: £" + tuitionBalance;
    }
}
