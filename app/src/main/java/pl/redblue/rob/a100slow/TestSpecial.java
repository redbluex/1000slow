package pl.redblue.rob.a100slow;


import android.widget.EditText;
import android.widget.TextView;

import java.util.Scanner;

import static pl.redblue.rob.a100slow.MainActivity.positionID;

/**
 * Created by ROB on 3/28/2018.
 */

public class TestSpecial {
    private int points;
    private String textWord;
    private String [] wordString;
    private String [] answerString;


    public TestSpecial(){
        points = 0;
        wordString = new String[40];
        answerString = new String[40];
        textWord = "X";

    }

    public String getTextWord() {
        return textWord;
    }

    public void setTextWord(String textWord) {
        this.textWord = textWord;
    }

    public int getPoints() {
        return points;
    }

    public String getAnswerString(int n) {
        return this.answerString[n];
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

    public void checkAnswer(int x, String correctWord){
        if(correctWord.equals(answerString[x]))
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
