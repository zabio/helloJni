package com.hy.testjni;

/**
 * Created by henry  16/4/14.
 */
public class MyJni {
    static {
        //加载库文件
        System.loadLibrary("hello");
    }

    private static MyJni myJni;

    private MyJni() {
    }

    public static MyJni getInstance() {
        if (myJni == null) {
            myJni = new MyJni();
        }
        return myJni;
    }

    //native方法约定
    public  native String sayHello();
}
