package com.example.dashboard_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public static Databases database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createDB();
    }

    private void createDB() {
        this.deleteDatabase("CookBook.sqlite");
        database = new Databases(this,"CBook.sqlite",null,1);
        database.queryData("CREATE TABLE IF NOT EXISTS Account(AccountId INTEGER PRIMARY KEY AUTOINCREMENT, Email VARCHAR(100), Name NVARCHAR(100), DOB TEXT, Password VARCHAR(200), Gender INTEGER, Avatar BLOB)");
        database.queryData("CREATE TABLE IF NOT EXISTS Post(PostId INTEGER PRIMARY KEY AUTOINCREMENT, Header VARCHAR(300),Intro Text, Serving INTEGER, PrepTime INTEGER, CookTime INTEGER, Poster BLOB, TimeWriten TEXT, AccountId INTEGER, FOREIGN KEY(AccountId) REFERENCES Account(AccountId) ON DELETE CASCADE)");
        database.queryData("CREATE TABLE IF NOT EXISTS Direction(DirectionId INTEGER PRIMARY KEY AUTOINCREMENT, Content TEXT, Picture BLOB, Number INTEGER, PostId INTEGER, FOREIGN KEY(PostId) REFERENCES Post(PostId) ON DELETE CASCADE)");
        database.queryData("CREATE TABLE IF NOT EXISTS Ingredient(IngredientId INTEGER PRIMARY KEY AUTOINCREMENT, IngredientName NVARCHAR(250), Amount NVARCHAR(200), PostId INTEGER, FOREIGN KEY(PostId) REFERENCES Post(PostId) ON DELETE CASCADE)");
        database.queryData("CREATE TABLE IF NOT EXISTS SavePost(PrivateNote TEXT, AccountId INTEGER NOT NULL, PostId INTEGER NOT NULL, FOREIGN KEY(AccountId) REFERENCES Account(AccountId) ON DELETE CASCADE, FOREIGN KEY(PostId) REFERENCES Post(PostId) ON DELETE CASCADE, PRIMARY KEY (AccountId,PostId))");
        database.queryData("CREATE TABLE IF NOT EXISTS Like(AccountId INTEGER NOT NULL, PostId INTEGER NOT NULL, FOREIGN KEY(AccountId) REFERENCES Account(AccountId) ON DELETE CASCADE, FOREIGN KEY(PostId) REFERENCES Post(PostId) ON DELETE CASCADE, PRIMARY KEY (AccountId,PostId))");

    }
}