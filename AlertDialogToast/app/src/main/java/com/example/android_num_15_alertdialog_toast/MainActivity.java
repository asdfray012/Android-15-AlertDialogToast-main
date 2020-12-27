package com.example.android_num_15_alertdialog_toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btn_toast(View v){
        Toast.makeText(this, "Hello World",
                Toast.LENGTH_SHORT).show();
    }
    public void btn_alertDialog(View v){
        AlertDialog.Builder Alertdialog = new AlertDialog.Builder(this);
        Alertdialog.setTitle("Talk Test");
        Alertdialog.setMessage("This is a talk window ");
        Alertdialog.setCancelable(true);
        Alertdialog.setPositiveButton("Close window", null);
        Alertdialog.show();
    }
}