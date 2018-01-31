package com.example.thispc.oneforall;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calci extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17;
    EditText e1;
    TextView t1;

    int b=0,c;
    String a="",aa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calci);

        b1=(Button)findViewById(R.id.button12);
        b2=(Button)findViewById(R.id.button15);
        b3=(Button)findViewById(R.id.button16);
        b4=(Button)findViewById(R.id.button17);
        b5=(Button)findViewById(R.id.button18);
        b6=(Button)findViewById(R.id.button19);
        b7=(Button)findViewById(R.id.button20);
        b8=(Button)findViewById(R.id.button21);
        b9=(Button)findViewById(R.id.button24);
        b10=(Button)findViewById(R.id.button30);
        b11=(Button)findViewById(R.id.button31);
        b12=(Button)findViewById(R.id.button32);
        b13=(Button)findViewById(R.id.button33);
        b14=(Button)findViewById(R.id.button34);
        b15=(Button)findViewById(R.id.button35);
        b16=(Button)findViewById(R.id.button36);
        b17=(Button)findViewById(R.id.button37);

        e1=(EditText)findViewById(R.id.editText8);

        t1=(TextView)findViewById(R.id.textView23);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //a=e1.getText().toString();
                a=a+"1";
                e1.setText(a);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //a=e1.getText().toString();
                a=a+"2";
                e1.setText(a);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //a=e1.getText().toString();
                a=a+"3";
                e1.setText(a);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //a=e1.getText().toString();
                a=a+"4";
                e1.setText(a);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //a=e1.getText().toString();
                a=a+"5";
                e1.setText(a);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //a=e1.getText().toString();
                a=a+"6";
                e1.setText(a);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //a=e1.getText().toString();
               a=a+"7";
                e1.setText(a);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //a=e1.getText().toString();
                a=a+"8";
                e1.setText(a);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //a=e1.getText().toString();
                a=a+"9";
                e1.setText(a);
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //a=e1.getText().toString();
                a=a+"0";
                e1.setText(a);
            }
        });

        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                aa=a;
                c=Integer.parseInt(aa);
                b=b/c;
                a="";
                e1.setText("/");
                e1.setText("");
            }
        });

        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                aa=a;
                c=Integer.parseInt(aa);
                b=b*c;
                a="";
                e1.setText("*");
                e1.setText("");
            }
        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                aa=a;
                c=Integer.parseInt(aa);
                b=b-c;
                a="";
                e1.setText("-");
                e1.setText("");

            }
        });

        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                aa=a;
                c=Integer.parseInt(aa);
                b=b+c;
                a="";
                e1.setText("+");
                e1.setText("");
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText(b);
            }
        });

        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText("");
                t1.setText("");
                b=0;
                c=0;
                a="";
            }
        });






    }
}
