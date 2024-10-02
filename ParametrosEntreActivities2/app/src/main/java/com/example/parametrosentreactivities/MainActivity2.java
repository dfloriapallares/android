package com.example.parametrosentreactivities;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.TextView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.parametrosentreactivities.databinding.ActivityMain2Binding;

public class MainActivity2 extends AppCompatActivity {
    private TextView txtUser;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtUser = findViewById(R.id.txtUserPantalla2);

        Bundle variables = getIntent().getExtras();
        String user = variables.getString("USUARIO");

        txtUser.setText(user);
    }
}