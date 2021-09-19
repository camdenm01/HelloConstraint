package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        mCount++;
        View zero_button = findViewById(R.id.zero_button);
        if (mShowCount != null){
            mShowCount.setText(Integer.toString(mCount));
            zero_button.setBackgroundColor(Color.CYAN);
        }
        if(mCount % 2 == 1){
            view.setBackgroundColor(Color.GREEN);
        }
        else{
            view.setBackgroundColor(Color.BLUE);
        }
    }

    public void zero(View view) {
        mCount = 0;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
        view.setBackgroundColor(getResources().getColor(R.color.grey));
    }
}