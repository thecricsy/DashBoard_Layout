package com.example.dashboard_layout;

import android.database.Cursor;
import android.os.Bundle;
import android.os.PersistableBundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.model.Like;

import java.util.ArrayList;

public class Likes extends AppCompatActivity {
    ArrayList<Like> likeArrayList;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);

        linkViews();
        getDataFromDB();
    }

    private void linkViews() {
    }

    private void getDataFromDB() {
        Cursor cursor = MainActivity.database.getData("SELECT * FROM Like");
        while (cursor.moveToNext()) {
            likeArrayList.add(new Like(cursor.getInt(0), cursor.getInt(1)));
        }
        cursor.close();
    }
}