import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wecome to School!");
        System.out.println("1. Creating new lecturer");
        System.out.println("2. Creating new student");  
        
        int option = scanner.nextInt();     //getting userinput as 1 or 2

        Person person = new Person();       //creating common object to both student and staff
        if (option == 1) {
            //creating new lecturer
            System.out.print("Enter Lecturer Name : ");
            person.name = scanner.next();

            System.out.print("Enter salary of the lecturer : ");
            Staff staff = new Staff();                              //creating instace of Staff class to get access salary
            staff.salary = scanner.nextDouble();                    //passing user input to salary variable inside staff class

            System.out.print("Enter subjects of the lecturer : ");
            Lecturer lecturer = new Lecturer();                     //creating instace of Lecturer class to get access subject
            lecturer.subjects = scanner.next();                     //passing user input to subject variable inside Lecturer class

            person.display();
            staff.display();
            lecturer.display();
            
        } else if (option == 2){
            //creating student
            System.out.print("Enter Student Name : ");
            person.name = scanner.next();

            System.out.print("Enter Student Id : ");
            Student student = new Student();            // creating student class's instance
            student.id = scanner.nextInt();             //passing userinput to id variable inside Student class

            person.display();
            student.display();
        } else {
            System.out.println("Enter 1 or 2 only!");
        }

        scanner.close();
    }
}
