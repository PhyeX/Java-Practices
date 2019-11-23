import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Ask how many new students we want to add
        System.out.println("Enter number of new students to enroll: ");
        Scanner scan = new Scanner(System.in);
        int numOfStudents = scan.nextInt();
        Student[] students = new Student[numOfStudents];
        //Create n number of new students
        for(int i =0 ;i<numOfStudents;i++){
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();
            System.out.println(students[i].toString());
        }
        for(int i =0 ;i<numOfStudents;i++){
            System.out.println(students[i].toString());
        }

    }
}
