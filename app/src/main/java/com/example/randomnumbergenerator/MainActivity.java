package com.example.randomnumbergenerator;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=findViewById(R.id.textViewRandomNumber);

        button=findViewById(R.id.buttonGenerate);

        button.setOnClickListener(view -> {

            int min =1;
            int max=50;

            int randomNumber = min+((int)(Math.random()*(max-min)+1));


            textView.setText(String.valueOf(randomNumber));
        });

    }
}