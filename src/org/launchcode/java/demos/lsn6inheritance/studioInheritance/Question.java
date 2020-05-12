package org.launchcode.java.demos.lsn6inheritance.studioInheritance;

import java.util.HashMap;

public class Question {
    private String query;
    HashMap<Integer, String> answerList;
    public Question(String query) {
        this.query = query;
    }
    public String getQuery() {
        return query;
    }
    public void setQuery(String query) {
        this.query = query;
    }
    public HashMap<Integer, String> getAnswerList() {
        return answerList;
    }
    public void setAnswerList(HashMap<Integer, String> answerList) {
        this.answerList = answerList;
    }
    public void setAnswer(Integer key, String choice) {
        this.answerList.put(key, choice);
    }
    //public Boolean checkAnswer(ArrayList<Integer userInput){
    //for (Integer item : userInput){
    //}
    //if(userinput.equals(1) ){
    // return true;
    //}
    // }
}
