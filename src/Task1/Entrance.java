package Task1;

import java.util.*;
import static java.lang.System.exit;

public class Entrance {
    static ArrayList<Student> studentRegistry = new ArrayList<>();
    static void addNewStudent(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the id: ");
        String idStudent = scanner.nextLine();
        System.out.println("Enter full name: ");
        String fullName = scanner.nextLine();
        System.out.println("Enter sequentially house number, sub-municipal level of address, " +
                "municipal level of address and provincial level of address: ");
        String houseNumber = scanner.nextLine();
        String subMunicipalLevel = scanner.nextLine();
        String municipalLevel = scanner.nextLine();
        String provincialLevel = scanner.nextLine();
        Address address = new Address(houseNumber, subMunicipalLevel, municipalLevel, provincialLevel);
        System.out.println("Enter the priority: ");
        byte priority = scanner.nextByte();
        scanner.nextLine();
        char c = scanner.nextLine().charAt(0);
        examSubjectCombination subjectCombination;
        do{
            System.out.println("Enter the exam subject combination (A, B or C): ");
            if(c == 'A'){
                subjectCombination = new A();
                break;
            }
            else if(c == 'B'){
                subjectCombination = new B();
                break;
            }
            else if(c == 'C')
            {
                subjectCombination = new B();
                break;
            }
            else{
                System.out.println("Please enter a valid combination!!!");
                scanner.nextLine();
            }
        }while(true);
        Student student = new Student(idStudent, fullName, address, priority, subjectCombination);
        studentRegistry.add(student);
    }
    static void findIdStudent(String idStudent){
        String indexOfStudent = "-1";
        for (Student student : studentRegistry) {
            if (Objects.equals(student.getIdStudent(), idStudent)) {
                    indexOfStudent = student.getIdStudent();
            }
        }
        if(Objects.equals(indexOfStudent, "-1")){
            System.out.println("The student doesn't exist");
        }
        else{
            System.out.println("The student exists");
        }

    }
    static void getStudentInformation(){
        for(Student student : studentRegistry){
            System.out.println("--------------------------------------------");
            System.out.println("ID of student: " + student.getIdStudent());
            System.out.println("Full name of student: " + student.getFullName());
            examSubjectCombination subjectCombination = student.getSubjectCombination();
            ArrayList<String> subject = subjectCombination.getCombination();
            System.out.print("Subject combination: ");
            for(String sub : subject){
                System.out.print(sub);
                System.out.print(" ");
            }
            System.out.println();
            Address address = student.getAddress();
            System.out.println("Task1.Address: " + address.getHouseNumber() + ", " + address.getSubMunicipalLevel() + ", " + address.getMunicipalLevel() + ", " + address.getProvincialLevel());
            System.out.println("Priority: " + student.getPriority());
        }
    }
    static void exitProgram(){
        exit(0);
    }
    public static void main(String [] args){
        System.out.println("Welcome you to student manager");
        while(true){
            System.out.println("--------------------------------------------");
            System.out.println("1. Adding a new student");
            System.out.println("2. Display the information of all students");
            System.out.println("3. Find a student through id student");
            System.out.println("4. Exit this program");
            System.out.println("Which choice do you want to do? Enter a number as a choice, " +
                    "please!");
            Scanner scanner = new Scanner(System.in);
            int choice = 0;
            try{
                choice  = scanner.nextInt();
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
            if(choice == 1){
                addNewStudent();
            }
            else if(choice ==2){
                getStudentInformation();
            }
            else if(choice == 3){
                System.out.println("Enter an id of a student: ");
                String idStudent = scanner.nextLine();
                findIdStudent(idStudent);
            }
            else if(choice == 4){
                exitProgram();
            }
            else{
                System.out.println("Please enter a number again. Your choice is not available");
            }
        }
    }
}
