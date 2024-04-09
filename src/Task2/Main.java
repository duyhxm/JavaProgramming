package Task2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Neighborhood nei = new Neighborhood();
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------------------------");
        System.out.println("Enter the number of family: ");
        int numOfFamily = scanner.nextInt();
        scanner.nextLine();
        for(int i = 0 ; i < numOfFamily; i++){
            System.out.println("----------------------------");
            System.out.println("Family " + (i+1));
            System.out.println("Enter the address: ");
            String address = scanner.nextLine();
            System.out.println("Enter the number of member: ");
            int numOfMember = scanner.nextInt();
            scanner.nextLine();
            ArrayList<Human> memberList = new ArrayList<>();
            for(int j = 0; j < numOfMember; j++){
                System.out.println("----------------------------");
                System.out.println("Enter the information for member " + (j + 1));
                System.out.println("Citizen identify card: ");
                String citizenIdentifyCard = scanner.nextLine();
                System.out.println("Enter the full name: ");
                String fullName = scanner.nextLine();
                System.out.println("Enter the job: ");
                String job = scanner.nextLine();
                System.out.println("Enter the age: ");
                int age = scanner.nextInt();
                scanner.nextLine();
                Human member = new Human(citizenIdentifyCard, fullName, age, job);
                memberList.add(member);
            }
            Family family = new Family(numOfMember, address, memberList);
            nei.addFamily(family);
        }
        nei.displayAllFamily();
    }
}
