package com.example.thispc.oneforall;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class Webbrowser extends AppCompatActivity {

    Button b1;
    EditText e1;
    WebView w1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webbrowser);

        b1=(Button)findViewById(R.id.button13);
        e1=(EditText)findViewById(R.id.editText7);
        w1=(WebView)findViewById(R.id.webView);
        WebSettings w2 = w1.getSettings();
        w2.setJavaScriptEnabled(true);
        w1.setWebViewClient(new WebViewClient());

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    String s1 = e1.getText().toString();
                    w1.loadUrl("https://"+s1);



            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent i=new Intent(Webbrowser.this,Second.class);
        startActivity(i);
        finish();
    }
}
