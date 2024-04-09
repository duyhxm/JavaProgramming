package RoomManagement;

public class CustomerService {
    public void addCustomer(Hotel hotel, Room roomType, short numOfDay, String CID, String fullName, byte age) {
        Person customer = new Person(fullName, CID, age);
        Hotel.rentedRoom cus = new Hotel.rentedRoom(roomType, customer, numOfDay);
        hotel.addingNewCustomer(cus);
    }
}
