package com.example.dashboard_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class UserActivity extends AppCompatActivity {

    ImageView imvAvatar;
    TextView txtUserName;

    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user2);

        addView();

    }

    private void addView() {
        imvAvatar = findViewById(R.id.imvAvatar);
        txtUserName = findViewById(R.id.txtUserName);


    }
}