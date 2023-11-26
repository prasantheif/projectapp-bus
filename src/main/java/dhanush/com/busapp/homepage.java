package dhanush.com.busapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageButton;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class homepage extends AppCompatActivity {
    EditText ed1;
    AppCompatImageButton btn1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);

        btn1 = findViewById(R.id.searchbtn);
        ed1 = findViewById(R.id.editText);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String k = ed1.getText().toString();
                k = k.toLowerCase();
                if(k.contains("camba")){
                    Intent i = new Intent(homepage.this, camba.class);
                    startActivity(i);
                }
                else if(k.contains("hami")){
                    Intent i = new Intent(homepage.this, hamirpur.class);
                    startActivity(i);
                }
                else if(k.contains("da")){
                    Intent i = new Intent(homepage.this, dalhouise.class);
                    startActivity(i);
                }
                else if(k.contains("ban") || k.contains("b")){
                    Intent i = new Intent(homepage.this, banjar.class);
                    startActivity(i);
                }
                else{
                    Intent i = new Intent(homepage.this,choose.class);
                    startActivity(i);
                }
            }
        });


    }
}