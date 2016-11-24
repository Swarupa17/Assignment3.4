package com.example.swarupa.assignment34;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Welcome extends AppCompatActivity {
    TextView tvName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        tvName = (TextView)findViewById(R.id.tvNameResult);

        Intent intent = getIntent();
        String Res="Welcomes to " + intent.getExtras().getString("BundleName");

        tvName.setText(Res);
    }
}
