package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    CompoundButton switchCompat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        switchCompat=findViewById(R.id.on_of_Switch);

    }

    public void Click_here(View view) {

        Toast.makeText(this, R.string.toast_message, Toast.LENGTH_LONG).show();

    }

    public void onCheckChanged(View view) {



        showSnackBar(view,switchCompat,switchCompat.isChecked());


    }



    public void showSnackBar(View view , CompoundButton cb, boolean b){
        if(b) {
            Snackbar.make(view,R.string.The_switch_is_now_on, Snackbar.LENGTH_LONG).setAction("undo", click -> cb.setChecked(!b)).show();
        }else {
            Snackbar.make(view, R.string.The_switch_is_now_off, Snackbar.LENGTH_LONG).setAction("undo", click -> cb.setChecked(!b)).show();

        }


    }









}