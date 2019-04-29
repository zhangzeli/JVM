package com.zzl.jvm;

/**
 * @ClassName T05
 * @Description
 * 线程栈大小 -Xss128
 * 大 线程递归调用可以很深
 * 小 线程并发数量可以特别多
 * @Author zhangzeli
 * @Version 1.0
 * @Date 2019/4/29-16:02
 **/
public class T05 {

    static int count=0;

    static void r(){
        count++;
        r();
    }

    public static void main(String[] args) {
        try {
            r();
        }catch (Throwable r){
            System.out.println(count);
            r.printStackTrace(); //OOM  StackOverFlow
        }

    }

}
