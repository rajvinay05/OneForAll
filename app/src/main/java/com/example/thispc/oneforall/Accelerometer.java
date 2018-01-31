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
import android.widget.TextView;

public class Accelerometer extends AppCompatActivity implements SensorEventListener {

    TextView t1,t2,t3;
    Button b1;
    SensorManager sm;
    Sensor s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accelerometer);

        b1=(Button)findViewById(R.id.button14);
        t1=(TextView)findViewById(R.id.textView6);
        t2=(TextView)findViewById(R.id.textView7);
        t3=(TextView)findViewById(R.id.textView8);
        sm=(SensorManager)getSystemService(SENSOR_SERVICE);
        s=sm.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        sm.registerListener(this,s,SensorManager.SENSOR_DELAY_NORMAL);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Accelerometer.this,Second.class);
                startActivity(i);
                finish();
            }
        });
    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {

        Float x=sensorEvent.values[0];
        Float y=sensorEvent.values[1];
        Float z=sensorEvent.values[2];
        t1.setText(Float.toString(x));
        t2.setText(Float.toString(y));
        t3.setText(Float.toString(z));
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent i=new Intent(Accelerometer.this,Extras.class);
        startActivity(i);
        finish();

    }
}

