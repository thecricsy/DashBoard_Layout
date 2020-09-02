package com.example.dashboard_layout;

import android.database.Cursor;
import android.os.Bundle;
import android.os.PersistableBundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.model.Post;

import java.util.ArrayList;

public class Posts extends AppCompatActivity {
    ArrayList<Post> postArrayList;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);

        linkViews();
        getDataFromDB();
    }

    private void linkViews() {
    }

    private void getDataFromDB() {
        Cursor cursor = MainActivity.database.getData("SELECT * FROM Post");
        while (cursor.moveToNext()) {
                    postArrayList.add(new Post(cursor.getInt(0), cursor.getString(1),cursor.getString(2), cursor.getInt(3), cursor.getInt(4), cursor.getInt(5), cursor.getBlob(6),cursor.getString(7),cursor.getInt(8)));
        }
        cursor.close();
    }
}