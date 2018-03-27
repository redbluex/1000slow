package pl.redblue.rob.a100slow;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class Menu extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void train(View view){
        Intent i = new Intent(Menu.this, Training.class);
        startActivity(i);
    }

    public void test(View view){
        Intent i = new Intent(Menu.this, Testowa.class);
        startActivity(i);
    }
}
