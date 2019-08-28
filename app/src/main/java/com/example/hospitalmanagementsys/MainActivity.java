package com.example.hospitalmanagementsys;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    Button button,button2,button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        btn_click();
        btn_click2();
        btn_click3();
    }
    public void btn_click() {
        button.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View view) {
                                          Intent i1 = new Intent(MainActivity.this, LoginAdmin.class);
                                          startActivity(i1);
                                      }
                                  }
        );
    }
    public void btn_click2(){
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(MainActivity.this, LoginPatient.class);
                startActivity(i2);
            }
        }
        );
    }

    public void btn_click3(){
            button3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i3 = new Intent(MainActivity.this, LoginDoctor.class);
                    startActivity(i3);}});
        };

    }

