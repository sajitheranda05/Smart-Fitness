package com.smartFitness.home;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn_enter;
    Button btn_logAsAdmin;
    CharSequence message = "Loading";
    int duration = Toast.LENGTH_SHORT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_enter = (Button) findViewById(R.id.btn_enter);
        btn_logAsAdmin = (Button) findViewById(R.id.btn_logInAsAdmin);

        btn_enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Customer_view_Activity.class);
                startActivity(intent);

                Context context = getApplicationContext();
                Toast.makeText(context,message,duration).show();
            }
        });

        btn_logAsAdmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainAdminLogin.class);
                startActivity(intent);

                Context context = getApplicationContext();
                Toast.makeText(context,message,duration).show();
            }
        });
    }
}