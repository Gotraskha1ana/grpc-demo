package com.ricardo.rebecca.grpc.server.service;

import com.ricardo.grpc.api.UserProto;
import com.ricardo.grpc.api.UserServiceGrpc;
import io.grpc.stub.StreamObserver;

/**
 * @Class UserServiceImpl
 * @Description TODO
 * @Author Cypress
 * @Date 2024/10/16 22:13
 */
public class UserServiceImpl extends UserServiceGrpc.UserServiceImplBase{
    @Override
    public void login(UserProto.LoginRequest request, StreamObserver<UserProto.LoginResponse> responseObserver) {
        //1.获取请求参数
        String username = request.getRequest().getUsername();
        //2。处理业务逻辑
        System.out.println("当前登录用户名："+username);
        //3.封装响应
        //3.1 创建响应对象的构造器
        UserProto.LoginResponse.Builder builder = UserProto.LoginResponse.newBuilder();
        //3.2 填充数据
        builder.setMessage("登录成功").setSuccess(true).build();
        //3.3 封装响应
        UserProto.LoginResponse response = builder.build();
        //4.返回响应
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
