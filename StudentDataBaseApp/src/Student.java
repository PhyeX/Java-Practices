
import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String StudentID;
    private String courses="";
    private int tuitionBalance=0;
    private static int costOfCourse = 600;
    private static int id = 1000;

    public Student(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter student first name:");
        this.firstName = scan.nextLine();
        System.out.println("Enter student last name:");
        this.lastName = scan.nextLine();
        System.out.println(" 1-Freshman \n 2-Sophomore \n 3-Junior \n 4-Senior \n Enter Student Class");
        this.gradeYear = scan.nextInt();
        setStudentID();

    }
    //Generate an ID
    private void setStudentID(){
        id++;
        this.StudentID = gradeYear + "" + id;
    }
    //Enroll in courses
    public void enroll(){
        while(true) {
            System.out.println("Enter course to enroll (Q to quit)");
            Scanner scan = new Scanner(System.in);
            String course = scan.nextLine();
            if (!course.equals("Q")){
                courses += "\n  " + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            }
            else {
                break;
            }
        }
        System.out.println("ENROLLED IN : "+ courses);
    }
    //View balance
    public void viewBalance(){
        System.out.println("Your balance is: $"+ tuitionBalance);
    }
    //Pay Tuition
    public void payTuition(){
        viewBalance();
        System.out.println("Enter your payment: ");
        Scanner scan = new Scanner(System.in);
        int payment = scan.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for payment of $"+payment);
        viewBalance();
    }
    // Show Status
    public String toString(){
        return "Name: " +firstName + " "+ lastName +
                "\nGrade Level: " + gradeYear +
                "\nStudent ID: " + StudentID +
                "\nCourse Enrolled: " + courses +
                "\nBalance: $"+tuitionBalance;
    }
}
