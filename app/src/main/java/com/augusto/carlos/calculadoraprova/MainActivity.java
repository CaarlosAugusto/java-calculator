package com.augusto.carlos.calculadoraprova;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.widget.*;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText editText;
    private Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9;
    private Button btSoma, btSubt, btMulti, btDiv;
    private Button btResult, btPonto;
    private double result;
    private int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.editText);
        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);

        btSoma = (Button) findViewById(R.id.btSoma);
        btSubt = (Button) findViewById(R.id.btSubt);
        btMulti = (Button) findViewById(R.id.btMulti);
        btDiv = (Button) findViewById(R.id.btDiv);

        btPonto = (Button) findViewById(R.id.btPonto);

        button0.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        btPonto.setOnClickListener(this);
        btDiv.setOnClickListener(this);
        btMulti.setOnClickListener(this);
        btSubt.setOnClickListener(this);
        btSoma.setOnClickListener(this);
        btResult.setOnClickListener(this);
    }

    public void onClick(View v) {

    }

    public void btSoma(View v){
        result = Double.parseDouble(editText.getText().toString());
        i=0;
        editText.setText("");
    }

    public void btSubt(View v){
        result = Double.parseDouble(editText.getText().toString());
        i=1;
        editText.setText("");
    }

    public void btMulti(View v){
        result = Double.parseDouble(editText.getText().toString());
        i=2;
        editText.setText("");
        setContentView(R.layout.activity_main);
    }

    public void btDiv(View v){
        result = Double.parseDouble(editText.getText().toString());
        i=3;
        editText.setText("");
        setContentView(R.layout.activity_main);
    }

    public void btResult(View v){
        double valor2 = Double.parseDouble(editText.getText().toString());

        if (i==0)
            result= result+ valor2;
        if (i==1)
            result= result-valor2;
        if (i==2)
            result= result*valor2;
        if (i==3)
            result= result/valor2;


        AlertDialog.Builder alt = new AlertDialog.Builder(this);
        alt.setMessage("Resultado = "+result);
        alt.setNeutralButton("OK", null);
        alt.show();


    }


    public void btPonto(View v){
        editText.setText(editText+".");
        setContentView(R.layout.activity_main);
    }

    public void button0(View v){
        editText.setText(editText+"0");
    }
    public void button1(View v){
        editText.setText(editText+"1");
        setContentView(R.layout.activity_main);
    }
    public void button2(View v){
        editText.setText(editText+"2");
        setContentView(R.layout.activity_main);
    }
    public void button3(View v){
        editText.setText(editText+"3");
        setContentView(R.layout.activity_main);
    }
    public void button4(View v){
        editText.setText(editText+"4");
        setContentView(R.layout.activity_main);
    }
    public void button5(View v){
        editText.setText(editText+"5");
        setContentView(R.layout.activity_main);
    }
    public void button6(View v){
        editText.setText(editText+"6");
        setContentView(R.layout.activity_main);
    }
    public void button7(View v){
        editText.setText(editText+"7");
        setContentView(R.layout.activity_main);
    }
    public void button8(View v){
        editText.setText(editText+"8");
        setContentView(R.layout.activity_main);
    }
    public void button9(View v){
        editText.setText(editText+"9");
        setContentView(R.layout.activity_main);
    }

}
