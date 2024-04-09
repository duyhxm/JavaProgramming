package Task2;
import java.util.ArrayList;

public class Neighborhood{
    private ArrayList<Family> familyList;

    public Neighborhood(){
        familyList = new ArrayList<>();
    }
    public void addFamily(Family family){
        familyList.add(family);
    }
    public void displayAllFamily(){
        for(Family family : familyList){
            System.out.println("-------------------------------");
            System.out.println("Address: " + family.getAddress());
            System.out.println("Number of family member: " + family.getNumOfMember());
            ArrayList<Human> member = new ArrayList<>(family.getMemberList());
            for(Human mem : member){
                System.out.println("-------------------------------");
                System.out.println("Citizen identify card: " + mem.getCitizenIdentifyCard());
                System.out.println("Full name: " + mem.getFullName());
                System.out.println("Age: " + mem.getAge());
                System.out.println("Job " + mem.getJob());
            }
        }
    }
}
