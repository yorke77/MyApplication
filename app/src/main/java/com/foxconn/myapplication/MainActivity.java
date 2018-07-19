package com.foxconn.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.foxconn.myapplication.utilities.MyTextUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWelcomeString();

        //Ctrl+J 补全for模块代码
        for (int i  = 0; i < 10; i++) {
            //F9 跳到下一次断点
            Log.i("MainActivity", "Value:" + i);
        }

        //Ctrl+P 显示可用方法签名 //Ctrl+Shift+Enter 自动补全这行：添加分号到结尾
        Log.d("MainActivity", "A message");

    }

    private void getWelcomeString() {
        //Shift+F6重命名变量
        MyTextUtil myUtil = new MyTextUtil();

        //Alt+Enter 列出意图行为
        TextView tv = findViewById(R.id.myTextView);
        tv.setText(myUtil.getValue());

        //Ctrl+Shift+Space 自动赋值
        MyTextUtil util2 = myUtil;
    }
}
