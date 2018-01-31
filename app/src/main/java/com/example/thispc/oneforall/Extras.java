package com.example.thispc.oneforall;

import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Extras extends AppCompatActivity implements SensorEventListener {

    Button b1;
    ImageButton i;
    Sensor s;
    SensorManager sm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extras);

        sm=(SensorManager)getSystemService(SENSOR_SERVICE);
        s=sm.getDefaultSensor(Sensor.TYPE_LIGHT);
        sm.registerListener(this,s,SensorManager.SENSOR_DELAY_NORMAL);

        b1=(Button)findViewById(R.id.button27);
        i=(ImageButton)findViewById(R.id.imageButton3);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Extras.this,Accelerometer.class);
                startActivity(i);
                finish();

            }
        });

    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.values[0]>3){
        i.setBackgroundResource(R.drawable.l2);
    }else{
            i.setBackgroundResource(R.drawable.l);
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent i=new Intent(Extras.this,Second.class);
        startActivity(i);
        finish();
    }
}
