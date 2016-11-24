package com.example.swarupa.assignment34;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText editText;
    Bundle bundle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button)findViewById(R.id.button);
        editText = (EditText)findViewById(R.id.etInputName);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!editText.getText().toString().isEmpty()){
                    Intent intent = new Intent(MainActivity.this,Welcome.class);
                    bundle = new Bundle();
                    bundle.putString("BundleName",editText.getText().toString().trim());
                    intent.putExtras(bundle);
                    startActivity(intent);
                }else {
                    Toast.makeText(MainActivity.this,"Please Enter Your Name",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }}

