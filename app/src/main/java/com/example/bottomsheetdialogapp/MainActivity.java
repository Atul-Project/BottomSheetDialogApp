package com.example.bottomsheetdialogapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.material.bottomsheet.BottomSheetDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openBottomSheet(View view) {
        final BottomSheetDialog bottomSheetDialog=new BottomSheetDialog(this,R.style.myBottomSheetDialogTheme);

        View view1= LayoutInflater.from(this).inflate(R.layout.layout_bottom_sheet,(LinearLayout)findViewById(R.id.bottomsheetcontainer),false);
        Button mybotton=view1.findViewById(R.id.allow_permission);
        mybotton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hello", Toast.LENGTH_SHORT).show();
                bottomSheetDialog.dismiss();
            }
        });
        bottomSheetDialog.setContentView(view1);
        bottomSheetDialog.setCanceledOnTouchOutside(false);
        bottomSheetDialog.show();

    }
}