package com.ricardo.rebecca.grpc.client;

import com.ricardo.grpc.api.UserProto;
import com.ricardo.grpc.api.UserServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.Iterator;

/**
 * @ClassName : StreamGrpcClient
 * @Author : changyp
 * @Date : 2024/10/17 12:25
 * @Description :
 */
public class StreamGrpcClient {
    public static void main(String[] args) {
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost", 8080).usePlaintext().build();
        try {
            UserServiceGrpc.UserServiceBlockingStub userService = UserServiceGrpc.newBlockingStub(managedChannel);
            UserProto.LoginRequest loginRequest = UserProto.LoginRequest.newBuilder().setRequest(UserProto.UserInfo.newBuilder().setUsername("Joker").setPassword("aaaaa").setAge(18).build()).build();
            Iterator<UserProto.LoginResponse> loginResponseIterator = userService.c2s(loginRequest);
            while (loginResponseIterator.hasNext()){
                UserProto.LoginResponse loginResponse = loginResponseIterator.next();
                System.out.println(loginResponse);
            }
        }catch (Exception e){
            throw new RuntimeException(e);
        }finally {
            managedChannel.shutdown();
        }
    }
}
