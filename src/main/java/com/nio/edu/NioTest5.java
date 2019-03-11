package com.nio.edu;

import java.nio.ByteBuffer;

/**
 * ByteBuffer类型化的get与put
 */
public class NioTest5 {

    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(64);

        buffer.putInt(15);
        buffer.putLong(5000000000L);
        buffer.putDouble(14.12354);
        buffer.putChar('中');
        buffer.putShort((short) 2);
        buffer.putChar('文');

        buffer.flip();

        System.out.println(buffer.getInt());
        System.out.println(buffer.getLong());
        System.out.println(buffer.getDouble());
        System.out.println(buffer.getChar());
        System.out.println(buffer.getShort());
        System.out.println(buffer.getChar());
    }

}
