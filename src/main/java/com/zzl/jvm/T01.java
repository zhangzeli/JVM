package com.zzl.jvm;

/**
 * @ClassName T01
 -XX:-DoEscapeAnalysis
 -XX:-EliminateAllocations
 -XX:-UseTLAB
 -XX:+PrintGC
 * @Author zhangzeli
 * @Version 1.0
 * @Date 2019/4/29-14:40
 **/
public class T01 {
    class User{
        int id;
        String name;

        public User(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }

    void alloc(int i ){
        new User(i,"name"+i);
    }

    public static void main(String[] args) {
        T01 t = new T01();
        long s1 = System.currentTimeMillis();
        for (int i =0;i<10000000;i++) t.alloc(i);
        long s2 = System.currentTimeMillis();
        System.out.println(s2-s1);
    }
}
