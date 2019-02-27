package com.com.grpc;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import javax.sound.midi.SoundbankResource;
import java.io.IOException;

public class GrpcServer {

    private Server server;

    private void start() throws IOException {
        this.server = ServerBuilder.forPort(8899)
                        .addService(new StudentServiceImpl()).build().start();

        System.out.println("server started");

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("关闭JVM");
            GrpcServer.this.stop();
            System.out.println("server shut down");
        }));

    }

    private void stop(){
        if(null != this.server){
            this.server.shutdown();
        }
    }

    // 阻塞
    private void awaitTermination() throws InterruptedException {
        if(null != this.server){
            this.server.awaitTermination();
    }
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        GrpcServer server = new GrpcServer();

        server.start();
        server.awaitTermination();
    }

}
