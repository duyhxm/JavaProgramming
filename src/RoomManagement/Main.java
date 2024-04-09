package RoomManagement;

import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static void main(String [] args){
        Hotel hotel = new Hotel();
        Scanner scanner = new Scanner(System.in);
        int choice;
        while(true){
            System.out.println("-----------------------");
            System.out.println("1. Adding a new customer");
            System.out.println("2. Removing a customer");
            System.out.println("3. Calculating renting payment for a customer");
            System.out.println("4. Exiting this program");
            System.out.println("Which number do you choose: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            if(choice == 1){
                Room roomType = new Room();
                System.out.println("Room type: ");
                char type = scanner.nextLine().charAt(0);
                if (type == 'A'){
                    roomType = new RoomA();
                }
                else if(type == 'B'){
                    roomType = new RoomB();
                }
                else if(type == 'C'){
                    roomType = new RoomC();
                }
                System.out.println("Number of day: ");
                short numOfDay = scanner.nextShort();
                scanner.nextLine();
                System.out.println("CID: ");
                String CID = scanner.nextLine();
                System.out.println("Name: ");
                String fullName = scanner.nextLine();
                System.out.println("Age: ");
                byte age = scanner.nextByte();
                Person customer = new Person(fullName, CID, age);
                Hotel.rentedRoom cus = new Hotel.rentedRoom(roomType, customer, numOfDay);
                hotel.addingNewCustomer(cus);
            }
            else if(choice == 2){
                System.out.println("CID of customer: ");
                String CID = scanner.nextLine();
                hotel.removeCustomer(CID);
            }
            else if(choice == 3){
                System.out.println("CID of customer: ");
                String CID = scanner.nextLine();
                double payment = hotel.calculateRentingPayment(CID);
                if(payment != 0){
                    System.out.println("Payment of CID " + CID + " is: " + payment);
                }else{
                    System.out.println(CID + "customer hasn't rented any room");
                }
            }
            else
                exit(0);
        }
    }
}
