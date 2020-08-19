package com.example.dashboard_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login_Layout extends AppCompatActivity {

    Button btnCreate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login__layout);

        linkViews();
        addEvents();
    }

    private void addEvents() {
        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            openCreateLayout();
            }
        });
    }

    private void openCreateLayout() {
        Intent intent = new Intent(Login_Layout.this, Register_Layout.class);
        startActivity(intent);
    }

    private void linkViews() {
        btnCreate = findViewById(R.id.btnCreate);
    }

}