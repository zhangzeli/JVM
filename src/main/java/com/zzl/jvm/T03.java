package com.zzl.jvm;

/**
 * @ClassName T03
 * @Description 可以用Runtime类大致计算内存情况
 * @Author ZHANGZELI
 * @Version 1.0
 * @Date 2019/4/29-15:41
 **/
public class T03 {

    public static void main(String[] args) {

        printMemoryInfo();

        byte [] b = new byte[1024*1024];

        System.out.println("--------");

        printMemoryInfo();

    }

    private static void printMemoryInfo() {
        System.out.println("total:"+Runtime.getRuntime().totalMemory());
        System.out.println("free:"+Runtime.getRuntime().freeMemory());
    }

}
