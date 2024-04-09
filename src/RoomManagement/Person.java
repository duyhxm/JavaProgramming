package RoomManagement;

public class Person {
    private final String fullName;
    private final String CID;
    private final byte age;

    public Person(String fullName, String CID, byte age){
        this.fullName = fullName;
        this.CID = CID;
        this.age = age;
    }
    public String getFullName(){return this.fullName;}
    public String getCID(){return this.CID;}
    public byte getAge(){return this.age;}
}
