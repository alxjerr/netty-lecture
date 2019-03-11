package com.nio.edu;

import java.nio.ByteBuffer;

/**
 * 只读Buffer
 *
 *
 *
 */
public class NioTest7 {

    public static void main(String[] args) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(10);

        for(int i = 0;i < byteBuffer.capacity();++i){
            byteBuffer.put((byte) i);
        }

        ByteBuffer readOnlyBuffer = byteBuffer.asReadOnlyBuffer(); //只读Buffer

        System.out.println(readOnlyBuffer.getClass());
    }

}
