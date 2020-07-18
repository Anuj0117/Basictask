package com.example.basictask;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText e1,e2;

String s1,s2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.editTextTextPersonName);
        e2=findViewById(R.id.editTextTextPersonName2);

    }

    public void Signin(View view) {
        s1=e1.getText().toString();
        s2=e2.getText().toString();
        Mydb mydb=new Mydb(MainActivity.this);

        String s3=mydb.check(s1);

if(s2.equals(s3)) {
    Intent obb=new Intent(MainActivity.this,MainActivity2.class);
     obb.putExtra("name",s1);
     startActivity(obb);
}else {
    AlertDialog.Builder builder= new AlertDialog.Builder(MainActivity.this);
    builder.setMessage("Invalid Username Or Password");
    builder.setTitle("Alert !");
    AlertDialog alertDialog=builder.create();
    alertDialog.show();
}



    }
    public void signup(View view) {
        Intent obj=new Intent(MainActivity.this,Signup.class);
        startActivity(obj);
    }
}