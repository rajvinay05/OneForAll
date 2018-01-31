package com.example.thispc.oneforall;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Quiz extends AppCompatActivity {

    RadioGroup rg;
    RadioButton rb1,rb2,rb3,rb4;
    Button b;
    static int score=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        b=(Button)findViewById(R.id.button25);
        rb1=(RadioButton)findViewById(R.id.radioButton);
        rb2=(RadioButton)findViewById(R.id.radioButton2);
        rb3=(RadioButton)findViewById(R.id.radioButton3);
        rb4=(RadioButton)findViewById(R.id.radioButton4);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              score=0;
                if (rb4.isChecked()){
                    ++score;
                }
                else{
                    --score;
                }
                Intent i=new Intent(Quiz.this,Quiz2.class);
                startActivity(i);
                finish();
            }
        });

    }
}
