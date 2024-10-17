package com.ricardo.rebecca.grpc.client;

import com.ricardo.grpc.api.UserProto;
import com.ricardo.grpc.api.UserServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.ClientResponseObserver;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @ClassName : StreamListenGrpcClient
 * @Author : changyp
 * @Date : 2024/10/17 12:39
 * @Description :
 */
public class StreamListenGrpcClient {

    public static void main(String[] args) {
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost", 8080).usePlaintext().build();
        try {
            UserServiceGrpc.UserServiceStub userService = UserServiceGrpc.newStub(managedChannel);
            UserProto.LoginRequest loginRequest = UserProto.LoginRequest.newBuilder().setRequest(UserProto.UserInfo.newBuilder().setUsername("Joker").setPassword("aaaaa").setAge(18).build()).build();
            StreamObserver<UserProto.LoginResponse> streamObserver = getLoginResponseStreamObserver();

                userService.c2s(loginRequest, streamObserver);
            managedChannel.awaitTermination(11000, java.util.concurrent.TimeUnit.MILLISECONDS);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            managedChannel.shutdown();
        }
    }

    private static StreamObserver<UserProto.LoginResponse> getLoginResponseStreamObserver() {
        List<String> responseList = new ArrayList<>();
        return new StreamObserver<>() {
            @Override
            public void onNext(UserProto.LoginResponse loginResponse) {
                String message = loginResponse.getMessage();
                System.out.println(message);
                responseList.add(message);
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println("似乎是出错了");
            }

            @Override
            public void onCompleted() {
                System.out.println("直播间已关闭，本次直播观看人数：" + responseList.size());
            }
        };
    }

}
