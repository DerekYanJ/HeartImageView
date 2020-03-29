package com.yqy.heartimageview;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button btn_test;
    private ImageView iv_heart_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_test = findViewById(R.id.btn_test);
        iv_heart_1 = findViewById(R.id.iv_heart_1);

        btn_test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iv_heart_1.setImageResource(R.mipmap.ic_launcher_1);
            }
        });
    }
}
