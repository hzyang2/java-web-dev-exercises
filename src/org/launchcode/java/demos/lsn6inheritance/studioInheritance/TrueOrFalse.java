package org.launchcode.java.demos.lsn6inheritance.studioInheritance;

public class TrueOrFalse extends Question{
    private Boolean correctAnswer;
    public TrueOrFalse(String query) {
        super(query);
    }
    public Boolean compareAnswers(Boolean userAnswer){
        if(userAnswer == correctAnswer){
            return true;
        }
        return false;
    }
}
