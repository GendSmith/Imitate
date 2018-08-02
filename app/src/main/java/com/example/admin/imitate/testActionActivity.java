package com.example.admin.imitate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ubtrobot.mini.action.ActionApi;

public class testActionActivity extends AppCompatActivity {
    private ActionApi actionApi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_action);
        actionApi.playAction("dance_0002",null);
    }
}
