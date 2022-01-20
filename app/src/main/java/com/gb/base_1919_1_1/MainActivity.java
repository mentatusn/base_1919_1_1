package com.gb.base_1919_1_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("mylogs","MainActivity onCreate()");


        Button button = findViewById(R.id.btn);
        EditText etOne= findViewById(R.id.etOne);
        EditText etTwo=findViewById(R.id.etTwo);
        TextView answer=findViewById(R.id.answer);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("mylogs","onClick");
                compare(etOne, etTwo, answer);
            }
        });
    }

    public void compare(EditText etOne, EditText etTwo, TextView answer) {
        int one = Integer.valueOf(etOne.getText().toString());
        int two = Integer.valueOf(etTwo.getText().toString());
        if(one==two){
            answer.setText("Равно!");
        }else{
            answer.setText("не Равно!");
        }
    }


}