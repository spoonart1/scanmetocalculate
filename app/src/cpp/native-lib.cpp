//
// Created by myspo on 2/25/2023.
//
#include <jni.h>
#include <jni.h>

extern "C"
JNIEXPORT jstring

JNICALL
Java_com_spoonart_scanmecalculator_protector_Configuration_secretKey(JNIEnv *env, jobject thiz) {
    return env->NewStringUTF("tK5UTui+DPh8lIlBxya5XVsmeDCoUl6vHhdIESMB6sQ=");
}

extern "C"
JNIEXPORT jstring

JNICALL
Java_com_spoonart_scanmecalculator_protector_Configuration_salt(JNIEnv *env, jobject thiz) {
    return env->NewStringUTF("QWlGNHNhMTJTQWZ2bGhpV3U=");
}

extern "C"
JNIEXPORT jstring

JNICALL
Java_com_spoonart_scanmecalculator_protector_Configuration_iv(JNIEnv *env, jobject thiz) {
    return env->NewStringUTF("bVQzNFNhRkQ1Njc4UUFaWA==");
}
