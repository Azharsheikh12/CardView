package com.example.cardview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button,buttonz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button=findViewById(R.id.button1);
        buttonz=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openMobile();
            }
        });

        buttonz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTable();
            }
        });
    }

    public void openMobile(){

        Intent intent=new Intent(this,cardview1.class);
        startActivity(intent);
    }
    public void openTable(){

        Intent intent1=new Intent(this,tablelayout.class);
        startActivity(intent1);
    }

}