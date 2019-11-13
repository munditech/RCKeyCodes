package com.mundi.rckeycodes;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_HOME)
            return super.onKeyDown(keyCode, event);
        TextView mRCCodes = findViewById(R.id.rc_code);
        mRCCodes.setTextColor(Color.GREEN);
        mRCCodes.setText(Integer.toString(keyCode));
        return true;
    }
}
