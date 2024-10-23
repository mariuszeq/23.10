package com.example.a2310;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int liczbaPolubien;
    private Button buttonPolub;
    private Button buttonUsun;
    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textView4);

        buttonPolub = findViewById(R.id.button);
        buttonPolub.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        liczbaPolubien++;
                        textView.setText("liczba polubien wynnosi" + String.valueOf(liczbaPolubien));
                    }
                }
        );

        buttonUsun = findViewById(R.id.button2);
        buttonUsun.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        liczbaPolubien = 0;
                        textView.setText("liczba polubien wynnosi" + String.valueOf(liczbaPolubien));
                    }
                }
        );



        /*
                                    textView.setText("Koniec testu otrzymałeś "+String.valueOf(ile)+" punktów");

        buttonPolub.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        sprawdzToPytanie(true);
                    }
                }
        );
*/


    }
}