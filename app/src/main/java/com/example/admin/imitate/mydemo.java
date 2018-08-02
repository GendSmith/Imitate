package com.example.admin.imitate;

import android.app.Activity;

import com.ubtrobot.mini.RobotApplication;
import com.ubtrobot.mini.RobotSkillInfo;
import com.ubtrobot.mini.action.ActionApi;

public class mydemo extends RobotApplication {
    //super.onCreate();



  private ActionApi actionApi;
    @Override
    protected void onStartFailed(RobotSkillInfo ubtSkillInfo) {

    }

    @Override
    protected void onInterrupted() {

    }

    public void onCreate() {
        super.onCreate();
        actionApi.playAction("dance_0002",null);

    }
}
