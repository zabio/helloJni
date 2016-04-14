package com.hy.testjni;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //假如在activity中使用
    private MyJni myJni = MyJni.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, myJni.sayHello(), Toast.LENGTH_SHORT).show();
    }
}
