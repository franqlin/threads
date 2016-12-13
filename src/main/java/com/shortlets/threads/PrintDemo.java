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
public class PrintDemo {
    public void printCount(){
        try{
            for(int i =5; i>0;i++){
                System.out.println(" Selected number is: " +i);
            }
        }catch(Exception e){
            System.out.println("Thread has been interrupted. ");
        }
    }
    
}
