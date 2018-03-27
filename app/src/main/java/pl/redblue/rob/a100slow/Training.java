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





}
