package com.zzl.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName T04
 * 内存溢出
 * -XX:HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=tmp/jvm.dump -XX:PrintGCDetails
 * -Xms10M -Xmx10M
 *
 * @Author BossZ
 * @Version 1.0
 * @Date 2019/4/29-15:45
 **/
public class T04 {

    public static void main(String[] args) {
        List<Object> lists =new ArrayList<>();

        for(int i=0;i<100000000;i++) lists.add(new byte[1024*1024]);

    }
}
