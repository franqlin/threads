/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shortlets.threads;

/**
 *
 * @author fssantos
 */
public class ThreadDemo implements Runnable{
    private Thread thread;
    private String threadName;
    PrintDemo printDemo;

    public ThreadDemo(String threadName, PrintDemo printDemo  ) {
        this.printDemo = printDemo;
        this.threadName = threadName;
    }
    
    @Override
    public void run() {
        synchronized(printDemo){
            printDemo.printCount();
        }
        System.out.println("Thread" +threadName+" finishing");
    }
    
    public void start(){
        System.err.println("Starting "+ threadName);
        if(thread == null){
            thread = new Thread(this,threadName);
        }
        thread.start();
    }
    
}
