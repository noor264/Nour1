package com.example.nour1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;

public class MainActivity extends AppCompatActivity {


    private EditText et_User_name, et_Password;
    private FirebaseServices fbs;
    private Utilities utils;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_User_name = findViewById(R.id.etUsername);
        et_Password = findViewById(R.id.etPassword);
        fbs = fbs.getInstance();
        utils = Utilities.getInstance();

    }

    public void login(View view) {

        // TODO: 1- Get data from screen
        String username = et_User_name.getText().toString();
        String password = et_User_name.getText().toString();

        // TODO: 2- Data validation
        if (username.trim().isEmpty() || password.trim().isEmpty()) {
            Toast.makeText(this, "Username or password is missing!", Toast.LENGTH_SHORT).show();
            return;
        }

        // TODO: 3- Check username and password with Firebase Authentication
        fbs.getAuth().signInWithEmailAndPassword(username, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // TODO: commands if successful
                            moveToPiano();
                        } else {


                            Toast.makeText(MainActivity.this, "Username or password is empty!", Toast.LENGTH_SHORT).show();
                            return;
                        }
                    }
                });
    }

    private void moveToPiano() {
        Intent i = new Intent(this, Playpiano.class);
        startActivity(i);
    }

    public void signup(View view) {
        // TODO: move to signup page
        Intent i = new Intent(this, Signup.class);
        startActivity(i);
    }

}