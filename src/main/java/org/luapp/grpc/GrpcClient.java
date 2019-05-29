package org.luapp.grpc;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.luapp.grpc.proto.HelloRequest;
import org.luapp.grpc.proto.HelloResponse;
import org.luapp.grpc.proto.HelloServiceGrpc;

public class GrpcClient {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("127.0.0.1", 8082).usePlaintext().build();

        HelloServiceGrpc.HelloServiceBlockingStub stub =HelloServiceGrpc.newBlockingStub(channel);

        HelloResponse helloResponse = stub.hello1(HelloRequest.newBuilder().setFirstName("San").setLastName("san").build());
        System.out.println("Response received from server:\n" + helloResponse.getGreeting());

        channel.shutdown();
    }
}
