package com.moringa.badilipesa.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;

import android.os.Bundle;

import com.moringa.badilipesa.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.buttonLogin) Button mButtonLogin;
    @BindView(R.id.usernameText) EditText mUsernameText;
    @BindView(R.id.currencySymbolInput) EditText mCurrencySymbol;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mButtonLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view == mButtonLogin) {
            String username = mUsernameText.getText().toString();
            String currencySymbol = mCurrencySymbol.getText().toString();
            Intent intent = new Intent(MainActivity.this, RelatedCurrenciesListActivity.class);
            intent.putExtra("username", username);
            intent.putExtra("currencySymbol", currencySymbol);
            startActivity(intent);
        }
    }
}