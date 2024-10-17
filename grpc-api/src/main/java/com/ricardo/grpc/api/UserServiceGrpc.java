package com.ricardo.grpc.api;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.67.1)",
    comments = "Source: User.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class UserServiceGrpc {

  private UserServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "UserService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.ricardo.grpc.api.UserProto.LoginRequest,
      com.ricardo.grpc.api.UserProto.LoginResponse> getLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "login",
      requestType = com.ricardo.grpc.api.UserProto.LoginRequest.class,
      responseType = com.ricardo.grpc.api.UserProto.LoginResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ricardo.grpc.api.UserProto.LoginRequest,
      com.ricardo.grpc.api.UserProto.LoginResponse> getLoginMethod() {
    io.grpc.MethodDescriptor<com.ricardo.grpc.api.UserProto.LoginRequest, com.ricardo.grpc.api.UserProto.LoginResponse> getLoginMethod;
    if ((getLoginMethod = UserServiceGrpc.getLoginMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getLoginMethod = UserServiceGrpc.getLoginMethod) == null) {
          UserServiceGrpc.getLoginMethod = getLoginMethod =
              io.grpc.MethodDescriptor.<com.ricardo.grpc.api.UserProto.LoginRequest, com.ricardo.grpc.api.UserProto.LoginResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "login"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ricardo.grpc.api.UserProto.LoginRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ricardo.grpc.api.UserProto.LoginResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("login"))
              .build();
        }
      }
    }
    return getLoginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ricardo.grpc.api.UserProto.OneOfMessage.UserId,
      com.ricardo.grpc.api.UserProto.UserInfo> getGetUserInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getUserInfo",
      requestType = com.ricardo.grpc.api.UserProto.OneOfMessage.UserId.class,
      responseType = com.ricardo.grpc.api.UserProto.UserInfo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ricardo.grpc.api.UserProto.OneOfMessage.UserId,
      com.ricardo.grpc.api.UserProto.UserInfo> getGetUserInfoMethod() {
    io.grpc.MethodDescriptor<com.ricardo.grpc.api.UserProto.OneOfMessage.UserId, com.ricardo.grpc.api.UserProto.UserInfo> getGetUserInfoMethod;
    if ((getGetUserInfoMethod = UserServiceGrpc.getGetUserInfoMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetUserInfoMethod = UserServiceGrpc.getGetUserInfoMethod) == null) {
          UserServiceGrpc.getGetUserInfoMethod = getGetUserInfoMethod =
              io.grpc.MethodDescriptor.<com.ricardo.grpc.api.UserProto.OneOfMessage.UserId, com.ricardo.grpc.api.UserProto.UserInfo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getUserInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ricardo.grpc.api.UserProto.OneOfMessage.UserId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ricardo.grpc.api.UserProto.UserInfo.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("getUserInfo"))
              .build();
        }
      }
    }
    return getGetUserInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ricardo.grpc.api.UserProto.LoginRequest1,
      com.ricardo.grpc.api.UserProto.LoginResponse1> getLoginRequestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "loginRequest",
      requestType = com.ricardo.grpc.api.UserProto.LoginRequest1.class,
      responseType = com.ricardo.grpc.api.UserProto.LoginResponse1.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ricardo.grpc.api.UserProto.LoginRequest1,
      com.ricardo.grpc.api.UserProto.LoginResponse1> getLoginRequestMethod() {
    io.grpc.MethodDescriptor<com.ricardo.grpc.api.UserProto.LoginRequest1, com.ricardo.grpc.api.UserProto.LoginResponse1> getLoginRequestMethod;
    if ((getLoginRequestMethod = UserServiceGrpc.getLoginRequestMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getLoginRequestMethod = UserServiceGrpc.getLoginRequestMethod) == null) {
          UserServiceGrpc.getLoginRequestMethod = getLoginRequestMethod =
              io.grpc.MethodDescriptor.<com.ricardo.grpc.api.UserProto.LoginRequest1, com.ricardo.grpc.api.UserProto.LoginResponse1>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "loginRequest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ricardo.grpc.api.UserProto.LoginRequest1.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ricardo.grpc.api.UserProto.LoginResponse1.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("loginRequest"))
              .build();
        }
      }
    }
    return getLoginRequestMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ricardo.grpc.api.UserProto.LoginRequest,
      com.ricardo.grpc.api.UserProto.LoginResponse> getC2sMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "c2s",
      requestType = com.ricardo.grpc.api.UserProto.LoginRequest.class,
      responseType = com.ricardo.grpc.api.UserProto.LoginResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.ricardo.grpc.api.UserProto.LoginRequest,
      com.ricardo.grpc.api.UserProto.LoginResponse> getC2sMethod() {
    io.grpc.MethodDescriptor<com.ricardo.grpc.api.UserProto.LoginRequest, com.ricardo.grpc.api.UserProto.LoginResponse> getC2sMethod;
    if ((getC2sMethod = UserServiceGrpc.getC2sMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getC2sMethod = UserServiceGrpc.getC2sMethod) == null) {
          UserServiceGrpc.getC2sMethod = getC2sMethod =
              io.grpc.MethodDescriptor.<com.ricardo.grpc.api.UserProto.LoginRequest, com.ricardo.grpc.api.UserProto.LoginResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "c2s"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ricardo.grpc.api.UserProto.LoginRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ricardo.grpc.api.UserProto.LoginResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("c2s"))
              .build();
        }
      }
    }
    return getC2sMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ricardo.grpc.api.UserProto.LoginRequest,
      com.ricardo.grpc.api.UserProto.LoginResponse> getCs2sMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "cs2s",
      requestType = com.ricardo.grpc.api.UserProto.LoginRequest.class,
      responseType = com.ricardo.grpc.api.UserProto.LoginResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.ricardo.grpc.api.UserProto.LoginRequest,
      com.ricardo.grpc.api.UserProto.LoginResponse> getCs2sMethod() {
    io.grpc.MethodDescriptor<com.ricardo.grpc.api.UserProto.LoginRequest, com.ricardo.grpc.api.UserProto.LoginResponse> getCs2sMethod;
    if ((getCs2sMethod = UserServiceGrpc.getCs2sMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getCs2sMethod = UserServiceGrpc.getCs2sMethod) == null) {
          UserServiceGrpc.getCs2sMethod = getCs2sMethod =
              io.grpc.MethodDescriptor.<com.ricardo.grpc.api.UserProto.LoginRequest, com.ricardo.grpc.api.UserProto.LoginResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "cs2s"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ricardo.grpc.api.UserProto.LoginRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ricardo.grpc.api.UserProto.LoginResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("cs2s"))
              .build();
        }
      }
    }
    return getCs2sMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ricardo.grpc.api.UserProto.LoginRequest,
      com.ricardo.grpc.api.UserProto.LoginResponse> getCs2s2cMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "cs2s2c",
      requestType = com.ricardo.grpc.api.UserProto.LoginRequest.class,
      responseType = com.ricardo.grpc.api.UserProto.LoginResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.ricardo.grpc.api.UserProto.LoginRequest,
      com.ricardo.grpc.api.UserProto.LoginResponse> getCs2s2cMethod() {
    io.grpc.MethodDescriptor<com.ricardo.grpc.api.UserProto.LoginRequest, com.ricardo.grpc.api.UserProto.LoginResponse> getCs2s2cMethod;
    if ((getCs2s2cMethod = UserServiceGrpc.getCs2s2cMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getCs2s2cMethod = UserServiceGrpc.getCs2s2cMethod) == null) {
          UserServiceGrpc.getCs2s2cMethod = getCs2s2cMethod =
              io.grpc.MethodDescriptor.<com.ricardo.grpc.api.UserProto.LoginRequest, com.ricardo.grpc.api.UserProto.LoginResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "cs2s2c"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ricardo.grpc.api.UserProto.LoginRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ricardo.grpc.api.UserProto.LoginResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("cs2s2c"))
              .build();
        }
      }
    }
    return getCs2s2cMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceStub>() {
        @java.lang.Override
        public UserServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceStub(channel, callOptions);
        }
      };
    return UserServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceBlockingStub>() {
        @java.lang.Override
        public UserServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceBlockingStub(channel, callOptions);
        }
      };
    return UserServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceFutureStub>() {
        @java.lang.Override
        public UserServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceFutureStub(channel, callOptions);
        }
      };
    return UserServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void login(com.ricardo.grpc.api.UserProto.LoginRequest request,
        io.grpc.stub.StreamObserver<com.ricardo.grpc.api.UserProto.LoginResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLoginMethod(), responseObserver);
    }

    /**
     */
    default void getUserInfo(com.ricardo.grpc.api.UserProto.OneOfMessage.UserId request,
        io.grpc.stub.StreamObserver<com.ricardo.grpc.api.UserProto.UserInfo> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserInfoMethod(), responseObserver);
    }

    /**
     */
    default void loginRequest(com.ricardo.grpc.api.UserProto.LoginRequest1 request,
        io.grpc.stub.StreamObserver<com.ricardo.grpc.api.UserProto.LoginResponse1> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLoginRequestMethod(), responseObserver);
    }

    /**
     */
    default void c2s(com.ricardo.grpc.api.UserProto.LoginRequest request,
        io.grpc.stub.StreamObserver<com.ricardo.grpc.api.UserProto.LoginResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getC2sMethod(), responseObserver);
    }

    /**
     */
    default io.grpc.stub.StreamObserver<com.ricardo.grpc.api.UserProto.LoginRequest> cs2s(
        io.grpc.stub.StreamObserver<com.ricardo.grpc.api.UserProto.LoginResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getCs2sMethod(), responseObserver);
    }

    /**
     */
    default io.grpc.stub.StreamObserver<com.ricardo.grpc.api.UserProto.LoginRequest> cs2s2c(
        io.grpc.stub.StreamObserver<com.ricardo.grpc.api.UserProto.LoginResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getCs2s2cMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service UserService.
   */
  public static abstract class UserServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return UserServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service UserService.
   */
  public static final class UserServiceStub
      extends io.grpc.stub.AbstractAsyncStub<UserServiceStub> {
    private UserServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceStub(channel, callOptions);
    }

    /**
     */
    public void login(com.ricardo.grpc.api.UserProto.LoginRequest request,
        io.grpc.stub.StreamObserver<com.ricardo.grpc.api.UserProto.LoginResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUserInfo(com.ricardo.grpc.api.UserProto.OneOfMessage.UserId request,
        io.grpc.stub.StreamObserver<com.ricardo.grpc.api.UserProto.UserInfo> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void loginRequest(com.ricardo.grpc.api.UserProto.LoginRequest1 request,
        io.grpc.stub.StreamObserver<com.ricardo.grpc.api.UserProto.LoginResponse1> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLoginRequestMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void c2s(com.ricardo.grpc.api.UserProto.LoginRequest request,
        io.grpc.stub.StreamObserver<com.ricardo.grpc.api.UserProto.LoginResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getC2sMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.ricardo.grpc.api.UserProto.LoginRequest> cs2s(
        io.grpc.stub.StreamObserver<com.ricardo.grpc.api.UserProto.LoginResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getCs2sMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.ricardo.grpc.api.UserProto.LoginRequest> cs2s2c(
        io.grpc.stub.StreamObserver<com.ricardo.grpc.api.UserProto.LoginResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getCs2s2cMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service UserService.
   */
  public static final class UserServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<UserServiceBlockingStub> {
    private UserServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.ricardo.grpc.api.UserProto.LoginResponse login(com.ricardo.grpc.api.UserProto.LoginRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLoginMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ricardo.grpc.api.UserProto.UserInfo getUserInfo(com.ricardo.grpc.api.UserProto.OneOfMessage.UserId request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ricardo.grpc.api.UserProto.LoginResponse1 loginRequest(com.ricardo.grpc.api.UserProto.LoginRequest1 request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLoginRequestMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.ricardo.grpc.api.UserProto.LoginResponse> c2s(
        com.ricardo.grpc.api.UserProto.LoginRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getC2sMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service UserService.
   */
  public static final class UserServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<UserServiceFutureStub> {
    private UserServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ricardo.grpc.api.UserProto.LoginResponse> login(
        com.ricardo.grpc.api.UserProto.LoginRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ricardo.grpc.api.UserProto.UserInfo> getUserInfo(
        com.ricardo.grpc.api.UserProto.OneOfMessage.UserId request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ricardo.grpc.api.UserProto.LoginResponse1> loginRequest(
        com.ricardo.grpc.api.UserProto.LoginRequest1 request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLoginRequestMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LOGIN = 0;
  private static final int METHODID_GET_USER_INFO = 1;
  private static final int METHODID_LOGIN_REQUEST = 2;
  private static final int METHODID_C2S = 3;
  private static final int METHODID_CS2S = 4;
  private static final int METHODID_CS2S2C = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LOGIN:
          serviceImpl.login((com.ricardo.grpc.api.UserProto.LoginRequest) request,
              (io.grpc.stub.StreamObserver<com.ricardo.grpc.api.UserProto.LoginResponse>) responseObserver);
          break;
        case METHODID_GET_USER_INFO:
          serviceImpl.getUserInfo((com.ricardo.grpc.api.UserProto.OneOfMessage.UserId) request,
              (io.grpc.stub.StreamObserver<com.ricardo.grpc.api.UserProto.UserInfo>) responseObserver);
          break;
        case METHODID_LOGIN_REQUEST:
          serviceImpl.loginRequest((com.ricardo.grpc.api.UserProto.LoginRequest1) request,
              (io.grpc.stub.StreamObserver<com.ricardo.grpc.api.UserProto.LoginResponse1>) responseObserver);
          break;
        case METHODID_C2S:
          serviceImpl.c2s((com.ricardo.grpc.api.UserProto.LoginRequest) request,
              (io.grpc.stub.StreamObserver<com.ricardo.grpc.api.UserProto.LoginResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CS2S:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.cs2s(
              (io.grpc.stub.StreamObserver<com.ricardo.grpc.api.UserProto.LoginResponse>) responseObserver);
        case METHODID_CS2S2C:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.cs2s2c(
              (io.grpc.stub.StreamObserver<com.ricardo.grpc.api.UserProto.LoginResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getLoginMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ricardo.grpc.api.UserProto.LoginRequest,
              com.ricardo.grpc.api.UserProto.LoginResponse>(
                service, METHODID_LOGIN)))
        .addMethod(
          getGetUserInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ricardo.grpc.api.UserProto.OneOfMessage.UserId,
              com.ricardo.grpc.api.UserProto.UserInfo>(
                service, METHODID_GET_USER_INFO)))
        .addMethod(
          getLoginRequestMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ricardo.grpc.api.UserProto.LoginRequest1,
              com.ricardo.grpc.api.UserProto.LoginResponse1>(
                service, METHODID_LOGIN_REQUEST)))
        .addMethod(
          getC2sMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.ricardo.grpc.api.UserProto.LoginRequest,
              com.ricardo.grpc.api.UserProto.LoginResponse>(
                service, METHODID_C2S)))
        .addMethod(
          getCs2sMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              com.ricardo.grpc.api.UserProto.LoginRequest,
              com.ricardo.grpc.api.UserProto.LoginResponse>(
                service, METHODID_CS2S)))
        .addMethod(
          getCs2s2cMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              com.ricardo.grpc.api.UserProto.LoginRequest,
              com.ricardo.grpc.api.UserProto.LoginResponse>(
                service, METHODID_CS2S2C)))
        .build();
  }

  private static abstract class UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.ricardo.grpc.api.UserProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserService");
    }
  }

  private static final class UserServiceFileDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier {
    UserServiceFileDescriptorSupplier() {}
  }

  private static final class UserServiceMethodDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    UserServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (UserServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserServiceFileDescriptorSupplier())
              .addMethod(getLoginMethod())
              .addMethod(getGetUserInfoMethod())
              .addMethod(getLoginRequestMethod())
              .addMethod(getC2sMethod())
              .addMethod(getCs2sMethod())
              .addMethod(getCs2s2cMethod())
              .build();
        }
      }
    }
    return result;
  }
}
