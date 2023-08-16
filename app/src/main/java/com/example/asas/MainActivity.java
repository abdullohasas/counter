package com.example.asas;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.asas.R;

public class MainActivity extends AppCompatActivity {

    TextView textView2, welcome_text;
    Button button,button2;

    int cnt=0;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView2 = findViewById(R.id.textView2);
        welcome_text = findViewById(R.id.welcome_text);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView2.setText("" + incCount());
            }
        });

        button2.setOnClickListener(view -> textView2.setText("" + incMinus()));


    }

    public int incCount(){
        return  ++cnt;
    }

public int incMinus(){
        return --cnt;
}

}