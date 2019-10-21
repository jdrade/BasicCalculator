package com.example.basiccalculator;


import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    EditText num1,num2;
    TextView resultado;
    int n1,n2;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        resultado = findViewById(R.id.resultado);



    }



    public void onClick(View view) {

        n1=Integer.parseInt(num1.getText().toString());
        n2=Integer.parseInt(num2.getText().toString());


        switch (view.getId()){

            case R.id.btn_Add: addition();
            break;

            case R.id.btn_Sub: subtraction();
            break;

            case R.id.btn_Mult: multiplication();
            break;

            case R.id.btn_Div: division();
            break;

        }

    }

    private void addition() {

        int sum = n1 + n2;
        resultado.setText("Result is " + sum);
    }

    private void subtraction() {

        int sub = n1 - n2;
        resultado.setText("Result is: " + sub);
    }

    private void multiplication() {

        int mul = n1 * n2;
        resultado.setText("Result is: " + mul);
    }

    private void division() {

        if (n2 > 0) {
            int div = n1 / n2;
            resultado.setText("Result is: " + div);
        }else {
            Toast.makeText(this,"warning",Toast.LENGTH_LONG).show();
            resultado.setText("Number 2 not equal zero");
        }
    }





}
