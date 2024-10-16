package com.ricardo.rebecca.grpc.server;

import com.ricardo.rebecca.grpc.server.service.UserServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

/**
 * @Class GrpcServer1
 * @Description TODO
 * @Author Cypress
 * @Date 2024/10/16 22:22
 */
public class GrpcServer1 {
    public static void main(String[] args) throws InterruptedException, IOException {
        //1.配置服务端口
        ServerBuilder<?> serverBuilder = ServerBuilder.forPort(8080);
        //2.发布服务
        serverBuilder.addService(new UserServiceImpl());
        //serverBuilder.addService(new OrderServiceImpl());
        //3.创建服务对象
        Server server = serverBuilder.build();
        server.start();
        System.out.println("服务已启动");
        server.awaitTermination();
        System.out.println("服务结束");
    }
}
