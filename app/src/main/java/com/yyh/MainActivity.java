package com.yyh;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    protected  void OnCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    Button button =(Button) findViewById(R.id.button);
    button.setOnClickListener(this);
    replaceFragment(new RightFragment());


    }

    @Override
    public void onClick(View v) {
     switch (v.getId()){
         case R.id.button:
             replaceFragment(new AnotherRightFragmnet());
             break;
             default:
                 break;

     }
    }

    public void replaceFragment(Fragment fragment){
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction transaction=fragmentManager.beginTransaction();
        transaction.replace(R.id.right_layout,fragment);
        transaction.commit();
    }
}
