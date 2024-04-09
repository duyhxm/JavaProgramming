package RoomManagement;

public class Room {
    private double price;
    public double getPrice(){return this.price;};
    public void setPrice(double price){this.price = price;}
}
class RoomA extends Room{
   public RoomA(){
       setPrice(500);
   }
}
class RoomB extends Room{
    public RoomB(){
        setPrice(300);
    }
}
class RoomC extends Room{
    public RoomC(){
        setPrice(100);
    }
}
