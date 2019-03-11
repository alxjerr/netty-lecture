package com.nio.edu;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NioTest3 {

    public static void main(String[] args) throws IOException {
        FileOutputStream outputStream = new FileOutputStream("NioTest3.txt");
        FileChannel channel = outputStream.getChannel();

        ByteBuffer buffer = ByteBuffer.allocate(512);

        byte[] message = "Hello World Welcom!".getBytes();

        for(int i = 0;i < message.length;++i){
            buffer.put(message[i]);
        }

        buffer.flip();

        channel.write(buffer);
        outputStream.close();
    }

}
