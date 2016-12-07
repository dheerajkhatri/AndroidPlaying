package com.example.khatri.calculator;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText editTextNum1;
    EditText editTextNum2;
    EditText editTextResult;
    Button buttonAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNum1 = (EditText) findViewById(R.id.num1);
        editTextNum2 = (EditText) findViewById(R.id.num2);
        editTextResult= (EditText) findViewById(R.id.result);

        buttonAdd = (Button) findViewById(R.id.add);
        buttonAdd.setOnClickListener(this);

    }

    @Override
    public void onClick(View v){
        float num1 = 0;
        float num2 = 0;
        float result = 0;

        if(TextUtils.isEmpty(editTextNum1.getText().toString()) || TextUtils.isEmpty(editTextNum2.getText().toString())){
            return;
        } else{
            num1 = Float.parseFloat(editTextNum1.getText().toString());
            num2 = Float.parseFloat(editTextNum2.getText().toString());
            result = num1 + num2;
            editTextResult.setText(num1 + " + " + num2 + " = " + result );
        }
    }
}
