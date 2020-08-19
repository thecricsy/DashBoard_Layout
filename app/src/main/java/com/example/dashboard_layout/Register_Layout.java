package com.example.dashboard_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Register_Layout extends AppCompatActivity {

    TextView txtAlreadyLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register__layout);

        linkViews();
        addEvents();
    }

    private void addEvents() {
        txtAlreadyLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLoginLayout();
            }
        });
    }

    private void openLoginLayout() {
        Intent intent = new Intent(Register_Layout.this, Login_Layout.class);
        startActivity(intent);
    }

    private void linkViews() {
        txtAlreadyLogin = findViewById(R.id.txtAlreadyLogin);
    }
}