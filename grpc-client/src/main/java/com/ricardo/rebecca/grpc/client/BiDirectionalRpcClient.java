package com.ricardo.rebecca.grpc.client;

import com.ricardo.grpc.api.UserProto;
import com.ricardo.grpc.api.UserServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

/**
 * @ClassName : BiDirectionalRpcClient
 * @Author : changyp
 * @Date : 2024/10/17 18:43
 * @Description :
 */
public class BiDirectionalRpcClient {
    public static void main(String[] args) {
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost", 8080).usePlaintext().build();
        try {
            UserServiceGrpc.UserServiceStub userService = UserServiceGrpc.newStub(managedChannel);


            StreamObserver<UserProto.LoginRequest> responseObserver = userService.cs2s2c(new StreamObserver<UserProto.LoginResponse>() {
                @Override
                public void onNext(UserProto.LoginResponse loginResponse) {
                    System.out.println("响应的结果:"+loginResponse);
                }

                @Override
                public void onError(Throwable throwable) {

                }

                @Override
                public void onCompleted() {
                    System.out.println("响应结束");
                }
            });
            for (int i = 0; i < 10; i++) {
                responseObserver.onNext(UserProto.LoginRequest.newBuilder().setRequest(UserProto.UserInfo.newBuilder().setUsername("Joker").setPassword("aaaaa").setAge(18+i).build()).build());

            }

        } catch (Exception e) {
           e.printStackTrace();
        }finally {
            managedChannel.shutdown();
        }
    }
}
