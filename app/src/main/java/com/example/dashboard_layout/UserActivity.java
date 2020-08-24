package com.example.dashboard_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class UserActivity extends AppCompatActivity {

    String[] ds = {"Bài viết của bạn","Bài viết đã lưu","Trợ giúp","Đổi mật khẩu","Ngôn ngữ","Đăng xuất"};
    ListView lsvUser;
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
        lsvUser = findViewById(R.id.lsvUser);
        imvAvatar = findViewById(R.id.imvAvatar);
        txtUserName = findViewById(R.id.txtUserName);

        adapter = new ArrayAdapter<>(this,android.R.layout.simple_expandable_list_item_1, ds );
        lsvUser.setAdapter(adapter);
    }
}