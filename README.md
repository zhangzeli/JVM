# JVM

## 常用参数

+ 堆设置
    + -Xms:初始堆大小
    + -Xmx:最大堆大小
    + -Xss:线程栈大小
    + -XX:NewSize=n :设置年轻代大小
    + -XX:NewRatio=n :设置年轻代和老年代的比值,如:3,  表示年轻代:老年代比值为1:3,年轻代占整个年轻代老年代的1/4
    + -XX:SurvivorRation=n:年轻代中Eden区与两个Survivor区的比值。注意Survivor区有两个。如3,  表示Eden:Survivor=3:2,一个Survivor占整个年轻代的1/5
    + -XX:MaxPermSize=n :设置持久代的大小
    
+ 收集器设置
    + -XX:+UseSerialGC :设置串行收集器
    + -XX:+UseParallelGC :设置并行收集器
    + -XX:+UseConcMarkSweepGC :设置并发收集器

+ 垃圾回收统计信息
    + -XX:+PrintGC
    + -XX:+PrintGCDetails
    + -Xloggc:filename
