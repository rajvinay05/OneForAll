package com.example.thispc.oneforall;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1,b2;
     EditText e1,e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button2);
        e1=(EditText)findViewById(R.id.editText);
        e2=(EditText)findViewById(R.id.editText2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String s1=e1.getText().toString();
                String s2=e2.getText().toString();

                if (s1.equals("")||s2.equals("")){
                    Toast.makeText(MainActivity.this, "Fill all the Fields", Toast.LENGTH_SHORT).show();
                }
                else{
                    SQLiteDatabase data=openOrCreateDatabase("oneforall",MODE_PRIVATE,null);
                    data.execSQL("CREATE TABLE IF NOT EXISTS student (name varchar,email varchar,password varchar)");
                    String s3="SELECT * FROM student WHERE email='"+s1+"' AND password='"+s2+"'" ;
                    Cursor cursor=data.rawQuery(s3,null);
                    if(cursor.getCount()>0){
                        Intent i=new Intent(MainActivity.this,Second.class);
                        startActivity(i);
                        finish();
                    }
                    else{
                        Toast.makeText(MainActivity.this, "user does not exist. SIGN UP please. ", Toast.LENGTH_SHORT).show();
                        Intent i=new Intent(MainActivity.this,Signup.class);
                        startActivity(i);
                        finish();
                    }



                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,Signup.class);
                startActivity(i);
                finish();
            }
        });
    }
}
