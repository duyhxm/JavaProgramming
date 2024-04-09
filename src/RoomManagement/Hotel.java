package RoomManagement;
import java.util.ArrayList;

public class Hotel {
    private ArrayList<rentedRoom> rentedRoomArrayList;
    public static class rentedRoom{
        private final Room roomType;
        private final Person customer;
        private final short numOfDay;
        public rentedRoom(Room roomType, Person customer, short numOfDay){
            this.roomType = roomType;
            this.customer = customer;
            this.numOfDay = numOfDay;
        }
        public Room getRoomType(){return this.roomType;}
        public Person getCustomer() {
            return customer;
        }
        public short getNumOfDay() {
            return numOfDay;
        }
    }
    public Hotel(){
        rentedRoomArrayList = new ArrayList<>();
    }
    public double calculateRentingPayment(String CID){
        double rentingPayment = 0;
        for(rentedRoom x : rentedRoomArrayList){
            if(x.getCustomer().getCID().equals(CID)) {
                if (x.getRoomType() instanceof RoomA) {
                    rentingPayment = (double)x.getNumOfDay() * x.roomType.getPrice();
                } else if (x.getRoomType() instanceof RoomB) {
                    rentingPayment = (double)x.getNumOfDay() * x.roomType.getPrice();
                } else
                    rentingPayment = (double)x.getNumOfDay() * x.roomType.getPrice();
            }
        }
        return rentingPayment;
    }
    public void addingNewCustomer(rentedRoom room){
        rentedRoomArrayList.add(room);
    }
    public void removeCustomer(String CID){
        for(int i = 0; i<rentedRoomArrayList.size(); i++){
            rentedRoom x = rentedRoomArrayList.get(i);
            if(x.getCustomer().getCID().equals(CID)){
                rentedRoomArrayList.remove(i);
            }
        }
    }
}
