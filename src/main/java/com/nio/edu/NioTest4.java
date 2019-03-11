package com.nio.edu;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NioTest4 {

    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("input.txt");
        FileOutputStream outputStream = new FileOutputStream("output.txt");

        FileChannel inputChannel = inputStream.getChannel();
        FileChannel outputChannle = outputStream.getChannel();

        ByteBuffer buffer = ByteBuffer.allocate(4);
        while(true){
            buffer.clear(); //如果注释掉该行代码会发生什么情况？

            int read = inputChannel.read(buffer);
            System.out.println(inputChannel.size());
            System.out.println("read: " + read);

            if(-1 == read){
                break;
            }

            buffer.flip();

            outputChannle.write(buffer);
        }
        inputChannel.close();
        outputChannle.close();
    }
}
