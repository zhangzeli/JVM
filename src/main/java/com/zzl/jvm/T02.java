package com.zzl.jvm;

/**
 * @ClassName T02
-XX:-DoEscapeAnalysis
-XX:-EliminateAllocations
-XX:-UseTLAB
-XX:+PrintGCDetails

线程的本地缓存也是使用的eden区的
 * @Author BossZ
 * @Version 1.0
 * @Date 2019/4/29-14:49
 **/
public class T02 {
    public static void main(String[] args) {
        byte [] b = new byte[1024];
    }
}
