#include <jni.h>

JNIEXPORT jint JNICALL
Java_com_coo_math_NativeMath_nativeAdd(JNIEnv *env, jclass type, jint a, jint b) {
    return a + b;
}