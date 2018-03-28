package pl.redblue.rob.a100slow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;
import java.util.Scanner;

import static pl.redblue.rob.a100slow.MainActivity.positionID;

public class Testowa extends AppCompatActivity {

    Scanner odczyt = null;
    Scanner odczyt2 = null;
    TestSpecial test1 = new TestSpecial();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testowa);
        chooseFile();
        test1.loadQuestions(odczyt, odczyt2);
        changeTextView(test1);
    }

    public void chooseFile(){
        switch(positionID){
            case 1: odczyt = new Scanner(getResources().openRawResource(R.raw.a1));
                odczyt2 = new Scanner(getResources().openRawResource(R.raw.b1));
                break;
            case 2: odczyt = new Scanner(getResources().openRawResource(R.raw.a1));
                break;
            case 3: odczyt = new Scanner(getResources().openRawResource(R.raw.a1));
                break;
            case 4: odczyt = new Scanner(getResources().openRawResource(R.raw.a1));
                break;
            case 5: odczyt = new Scanner(getResources().openRawResource(R.raw.a1));
                break;
            case 6: odczyt = new Scanner(getResources().openRawResource(R.raw.a1));
                break;
            case 7: odczyt = new Scanner(getResources().openRawResource(R.raw.a1));
                break;
            case 8: odczyt = new Scanner(getResources().openRawResource(R.raw.a1));
                break;
            case 9: odczyt = new Scanner(getResources().openRawResource(R.raw.a1));
                break;
            case 10: odczyt = new Scanner(getResources().openRawResource(R.raw.a1));
                break;
        }
    }

    public void changeTextView(TestSpecial x){
        TextView text = (TextView)findViewById(R.id.textWordsToTranslate);
        text.setText(x.getWordString(randomQuestion()));
    }

    public int randomQuestion(){
        Random generator = new Random();
        return generator.nextInt(39)+1;
    }
}
