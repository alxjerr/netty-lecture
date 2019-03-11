package com.nio.edu;

import java.nio.IntBuffer;
import java.security.SecureRandom;

public class NioTest1 {

    public static void main(String[] args) {
        IntBuffer buffer = IntBuffer.allocate(10);

        for(int i = 0;i < 5; ++i){
            int randomNumber = new SecureRandom().nextInt(20);
            buffer.put(randomNumber);
        }
        System.out.println("before flip position: " + buffer.position());

        System.out.println("before flip limit: " + buffer.limit());

        buffer.flip(); //实现状态的反转，读写的切换

        System.out.println("after flip limit: " + buffer.limit());
        System.out.println("enter while loop");

        while (buffer.hasRemaining()){
            System.out.println("position: " + buffer.position());
            System.out.println("limit: " + buffer.limit());
            System.out.println("capacity: " + buffer.capacity());

            System.out.println(buffer.get());
        }
        System.out.println("after while position: " + buffer.position());
        System.out.println("after while limit: " + buffer.limit());
    }

}
