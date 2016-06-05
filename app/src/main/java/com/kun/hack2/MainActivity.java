package com.kun.hack2;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewStub;

public class MainActivity extends AppCompatActivity {

    private ViewStub stub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        stub = (ViewStub) findViewById(R.id.stub);
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        Log.d("MainActivity", "onSaveInstanceState");
    }

    int i = 0;

    public void click(View view) {
        if (i % 2 == 0) {
            if(i==0)
                stub.inflate();
            else
                stub.setVisibility(View.VISIBLE);
        } else {
            stub.setVisibility(View.GONE);
        }
        i++;
    }
}
