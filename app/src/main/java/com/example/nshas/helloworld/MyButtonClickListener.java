package com.example.nshas.helloworld;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;



/**
 * Created by nshas on 10/5/2017.
 */

public class MyButtonClickListener implements View.OnClickListener {

    //instantiates variables for button listener
    String message;
    EditText editName;
    EditText editMessage;
    //EditText editPhone;

    //constructor
    public MyButtonClickListener(String message, EditText editText1, EditText editText3) {
        this.message = message;
        this.editName = editText1;
        this.editMessage = editText3;
    }

    @Override
    public void onClick(View view) {
        ((Button) view).setText(message);

        //failed attemtp to make invisible picture appear on button press for Gollum responses
        //ImageView picView =(ImageView) view.findViewById(R.id.imageView);
        //picView.setVisibility(View.VISIBLE);

        //if both empty
        if(isEmpty(editName) && isEmpty(editMessage))
        {
            Toast.makeText(view.getContext(), "It must gives us something, Precious!", Toast.LENGTH_SHORT).show();
        }else if(isEmpty(editMessage)) { //if message box empty
            Toast.makeText(view.getContext(), "Gives us its messages, Precious!", Toast.LENGTH_SHORT).show();
        }else if (isEmpty(editName)) { //if name box empty
            Toast.makeText(view.getContext(), "Gives us its nameses, Precious!", Toast.LENGTH_SHORT).show();
        }else{ //if both mandatory boxes filled
            String concatenatedText = "Hello, " + editName.getText().toString() + ", " + editMessage.getText().toString();
            Toast.makeText(view.getContext(), concatenatedText, Toast.LENGTH_LONG).show();

        }

    }


    //checks if isEmpty
    private boolean isEmpty(EditText editText) {
        return editText.getText().toString().trim().length() == 0;
    }

}