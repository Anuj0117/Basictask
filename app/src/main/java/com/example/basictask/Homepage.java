package com.example.basictask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
/// anuj is aman, aman is anuj

public class Homepage extends AppCompatActivity {
TextView tv;
String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        tv=findViewById(R.id.textView2);
        s=getIntent().getStringExtra("name");
        tv.setText("WELCOME "+s+"!!");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.abc,menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void out(MenuItem item) {
        Intent ob=new Intent(Homepage.this,MainActivity.class);
        startActivity(ob);
    }

}
