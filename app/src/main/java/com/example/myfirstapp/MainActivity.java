package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private Button butt1;
    private TextView text2;
    private EditText et2;
    @Override
    public void onClick
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeVariable();
    }

            public void initializeVariable() {
                butt1=findViewById(R.id.button1);
                butt1.setText("ingresar");
                text2=findViewById(R.id.text1);
                text2.setText("JHonatan Raya");
                et2=findViewById(R.id.et1);
                butt1.setOnClickListener(new View.OnClickListener){
                    @Override
                            public void onClick
                }

        }


        }



