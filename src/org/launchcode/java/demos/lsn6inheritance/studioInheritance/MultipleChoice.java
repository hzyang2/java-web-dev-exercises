package org.launchcode.java.demos.lsn6inheritance.studioInheritance;

import java.util.HashMap;

public class MultipleChoice extends Question{
    private Integer correctAnswer;
    public MultipleChoice(String query) {
        super(query);
    }
    public Boolean checkAnswer(Integer userAnswer){
        if(userAnswer.equals(correctAnswer)){
            return true;
        }
        return false;
    }
}
