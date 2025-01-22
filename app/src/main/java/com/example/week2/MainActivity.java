package com.example.week2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etName, etPassword, etPhone;
    RadioButton rbMale, rbFemale;
    CheckBox cbJava, cbPython, cbMeanstack;
    Spinner spcities;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.etName);
        etPassword = findViewById(R.id.etPassword);
        etPhone = findViewById(R.id.etPhone);
        rbMale = findViewById(R.id.rbMale);
        rbFemale = findViewById(R.id.rbFemale);
        cbJava = findViewById(R.id.cbJava);
        cbPython = findViewById(R.id.cbPython);
        cbMeanstack = findViewById(R.id.cbMERN);
        spcities = findViewById(R.id.spcities);
    }

    public void getValue(View v) {
        String name = etName.getText().toString();
        String password = etPassword.getText().toString();
        String phone = etPhone.getText().toString();

        String gender = "";
        if (rbMale.isChecked()) {
            gender = rbMale.getText().toString();
        }
        if (rbFemale.isChecked()) {
            gender = rbFemale.getText().toString();
        }

        String interest = "";
        if (cbJava.isChecked()) {
            interest += cbJava.getText().toString();
        }
        if (cbPython.isChecked()) {
            interest += cbPython.getText().toString();
        }
        if (cbMeanstack.isChecked()) {
            interest += cbMeanstack.getText().toString();
        }

        String city = spcities.getSelectedItem().toString();
        String result = name + "\n" + password + "\n" + phone + "\n" + gender + "\n" + interest + "\n" + city;

        Toast.makeText(this, result, Toast.LENGTH_LONG).show();
    }
}
