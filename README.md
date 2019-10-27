# ndk_study_openCV

NDK study :

openCV: 生成灰色效果的图片

依赖库下载：

https://opencv.org/releases/


相关的参考：

1. OpenCV专题1 - AndroidStudio的JNI工程及引用OpenCV

   https://juejin.im/post/5d46d1e8e51d45620541034c

异常处理

1.如果报build.ninja error

删除文件夹的内容：.gradle ,  app目录下的.cxx , build

然后重新clean project ,rebuild project

2.包名不能有下划线

3.git pull文件数量太大

error: RPC failed; curl 56 OpenSSL SSL_read: SSL_ERROR_SYSCALL, errfno 10054

git config http.postBuffer 524288000 

https://blog.csdn.net/java_student09/article/details/80376839

524288000：不能修改太大，最好这个值不要变
