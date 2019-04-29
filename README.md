# JVM
:smiley::stuck_out_tongue::stuck_out_tongue_closed_eyes:
## 常用参数

+ 堆设置:heart:
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


## 经典TomCat优化调优

如果服务器只有一个java虚拟机，并且内存是4G:bell:

set JAVA_OPTS=

  + -Xms4g  
  + -Xmx4g  
  + -Xss512k  
  + -AggressiveOpts  :表示开启所有能优化的优化  
  + -UseBiasedLocking :表示启用偏向锁[有助于提高"锁"性能的几点建议](https://my.oschina.net/u/3703858/blog/1791973 "有助于提高"锁"性能的几点建议")  
  + -XX:PermSize=64M :java8没有这个参数了  改为Metaspace  
  + -XX:MaxPermSize=300M  
  + -XX:+DisableExplicitGC :禁用显示调用GC //System.gc()  
    
##继续

   + -XX:+UseConcMarkSweepGC
        + 使用CMS缩短响应时间，并发手机，底停顿
   + -XX:+UseParNewGC
        + 并行收集新生代的垃圾
   + -XX:+CMSParallelRemarkEnabled
        + 在使用UseParNewGC的情况下，尽量减少mark的时间
   + -XX:+UseCMSCompactAtFullCollectionGC
        + 使用并发收集器时，开启对老年代的压缩，使碎片减少
   + -XX:LargePageSizeInBytes=128m
        + 内存分页大小对性能的提升
   + -XX:+UseFastAccessorMethonds
        + get/set方法转本地代码
   + -Djava.awt.headless=ture
        + 修复liunx下的tomcat处理图表时可能会产生的一个bug
