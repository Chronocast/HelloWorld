package com.example.nshas.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

//Tested and runs on Nexus 6 w/ Android 7.0

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //EditTexts for name and message
        EditText editText1 = (EditText) findViewById(R.id.editText1);
        EditText editText3 = (EditText) findViewById(R.id.editText3);


        //call listener
        View view = findViewById(R.id.button);
        MyButtonClickListener listener = new MyButtonClickListener("What has it gots in its pocketses?", editText1, editText3);
        view.setOnClickListener(listener);



    }


}