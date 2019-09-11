package com.example.hospitalmanagementsys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginPatient extends AppCompatActivity {
    Button button5,btnl;
    EditText eid,pass;
    Database mydb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_patient);
        button5 = (Button)findViewById(R.id.button5);
        btn5_click();

        eid = findViewById(R.id.et1);
        pass = findViewById(R.id.et2);
       mydb=new Database(this);



        //login onClick
        btnl = (Button)findViewById(R.id.btnL);
      btnl.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {


             boolean b= mydb.CheckUser(eid.getText().toString(),pass.getText().toString());

              if(b==true ){
                  Toast t = Toast.makeText(LoginPatient.this, "Login Sucessfully!", Toast.LENGTH_SHORT);
                  t.show();

              }else {

                  Toast t = Toast.makeText(LoginPatient.this, "Login Unsucessfully!", Toast.LENGTH_SHORT);
                  t.show();

              }
          }
      });
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
