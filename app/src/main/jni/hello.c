//引入上面生成的头文件，并实现头文件中声明的方法
#include <cn_cun_jnihello_MainActivity.h>
JNIEXPORT jstring JNICALL Java_cn_cun_jnihello_MainActivity_getStringFromNative(JNIEnv *env, jobject obj){
    char *str = "String from native C";
    return (*env)->NewStringUTF(env, str);
}

