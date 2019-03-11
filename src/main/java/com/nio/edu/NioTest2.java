package com.nio.edu;

import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NioTest2 {

    public static void main(String[] args) throws Exception {
        FileInputStream inputStream = new FileInputStream("NioTest2.txt");
        FileChannel fileChannel = inputStream.getChannel();

        ByteBuffer byteBuffer = ByteBuffer.allocate(512);
        fileChannel.read(byteBuffer); //把channel内容读到byteBuffer中

        //将byteBuffer中的数据写入程序中
        byteBuffer.flip();

        while(byteBuffer.hasRemaining()){
            byte b = byteBuffer.get();
            System.out.println("Character: " + (char)b);
        }

        inputStream.close();
    }

}
