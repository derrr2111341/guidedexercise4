package com.example.guidedexercise4;


import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.guidedexercise4.R;

public class MainActivity extends AppCompatActivity {
    EditText username, password;
    TextView result;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.etUsernameGE4);
        password = findViewById(R.id.etPassword2GE4);
        result = findViewById(R.id.tvResultGE4);
        login = findViewById(R.id.btnLoginGE4);
        showResult();
    }

    public void showResult(){
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username.getText().toString().equals("redboi") &&
                        password.getText().toString().equals("lambanog")){
                    result.setText("Welcome " + username.getText().toString() +"!");
                    // this will set the result text color into GREEN
                    result.setTextColor(Color.GREEN);
                    clearEntry();

                }else{
                    result.setText("Username and Password does not exist!");
                    // this will set the result text color into RED
                    result.setTextColor(Color.RED);
                    clearEntry();

                }
            }
        });
    }

    public void clearEntry(){
        result.setVisibility(View.VISIBLE);
        username.setText("");
        password.setText("");
        username.requestFocus();
    }
}