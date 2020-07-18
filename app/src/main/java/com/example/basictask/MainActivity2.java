package com.example.basictask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    EditText e1,e2;
    String s,s1,s2;
    TextView t1, t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        e1 = findViewById(R.id.editTextTextPersonName8);
        e2 = findViewById(R.id.editTextTextPersonName9);
        t1 = findViewById(R.id.textView3);
        t2 = findViewById(R.id.textView4);
        s=getIntent().getStringExtra("name");
        t2.setText("WELCOME "+s+"!!");
    }

    public void BMI(View view) {
        s1 = e1.getText().toString();
        s2 = e2.getText().toString();
        float a = Float.parseFloat(s1);
        float b = Float.parseFloat(s2);
        float bmi = a/(b*b);
        t1.setText(bmi+"");
        if (bmi<18.5){
            Toast.makeText(this, "You are like Amit Soni eat more ", Toast.LENGTH_SHORT).show();
        }
        else if(bmi>25){
            Toast.makeText(this, "You are like Adil Nawab eat less", Toast.LENGTH_SHORT).show();
        }
        else if((bmi>=18.5) || (bmi<=25)){
            Toast.makeText(this, "You are like Anuj, superr", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.abc,menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void out(MenuItem item) {
        Intent ob=new Intent(MainActivity2.this,MainActivity.class);
        startActivity(ob);
    }
}