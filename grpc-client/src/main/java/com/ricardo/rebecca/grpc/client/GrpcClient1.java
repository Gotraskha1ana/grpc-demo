package com.ricardo.rebecca.grpc.client;

import com.ricardo.grpc.api.UserProto;
import com.ricardo.grpc.api.UserServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

/**
 * @Class GrpcClient1
 * @Description TODO
 * @Author Cypress
 * @Date 2024/10/16 22:32
 */
public class GrpcClient1 {
    public static void main(String[] args) {
        //1.创建通信管道
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost", 8080).usePlaintext().build();
        try {
            //2.获得代理对象Stub
            UserServiceGrpc.UserServiceBlockingStub userService = UserServiceGrpc.newBlockingStub(managedChannel);
            //3.完成RPC调用
            //3.1准备参数
            UserProto.LoginRequest.Builder builder = UserProto.LoginRequest.newBuilder();
            UserProto.LoginRequest loginRequest = builder.setRequest(UserProto.UserInfo.newBuilder().setUsername("周可").setPassword("伟大，无需多言").setAge(18)).build();
            UserProto.LoginResponse loginResponse = userService.login(loginRequest);
            String message = loginResponse.getMessage();
            boolean success = loginResponse.getSuccess();
            System.out.println("登录是否成功：" + success + ",响应消息：" + message);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            managedChannel.shutdown();
        }
    }
}
