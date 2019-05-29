package org.luapp.grpc;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.luapp.grpc.server.HelloServiceImpl;

import java.io.IOException;

public class GrpcServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(8082).addService(new HelloServiceImpl()).build();
        System.out.println("Starting server...");
        server.start();
        System.out.println("Server started!");
        server.awaitTermination();
    }
}
