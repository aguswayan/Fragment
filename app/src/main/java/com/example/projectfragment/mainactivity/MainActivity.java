package com.example.projectfragment.mainactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.projectfragment.R;
import com.example.projectfragment.fragment.EndFragment;
import com.example.projectfragment.fragment.StartFragment;

public class MainActivity extends FragmentActivity implements View.OnClickListener {
    Button btnstart, btnend;

    StartFragment fragmentstart;
    EndFragment fragmentend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnstart = findViewById(R.id.btn_start);
        btnend = findViewById(R.id.btn_end);

        btnstart.setOnClickListener(this);
        btnend.setOnClickListener(this);
    }

    void menuStart(){
        fragmentstart = new StartFragment();
        FragmentTransaction ft = getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, fragmentstart);
        ft.commit();
    }

    void menuEnd(){
        fragmentend = new EndFragment();
        FragmentTransaction ft = getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, fragmentend);
        ft.commit();
    }

    @Override
    public void onClick(View v) {
        if (v == btnstart) {
            menuStart();
        }
        if (v == btnend) {
            menuEnd();
        }
    }
}