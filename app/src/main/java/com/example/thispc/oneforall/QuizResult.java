package com.example.thispc.oneforall;

import android.content.Intent;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Locale;

public class QuizResult extends AppCompatActivity {

    Button b1;
    TextView t1;
    TextToSpeech t2;
    ImageButton im1,im2;

    WebView w;

    String s1="BETTER LUCK NEXT TIME";
    String s2="CONGRATULATION";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_result);
        b1=(Button)findViewById(R.id.button29);
        t1=(TextView)findViewById(R.id.textView13);



        im1=(ImageButton)findViewById(R.id.imageButton);
        im2=(ImageButton)findViewById(R.id.imageButton2);

        t2=new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                t2.setLanguage(Locale.ENGLISH);
                t2.setSpeechRate(0.7f);
            }
        });
        if (Quiz.score<=0) {
            t2.speak(s1, TextToSpeech.QUEUE_FLUSH, null);

        }
        else{
            t2.speak(s2,TextToSpeech.QUEUE_FLUSH,null);
        }
        t1.setText("Score is"+Quiz.score);





        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(QuizResult.this,Quiz.class);
                startActivity(i);
                finish();
            }
        });

        im1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(QuizResult.this,Webbrowser.class);
                startActivity(i);
                w.loadUrl("https://www.facebook.com");
                finish();
            }
        });
        im2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(QuizResult.this,Webbrowser.class);
                startActivity(i);
               w.loadUrl("http://www.twitter.com");
                finish();
            }
        });

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent i=new Intent(QuizResult.this,Second.class);
        startActivity(i);
        finish();
    }
}
