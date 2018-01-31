package com.example.thispc.oneforall;

import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Kamera extends AppCompatActivity {

    Button b1;
    ImageView i1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kamera);
        b1=(Button)findViewById(R.id.button23);
        i1=(ImageView)findViewById(R.id.imageView);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(i,0);
            }
        });

    }
    @Override
    protected  void onActivityResult(int requestCode, int resultCode, Intent data){
        Bitmap m1=(Bitmap)data.getExtras().get("data");
        i1.setImageBitmap(m1);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent i=new Intent(Kamera.this,Second.class);
        startActivity(i);
        finish();
    }
}
