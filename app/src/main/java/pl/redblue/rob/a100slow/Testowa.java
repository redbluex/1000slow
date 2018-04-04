package pl.redblue.rob.a100slow;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;
import java.util.Scanner;

import static pl.redblue.rob.a100slow.MainActivity.pass;
import static pl.redblue.rob.a100slow.MainActivity.positionID;

public class Testowa extends AppCompatActivity {

    Scanner odczyt = null;
    Scanner odczyt2 = null;
    TestSpecial test1 = new TestSpecial();
    String word ="abc";
    int questionNumber;
    public int quantintyQuestions = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testowa);
        chooseFile();
        test1.loadQuestions(odczyt, odczyt2);
        final TextView textPointss = (TextView) findViewById(R.id.textPoints);
        final EditText text = (EditText)findViewById(R.id.editTranslation);
        questionNumber = randomQuestion();
        changeTextView(test1);
        final Button button = (Button) findViewById(R.id.buttonOK);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                word = text.getText().toString();
                test1.checkAnswer(questionNumber, word);
                String wprowdz = test1.getPoints()+"";
                textPointss.setText(wprowdz);
                questionNumber = randomQuestion();
                changeTextView(test1);
                quantintyQuestions++;
                if(quantintyQuestions>20){
                    if(test1.getPoints()>17){
                        pass.examPassed();
                    }
                    if(test1.getPoints()<17){
                        pass.examFail();
                    }
                    Intent i = new Intent(Testowa.this, MainActivity.class);
                    Context context = getApplicationContext();
                    CharSequence text = "Zdobyłeś: "+test1.getPoints()+" punktów na "+(quantintyQuestions-1)+" możliwych. "+pass.getStringPass();
                    Toast toast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
                    toast.show();
                    startActivity(i);
                }

            }
        });

    }

    public void chooseFile(){
        switch(positionID){
            case 1: odczyt = new Scanner(getResources().openRawResource(R.raw.a1));
                odczyt2 = new Scanner(getResources().openRawResource(R.raw.b1));
                break;
            case 2: odczyt = new Scanner(getResources().openRawResource(R.raw.a2));
                odczyt2 = new Scanner(getResources().openRawResource(R.raw.b2));
                break;
            case 3: odczyt = new Scanner(getResources().openRawResource(R.raw.a3));
                odczyt2 = new Scanner(getResources().openRawResource(R.raw.b3));
                break;
            case 4: odczyt = new Scanner(getResources().openRawResource(R.raw.a4));
                odczyt2 = new Scanner(getResources().openRawResource(R.raw.b4));
                break;
            case 5: odczyt = new Scanner(getResources().openRawResource(R.raw.a5));
                odczyt2 = new Scanner(getResources().openRawResource(R.raw.b5));
                break;
            case 6: odczyt = new Scanner(getResources().openRawResource(R.raw.a6));
                odczyt2 = new Scanner(getResources().openRawResource(R.raw.b6));
                break;
            case 7: odczyt = new Scanner(getResources().openRawResource(R.raw.a7));
                odczyt2 = new Scanner(getResources().openRawResource(R.raw.b7));
                break;
            case 8: odczyt = new Scanner(getResources().openRawResource(R.raw.a8));
                odczyt2 = new Scanner(getResources().openRawResource(R.raw.b8));
                break;
            case 9: odczyt = new Scanner(getResources().openRawResource(R.raw.a9));
                odczyt2 = new Scanner(getResources().openRawResource(R.raw.b9));
                break;
            case 10: odczyt = new Scanner(getResources().openRawResource(R.raw.a10));
                odczyt2 = new Scanner(getResources().openRawResource(R.raw.b10));
                break;
            case 11: odczyt = new Scanner(getResources().openRawResource(R.raw.a11));
                odczyt2 = new Scanner(getResources().openRawResource(R.raw.b11));
                break;
            case 12: odczyt = new Scanner(getResources().openRawResource(R.raw.a12));
                odczyt2 = new Scanner(getResources().openRawResource(R.raw.b12));
                break;
            case 13: odczyt = new Scanner(getResources().openRawResource(R.raw.a13));
                odczyt2 = new Scanner(getResources().openRawResource(R.raw.b13));
                break;
            case 14: odczyt = new Scanner(getResources().openRawResource(R.raw.a14));
                odczyt2 = new Scanner(getResources().openRawResource(R.raw.b14));
                break;
            case 15: odczyt = new Scanner(getResources().openRawResource(R.raw.a15));
                odczyt2 = new Scanner(getResources().openRawResource(R.raw.b15));
                break;
            case 16: odczyt = new Scanner(getResources().openRawResource(R.raw.a16));
                odczyt2 = new Scanner(getResources().openRawResource(R.raw.b16));
                break;
            case 17: odczyt = new Scanner(getResources().openRawResource(R.raw.a17));
                odczyt2 = new Scanner(getResources().openRawResource(R.raw.b17));
                break;
            case 18: odczyt = new Scanner(getResources().openRawResource(R.raw.a18));
                odczyt2 = new Scanner(getResources().openRawResource(R.raw.b18));
                break;
            case 19: odczyt = new Scanner(getResources().openRawResource(R.raw.a19));
                odczyt2 = new Scanner(getResources().openRawResource(R.raw.b19));
                break;
            case 20: odczyt = new Scanner(getResources().openRawResource(R.raw.a20));
                odczyt2 = new Scanner(getResources().openRawResource(R.raw.b20));
                break;
            case 21: odczyt = new Scanner(getResources().openRawResource(R.raw.a21));
                odczyt2 = new Scanner(getResources().openRawResource(R.raw.b21));
                break;
            case 22: odczyt = new Scanner(getResources().openRawResource(R.raw.a22));
                odczyt2 = new Scanner(getResources().openRawResource(R.raw.b22));
                break;
            case 23: odczyt = new Scanner(getResources().openRawResource(R.raw.a23));
                odczyt2 = new Scanner(getResources().openRawResource(R.raw.b23));
                break;
            case 24: odczyt = new Scanner(getResources().openRawResource(R.raw.a24));
                odczyt2 = new Scanner(getResources().openRawResource(R.raw.b24));
                break;
            case 25: odczyt = new Scanner(getResources().openRawResource(R.raw.a25));
                odczyt2 = new Scanner(getResources().openRawResource(R.raw.b25));
                break;
        }
    }

    public void changeTextView(TestSpecial x){
        TextView text = (TextView)findViewById(R.id.textWordsToTranslate);
        text.setText(x.getWordString(questionNumber));
    }


    public int randomQuestion(){
        Random generator = new Random();
        return generator.nextInt(39)+1;
    }


    // take word from edit text

}
