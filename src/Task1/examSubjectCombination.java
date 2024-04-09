package Task1;

import java.util.ArrayList;

public abstract class examSubjectCombination {
    private final ArrayList<String> subjectCombination;

    public examSubjectCombination(ArrayList<String> subjectCombination){
        this.subjectCombination = new ArrayList<>(subjectCombination);
    }
    public ArrayList<String> getCombination(){return this.subjectCombination;}
}

