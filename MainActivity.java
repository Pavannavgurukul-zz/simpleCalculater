package com.example.android.geoquiseapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Button mButton1,mButton2,mButton3,mButton4;
    EditText mEdit1,mEdit2;
    TextView mText;
    float res;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton1 = (Button) findViewById(R.id.btn1);
        mButton2 = (Button) findViewById(R.id.btn2);
        mButton3 = (Button) findViewById(R.id.btn3);
        mButton4 = (Button) findViewById(R.id.btn4);
        mEdit1 = (EditText) findViewById(R.id.etx1);
        mEdit2 = (EditText) findViewById(R.id.etx2);
        mText = (TextView) findViewById(R.id.tv1);
//        String et1= mEdit1.getText().toString();
//        String et2= mEdit2.getText().toString();
//
//
//
//        if (et1.matches("") || et2.matches("")) {
//            Toast.makeText(this,"You did not enter a username",Toast.LENGTH_SHORT).show();
//            return;
//        }

        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String et1= mEdit1.getText().toString();
                String et2= mEdit2.getText().toString();
                float fet1=Float.parseFloat(et1);
                float fet2=Float.parseFloat(et2);
                res = fet1+fet2;
                mText.setText(Float.toString(res));

            }
        });
        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String et1= mEdit1.getText().toString();
                String et2= mEdit2.getText().toString();
                float fet1=Float.parseFloat(et1);
                float fet2=Float.parseFloat(et2);
                res = fet1-fet2;
                mText.setText(Float.toString(res));
            }
        });
        mButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String et1= mEdit1.getText().toString();
                String et2= mEdit2.getText().toString();
                float fet1=Float.parseFloat(et1);
                float fet2=Float.parseFloat(et2);
                res = fet1*fet2;
                mText.setText(Float.toString(res));
            }
        });
        mButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String et1= mEdit1.getText().toString();
                String et2= mEdit2.getText().toString();
                res=Integer.parseInt(et1)/Integer.parseInt(et2);
                mText.setText(Float.toString(res));
            }
        });
    }
}

