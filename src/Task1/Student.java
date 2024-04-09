package Task1;

import Task1.Address;

public class Student {
    private String idStudent;
    private String fullName;
    private Address address;
    private byte priority;
    private examSubjectCombination subjectCombination;

    public Student(String idStudent, String fullName, Address address, byte priority,
                        examSubjectCombination subjectCombination){
        this.idStudent = idStudent;
        this.fullName = fullName;
        this.address = address;
        this.priority = priority;
        this.subjectCombination = subjectCombination;
    }
    public String getIdStudent(){return this.idStudent;}
    public String getFullName(){return this.fullName;}
    public Address getAddress(){return this.address;}
    public byte getPriority(){return this.priority;}
    public examSubjectCombination getSubjectCombination(){return this.subjectCombination;}
}
