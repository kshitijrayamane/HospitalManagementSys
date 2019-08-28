package com.example.hospitalmanagementsys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginPatient extends AppCompatActivity {
    Button button5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_patient);
        button5 = (Button)findViewById(R.id.button5);
        btn5_click();
    }
    public void btn5_click() {
        button5.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View view) {
                                          Intent i5 = new Intent(LoginPatient.this, Register.class);
                                          startActivity(i5);
                                      }
                                  }
        );
    }
}
