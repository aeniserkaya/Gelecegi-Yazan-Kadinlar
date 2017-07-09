package com.eniserkaya.gykchatapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

import org.w3c.dom.Text;

public class ProfileActivity extends AppCompatActivity {


    private ImageView profileImg;
    private TextView userNameTv;
    private ListView customLv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_activity);

        profileImg = (ImageView)findViewById(R.id.profile_img);
        userNameTv = (TextView)findViewById(R.id.username_tv);
        customLv = (ListView)findViewById(R.id.listview_id);

        userNameTv.setText(FirebaseAuth.getInstance().getCurrentUser().getDisplayName());



    }
}
