package com.gleerup.mtg.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pushIncomeButton(View view){
        Intent intent = new Intent(this, EnterIncome.class);
        startActivity(intent);
    }

    public void pushExpenseButton(View view){
        Intent intent = new Intent(this, EnterExpense.class);
        startActivity(intent);
    }
    public void onBalanceClick(View view){
        Intent intent = new Intent(this, AccountActivity.class);
        startActivity(intent);
    }

}
