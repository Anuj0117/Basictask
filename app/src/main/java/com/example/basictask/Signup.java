package com.example.basictask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Signup extends AppCompatActivity {
EditText ed1,ed2,ed3,ed4,ed5;
String s1,s2,s3,s4,s5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        ed1=findViewById(R.id.editTextTextPersonName3);
        ed2=findViewById(R.id.editTextTextPersonName4);
        ed3=findViewById(R.id.editTextTextPersonName5);
        ed4=findViewById(R.id.editTextTextPersonName6);
        ed5=findViewById(R.id.editTextTextPersonName7);
    }

    public void filldata(View view) {
        s1=ed1.getText().toString();
        s2=ed2.getText().toString();
        s3=ed3.getText().toString();
        s4=ed4.getText().toString();
        s5=ed5.getText().toString();
        Mydb mydb=new Mydb(Signup.this);
        mydb.getandsave(s1,s2,s3,s4,s5);
        Toast.makeText(this, "Saved!!", Toast.LENGTH_SHORT).show();
       Intent ob1=new Intent(Signup.this,MainActivity2.class);
       ob1.putExtra("name",s1);
       startActivity(ob1);

    }
}