package com.ricardo.rebecca.grpc.server.service;

import com.google.protobuf.ProtocolStringList;
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
        UserProto.LoginResponse response = UserProto.LoginResponse.newBuilder().setMessage("登录成功").setSuccess(true).build();
        //4.返回响应
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void c2s(UserProto.LoginRequest request, StreamObserver<UserProto.LoginResponse> responseObserver) {
        UserProto.UserInfo userInfo = request.getRequest();
        String username = userInfo.getUsername();
        String x = "新用户加入了直播间，用户名：" + username;
        System.out.println(x);
        for (int i = 0; i < 10; i++ ){
            UserProto.LoginResponse loginResponse = UserProto.LoginResponse.newBuilder().setMessage(x).setSuccess(true).build();
            responseObserver.onNext(loginResponse);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
        responseObserver.onCompleted();
    }

    @Override
    public void loginRequest(UserProto.LoginRequest1 request, StreamObserver<UserProto.LoginResponse1> responseObserver) {
        ProtocolStringList usernamesList = request.getUsernamesList();
        for (String username : usernamesList){
            System.out.println("username"+username);
        }
        System.out.println("刚搞的服务，热乎的");

        UserProto.LoginResponse1.Builder builder = UserProto.LoginResponse1.newBuilder();
        builder.setResult("批量登录接口调用成功，登录人数"+usernamesList.size());
        UserProto.LoginResponse1 loginResponse1 = builder.build();
        responseObserver.onNext(loginResponse1);
        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<UserProto.LoginRequest> cs2s(StreamObserver<UserProto.LoginResponse> responseObserver) {
        //todo
        return super.cs2s(responseObserver);
    }
    /*
        双向流式Rpc服务端开发
     */
    @Override
    public StreamObserver<UserProto.LoginRequest> cs2s2c(StreamObserver<UserProto.LoginResponse> responseObserver) {
        return new StreamObserver<UserProto.LoginRequest>() {
            @Override
            public void onNext(UserProto.LoginRequest loginRequest) {
                System.out.println("接收到Client提交的消息:"+loginRequest.getRequest().getUsername());
                responseObserver.onNext(UserProto.LoginResponse.newBuilder().setMessage("服务端响应").setSuccess(true).build());
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {
                responseObserver.onNext(UserProto.LoginResponse.newBuilder().setMessage("监测到客户端结束请求，请求结束").setSuccess(true).build());
                responseObserver.onCompleted();
            }
        };

    }
}










