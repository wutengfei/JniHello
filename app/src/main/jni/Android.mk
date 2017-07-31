LOCAL_PATH :=$(call my-dir)
include $(CLEAR_VARS)
#要生成的so文件名
LOCAL_MODULE :=hello
#要编译的c文件
LOCAL_SRC_FILES :=hello.c
include $(BUILD_SHARED_LIBRARY)
