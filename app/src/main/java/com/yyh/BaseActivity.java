package com.yyh;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class BaseActivity extends AppCompatActivity {
    //复写父类的Oncreate 方法
    protected  void OnCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        //获得当前类名并打印出来
        Log.d("BaseActivity",getClass().getSimpleName());
        ActivityCollector.addActivity(this);

    }
    protected  void OnDestroy(){
        super.onDestroy();
        ActivityCollector.removeActivity(this);
    }
}
