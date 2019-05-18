package com.yyh;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class Test extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        //找到对应的编辑框
        EditText id=(EditText) findViewById(R.id.ID);
        final EditText password=(EditText) findViewById(R.id.password);
        //登录界面
        Button login =(Button) findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });
        //注册
        Button sign =(Button) findViewById(R.id.sign);
        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        //找回密码
        Button forget =(Button) findViewById(R.id.login_error);
        forget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        //看密码
        ImageButton check=(ImageButton) findViewById(R.id.check);
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            password.setInputType(InputType.TYPE_CLASS_TEXT);

            }
        });



    }
}
