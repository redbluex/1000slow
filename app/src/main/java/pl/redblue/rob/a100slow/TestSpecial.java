package pl.redblue.rob.a100slow;


import android.widget.TextView;

import java.util.Scanner;

import static pl.redblue.rob.a100slow.MainActivity.positionID;

/**
 * Created by ROB on 3/28/2018.
 */

public class TestSpecial {
    private int points;
    public String [] wordString;
    private String [] answerString;


    public TestSpecial(){
        points = 0;
        wordString = new String[40];
        answerString = new String[40];

    }

    public int getPoints() {
        return points;
    }

    public String[] getAnswerString() {
        return answerString;
    }

    public String getWordString(int n) {
        return this.wordString[n];
    }

    public void setAnswerString(String[] answerString) {
        this.answerString = answerString;
    }

    public void setWordString(String[] wordString) {
        this.wordString = wordString;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void checkAnswer(int x){
        if(wordString[x].equals(answerString[x]))
            points++;
    }

    public void loadQuestions(Scanner odczyt, Scanner odczyt2){
        int i = 0;
        while(odczyt.hasNext()){
            wordString[i] = odczyt.nextLine();
            i++;
        }
        i=0;
        while(odczyt2.hasNext()){
            answerString[i] = odczyt2.nextLine();
            i++;
        }
    }




}
