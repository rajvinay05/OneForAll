package com.example.thispc.oneforall;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Signup extends AppCompatActivity {

    Button b1;
    EditText e1,e2,e3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        b1=(Button)findViewById(R.id.button3);

        e1=(EditText)findViewById(R.id.editText3);
        e2=(EditText)findViewById(R.id.editText5);
        e3=(EditText)findViewById(R.id.editText4);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                String s3=e3.getText().toString();

                if (s1.equals("")||s2.equals("")||s3.equals("")){
                    Toast.makeText(Signup.this, "fill all", Toast.LENGTH_SHORT).show();
                }
                else {
                    SQLiteDatabase data=openOrCreateDatabase("oneforall",MODE_PRIVATE,null);
                    data.execSQL("CREATE TABLE IF NOT EXISTS student (name varchar,email varchar,password varchar)");
                    String s4="SELECT * FROM student WHERE email='"+s2+"' AND password='"+s3+"'" ;
                    Cursor cursor=data.rawQuery(s4,null);
                    if(cursor.getCount()>0){
                        Toast.makeText(Signup.this, "User ALREADY exists .PLEaSE LOGIN", Toast.LENGTH_SHORT).show();

                    }
                    else{
                        data.execSQL("INSERT INTO student VALUES ('"+s1+"','"+s2+"','"+s3+"')");
                        Toast.makeText(Signup.this, "database updated", Toast.LENGTH_SHORT).show();
                        Intent i=new Intent(Signup.this,MainActivity.class);
                        startActivity(i);
                        finish();
                    }
                }
            }
        });






    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent i=new Intent(Signup.this,MainActivity.class);
        startActivity(i);
        finish();
    }
}
