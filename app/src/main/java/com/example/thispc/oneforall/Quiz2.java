package com.example.thispc.oneforall;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Quiz2 extends AppCompatActivity {

    RadioGroup rg;
    RadioButton rb1,rb2,rb3,rb4;
    Button b1,b2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz2);
        b1=(Button)findViewById(R.id.button26);

        rb1=(RadioButton)findViewById(R.id.radioButton5);
        rb2=(RadioButton)findViewById(R.id.radioButton6);
        rb3=(RadioButton)findViewById(R.id.radioButton7);
        rb4=(RadioButton)findViewById(R.id.radioButton8);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (rb2.isChecked()){
                    ++Quiz.score;
                }
                else{
                    --Quiz.score;
                }
                Intent i=new Intent(Quiz2.this,Quiz3.class);
                startActivity(i);
                finish();
            }
        });
    }
}
