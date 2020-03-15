package com.dev_app.intentandactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Call the Button from the XML layout

       Button btn = findViewById(R.id.button);

        //set on click Listener for the button to perform an action

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent gotoActivity2 = new Intent(MainActivity.this,Activity2.class);
                startActivity(gotoActivity2);
            }
        });

    }
}
