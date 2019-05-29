package org.luapp.grpc.server;

import io.grpc.stub.StreamObserver;
import org.luapp.grpc.proto.HelloRequest;
import org.luapp.grpc.proto.HelloResponse;
import org.luapp.grpc.proto.HelloServiceGrpc;

public class HelloServiceImpl extends HelloServiceGrpc.HelloServiceImplBase {

    @Override
    public void hello1(HelloRequest request, StreamObserver<HelloResponse> responseObserver) {
        HelloResponse response = HelloResponse.newBuilder()
                .setGreeting("你好")
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void hello2(HelloRequest request, StreamObserver<HelloResponse> responseObserver) {
        super.hello2(request, responseObserver);
    }

    @Override
    public StreamObserver<HelloRequest> hello3(StreamObserver<HelloResponse> responseObserver) {
        return super.hello3(responseObserver);
    }

    @Override
    public StreamObserver<HelloRequest> hello4(StreamObserver<HelloResponse> responseObserver) {
        return super.hello4(responseObserver);
    }
}
