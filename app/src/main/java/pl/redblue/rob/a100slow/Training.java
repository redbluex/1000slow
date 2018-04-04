package pl.redblue.rob.a100slow;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.Scanner;

import static pl.redblue.rob.a100slow.MainActivity.positionID;

public class Training extends AppCompatActivity {

    Scanner odczyt = null;
    Scanner odczyt2 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_training);


            chooseFile();

            final TextView middle = (TextView)findViewById(R.id.textWord);
            final TextView answerText = (TextView)findViewById(R.id.textAnswer);
            final String [] words = new String[40];
            final String [] answer = new String[40];
            int i=0;
        while(odczyt.hasNext()){
            words[i] = odczyt.nextLine();
            i++;
        }
        i=0;
        while(odczyt2.hasNext()){
            answer[i] = odczyt2.nextLine();
            i++;
        }
            middle.setText(words[0]);
            answerText.setText(answer[0]);

        RelativeLayout yourActivityLayout = (RelativeLayout)findViewById(R.id.relativ);


        yourActivityLayout.setOnTouchListener(new View.OnTouchListener() {
            int z=0;
            @Override
            public boolean onTouch(View arg0, MotionEvent arg1) {
                if(z<40) {
                    middle.setText(words[z]);
                    answerText.setText(answer[z]);
                    z++;
                }
                else{
                    Intent i = new Intent(Training.this, Menu.class);
                    startActivity(i);
                }

                return true;//always return true to consume event
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





}
