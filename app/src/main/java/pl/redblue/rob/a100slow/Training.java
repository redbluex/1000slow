package pl.redblue.rob.a100slow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.File;

import static pl.redblue.rob.a100slow.MainActivity.positionID;

public class Training extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_training);

        // Open new file with name like positionID
        String nameFile = new String(positionID+".txt");
        File file = new File(nameFile);

        String [] trainingStrings = new String[40];

    }


}
