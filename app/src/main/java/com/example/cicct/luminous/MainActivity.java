package com.example.cicct.luminous;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    ImageView off;
    ToggleButton btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        off= (ImageView)findViewById(R.id.lightOff);
        btn=(ToggleButton)findViewById(R.id.offSwitch);

        btn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    off.setImageResource(R.drawable.on);

                }else{
                    off.setImageResource(R.drawable.off);
                }
            }
        });


    }
}
