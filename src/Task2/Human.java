package Task2;

public class Human {
    private String citizenIdentifyCard;
    private String fullName;
    private int age;
    private String job;

    public Human(String citizenIdentifyCard, String fullName, int age, String job){
        this.citizenIdentifyCard = citizenIdentifyCard;
        this.fullName = fullName;
        this.age = age;
        this.job = job;
    }
    public String getCitizenIdentifyCard(){return this.citizenIdentifyCard;}
    public String getFullName(){return this.fullName;}
    public int getAge(){return this.age;}
    public String getJob(){return this.job;}
}
