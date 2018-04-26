package com.akshanshgusain.bobtalk;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartActivity extends AppCompatActivity {

    private Button mRegButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        mRegButton=(Button)findViewById(R.id.start_reg_btn);
        mRegButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent itr=new Intent(StartActivity.this,RegisterActivity.class);
                startActivity(itr);
                finish();
            }
        });
    }
}
