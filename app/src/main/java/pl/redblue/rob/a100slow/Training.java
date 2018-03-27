package pl.redblue.rob.a100slow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static pl.redblue.rob.a100slow.MainActivity.positionID;
import static pl.redblue.rob.a100slow.R.id.middle;

public class Training extends AppCompatActivity {

    Scanner odczyt = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_training);

        // Open new file with name like positionID
            chooseFile();

            final TextView middle = (TextView)findViewById(R.id.textWord);
            final String [] words = new String[40];
            int i=0;
        while(odczyt.hasNext()){
            words[i] = odczyt.nextLine();
            i++;
        }
            middle.setText(words[0]);

        RelativeLayout yourActivityLayout = (RelativeLayout)findViewById(R.id.relativ);

        yourActivityLayout.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View arg0, MotionEvent arg1) {

                middle.setText(words[1]);

                return true;//always return true to consume event
            }
        });




    }



    public void chooseFile(){
        switch(positionID){
            case 1: odczyt = new Scanner(getResources().openRawResource(R.raw.a1));
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
