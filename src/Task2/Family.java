package Task2;

import java.util.ArrayList;

public class Family {
    private int numOfMember;
    private String address;
    private ArrayList<Human> memberList;

    public Family(int numOfMember, String address, ArrayList<Human> memberList){
        this.numOfMember = numOfMember;
        this.address = address;
        this.memberList = memberList;
    }
    public int getNumOfMember(){return numOfMember;}
    public String getAddress(){return address;}
    public ArrayList<Human> getMemberList() {return memberList;}
}
