package com.example.rentacab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {

Button button,button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void register(View veiw){
        Intent intent = new Intent(this,registerActivity.class);
startActivity(intent);
    }
    public void login(View view ){
        Intent intent2 = new Intent(this, loginActivity.class);
        startActivity(intent2);
    }


}