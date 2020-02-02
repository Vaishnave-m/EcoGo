package com.example.gigatree20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

 //   private Object Main_Menu;

    private Button btnStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnStart = (Button) findViewById(R.id.btnStart);
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainMenu();
            }
        });

    }
        public void openMainMenu(){
        Intent intent = new Intent(this, Main_Menu.class);
        startActivity(intent);
        }

    public boolean onCreateOptionsMenu() {
        Button button = (Button) findViewById(R.id.btnStart);

        button.setOnClickListener(new OnClickListener() {

            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Main_Menu.class);
                startActivity(i);
                Toast.makeText(MainActivity.this, "Button Clicked", Toast.LENGTH_SHORT).show();
            }

        });
        return true;
    }



}
