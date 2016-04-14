//
// Created by Henry on 16/4/14.
//

#include "com_hy_testjni_MyJni.h"

JNIEXPORT jstring JNICALL Java_com_hy_testjni_MyJni_sayHello(JNIEnv *env, jclass jcls){

     return (*env) ->NewStringUTF(env,"Hello jni NDK WITH Android Studio !");;

}

