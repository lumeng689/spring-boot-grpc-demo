package org.luapp.grpc;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.luapp.grpc.server.HelloServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GrpcDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(GrpcDemoApplication.class, args);
        Server server = ServerBuilder.forPort(8082).addService(new HelloServiceImpl()).build();
    }

}
