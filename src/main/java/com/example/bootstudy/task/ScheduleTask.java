package com.example.bootstudy.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 把普通pojo实例化到spring容器中，相当于配置文件中的<bean id="" class=""/>
 *
 * 前2个方法实现的是每隔5秒运行一次。
 * demo3方法实现的是在固定每天的某个时间点运行一次
 */
@Component
public class ScheduleTask {

    /**
     * 以一个固定延迟时间5秒钟调用一次执行
     * 这个周期是以上一个调用任务的##完成时间##为基准，在上一个任务完成之后，5s后再次执行
     */
    @Scheduled(fixedDelay = 5000)//@Scheduled 可以作为一个触发源添加到一个方法中
    public void demo1() {
        long begin = System.currentTimeMillis();
        System.out.println("==================================定时任务demo1开始："+ new Date());
        //执行你需要操作的定时任务
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("定时任务demo1结束，共耗时：[" + (end - begin) + "]毫秒："+new Date());
    }

    /**
     * 以一个固定延迟时间5秒钟调用一次执行
     * 这个周期是以上一个任务##开始时间##为基准，从上一任务开始执行后5s再次调用：
     */
    @Scheduled(fixedRate = 5000)
    public void demo2() {
        long begin = System.currentTimeMillis();
        System.out.println("==================================定时任务demo2开始："+new Date());
        //执行你需要操作的定时任务
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("定时任务demo2结束，共耗时：[" + (end - begin) + "]毫秒："+new Date());
    }

    /**
     * 如果你需要在特定的时间执行，就需要用到cron 了
     * 这里是在每天的13点30分执行一次
     */
    @Scheduled(cron = "0 34 13 * * ?")
    public void demo3() {
        long begin = System.currentTimeMillis();
        System.out.println("==================================定时任务demo3开始："+new Date());
        //执行你需要操作的定时任务
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("定时任务demo3结束，共耗时：[" + (end - begin) + "]毫秒："+new Date());
    }

}
