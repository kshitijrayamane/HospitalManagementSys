package com.example.hospitalmanagementsys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Register extends AppCompatActivity {
    Button button4; EditText editText,editText2,editText3,editText4,editText8,editText9,editText10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        button4 = (Button)findViewById(R.id.button4);
        btn4_click();
        editText3 = findViewById(R.id.editText3);
        editText4 = findViewById(R.id.editText4);
        editText = findViewById(R.id.editText);
        editText2 = findViewById(R.id.editText2);
        editText10 = findViewById(R.id.editText10);
        editText8 = findViewById(R.id.editText8);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkDataEntered();
            }
        });
    }

    private void btn4_click()
    {
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent i4 = new Intent(Register.this,LoginPatient.class);
                startActivity(i4);
            }
        });
    }

    boolean isEmail(EditText text)
    {
        CharSequence email = text.getText().toString();
        return(!TextUtils.isEmpty(email) && Patterns.EMAIL_ADDRESS.matcher(email).matches());
    }

    boolean isPassword(EditText text)
    {
        CharSequence password = text.getText().toString();
        return(!TextUtils.isEmpty((password) && Patterns.PASSWORD.matcher(password).matches()));
    }
    private void checkDataEntered()
    {

    }
}
