package pl.redblue.rob.a100slow;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    static int positionID = 0;
    static PassExam pass = new PassExam();
    ImageAdapter imgAdapter = new ImageAdapter(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        GridView gridview = (GridView) findViewById(R.id.gridview);

        gridview.setAdapter(imgAdapter);
        setImgView();


        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                Intent intent = new Intent(MainActivity.this, Menu.class);
                positionID = position+1;
                if(positionID<=pass.getNumberPass())
                    startActivity(intent);
            }
        });

    }

    public void setImgView(){
        if(pass.getNumberPass()>1)
            imgAdapter.setmThumbIdsNumber(1, R.drawable.a1);
        if(pass.getNumberPass()>2)
            imgAdapter.setmThumbIdsNumber(2, R.drawable.a2);
        if(pass.getNumberPass()>3)
            imgAdapter.setmThumbIdsNumber(3, R.drawable.a3);
        if(pass.getNumberPass()>4)
            imgAdapter.setmThumbIdsNumber(4, R.drawable.a4);
        if(pass.getNumberPass()>5)
            imgAdapter.setmThumbIdsNumber(5, R.drawable.a5);
        if(pass.getNumberPass()>6)
            imgAdapter.setmThumbIdsNumber(6, R.drawable.a6);
        if(pass.getNumberPass()>7)
            imgAdapter.setmThumbIdsNumber(7, R.drawable.a7);
        if(pass.getNumberPass()>8)
            imgAdapter.setmThumbIdsNumber(8, R.drawable.a8);
        if(pass.getNumberPass()>9)
            imgAdapter.setmThumbIdsNumber(9, R.drawable.a9);
        if(pass.getNumberPass()>10)
            imgAdapter.setmThumbIdsNumber(10, R.drawable.a10);
        if(pass.getNumberPass()>11)
            imgAdapter.setmThumbIdsNumber(11, R.drawable.a11);
        if(pass.getNumberPass()>12)
            imgAdapter.setmThumbIdsNumber(12, R.drawable.a12);
        if(pass.getNumberPass()>13)
            imgAdapter.setmThumbIdsNumber(13, R.drawable.a13);
        if(pass.getNumberPass()>14)
            imgAdapter.setmThumbIdsNumber(14, R.drawable.a14);
        if(pass.getNumberPass()>15)
            imgAdapter.setmThumbIdsNumber(15, R.drawable.a15);
        if(pass.getNumberPass()>16)
            imgAdapter.setmThumbIdsNumber(16, R.drawable.a16);
        if(pass.getNumberPass()>17)
            imgAdapter.setmThumbIdsNumber(17, R.drawable.a17);
        if(pass.getNumberPass()>18)
            imgAdapter.setmThumbIdsNumber(18, R.drawable.a18);
        if(pass.getNumberPass()>19)
            imgAdapter.setmThumbIdsNumber(19, R.drawable.a19);
        if(pass.getNumberPass()>20)
            imgAdapter.setmThumbIdsNumber(20, R.drawable.a20);
        if(pass.getNumberPass()>21)
            imgAdapter.setmThumbIdsNumber(21, R.drawable.a21);
        if(pass.getNumberPass()>22)
            imgAdapter.setmThumbIdsNumber(22, R.drawable.a22);
        if(pass.getNumberPass()>23)
            imgAdapter.setmThumbIdsNumber(23, R.drawable.a23);
        if(pass.getNumberPass()>24)
            imgAdapter.setmThumbIdsNumber(24, R.drawable.a24);
        if(pass.getNumberPass()>25)
            imgAdapter.setmThumbIdsNumber(25, R.drawable.a25);


    }
}
