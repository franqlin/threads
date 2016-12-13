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
public class Example {
    public static void main(String[] args) {
        PrintDemo printDemo = new PrintDemo();
        ThreadDemo firstThread = new ThreadDemo("Thread 1",printDemo);
        ThreadDemo secondThread = new ThreadDemo("Thread 2",printDemo);
        
       try{ 
        firstThread.start();
        secondThread.start();
       }catch(Exception e){
           System.err.println("Interruped ..");
       }
    }
    
}
