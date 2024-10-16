package com.ricardo.rebecca.grpc.client;

import com.ricardo.grpc.api.UserProto;
import com.ricardo.grpc.api.UserServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.Arrays;
import java.util.Collections;

/**
 * @Class GrpcClient1
 * @Description TODO
 * @Author Cypress
 * @Date 2024/10/16 22:32
 */
public class GrpcClient2 {
    public static void main(String[] args) {
        //1.创建通信管道
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost", 8080).usePlaintext().build();
        try {
            //2.获得代理对象Stub
            UserServiceGrpc.UserServiceBlockingStub userService = UserServiceGrpc.newBlockingStub(managedChannel);
            //3.完成RPC调用
            //3.1准备参数
            UserProto.LoginRequest1.Builder builder = UserProto.LoginRequest1.newBuilder();
            builder.addAllUsernames(Arrays.asList("user1","user2","user3"));
            UserProto.LoginRequest1 loginRequest1 = builder.build();
            UserProto.LoginResponse1 loginResponse1 = userService.loginRequest(loginRequest1);
            String result = loginResponse1.getResult();
            System.out.println("响应消息：" + result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            managedChannel.shutdown();
        }
    }
}
