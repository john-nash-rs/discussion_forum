package com.skillcaptain.app.grpc.user.model;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.61.1)",
    comments = "Source: user.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class UserServiceGrpc {

  private UserServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "model.UserService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.skillcaptain.app.grpc.user.model.UserProto.CreateUserRequest,
      com.skillcaptain.app.grpc.user.model.UserProto.User> getCreateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateUser",
      requestType = com.skillcaptain.app.grpc.user.model.UserProto.CreateUserRequest.class,
      responseType = com.skillcaptain.app.grpc.user.model.UserProto.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.skillcaptain.app.grpc.user.model.UserProto.CreateUserRequest,
      com.skillcaptain.app.grpc.user.model.UserProto.User> getCreateUserMethod() {
    io.grpc.MethodDescriptor<com.skillcaptain.app.grpc.user.model.UserProto.CreateUserRequest, com.skillcaptain.app.grpc.user.model.UserProto.User> getCreateUserMethod;
    if ((getCreateUserMethod = UserServiceGrpc.getCreateUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getCreateUserMethod = UserServiceGrpc.getCreateUserMethod) == null) {
          UserServiceGrpc.getCreateUserMethod = getCreateUserMethod =
              io.grpc.MethodDescriptor.<com.skillcaptain.app.grpc.user.model.UserProto.CreateUserRequest, com.skillcaptain.app.grpc.user.model.UserProto.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.skillcaptain.app.grpc.user.model.UserProto.CreateUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.skillcaptain.app.grpc.user.model.UserProto.User.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("CreateUser"))
              .build();
        }
      }
    }
    return getCreateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Int64Value,
      com.skillcaptain.app.grpc.user.model.UserProto.User> getGetUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUser",
      requestType = com.google.protobuf.Int64Value.class,
      responseType = com.skillcaptain.app.grpc.user.model.UserProto.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Int64Value,
      com.skillcaptain.app.grpc.user.model.UserProto.User> getGetUserMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Int64Value, com.skillcaptain.app.grpc.user.model.UserProto.User> getGetUserMethod;
    if ((getGetUserMethod = UserServiceGrpc.getGetUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetUserMethod = UserServiceGrpc.getGetUserMethod) == null) {
          UserServiceGrpc.getGetUserMethod = getGetUserMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Int64Value, com.skillcaptain.app.grpc.user.model.UserProto.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Int64Value.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.skillcaptain.app.grpc.user.model.UserProto.User.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("GetUser"))
              .build();
        }
      }
    }
    return getGetUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.skillcaptain.app.grpc.user.model.UserProto.GetAllNotificationsRequest,
      com.skillcaptain.app.grpc.user.model.UserProto.Notifications> getGetAllNotificationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllNotifications",
      requestType = com.skillcaptain.app.grpc.user.model.UserProto.GetAllNotificationsRequest.class,
      responseType = com.skillcaptain.app.grpc.user.model.UserProto.Notifications.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.skillcaptain.app.grpc.user.model.UserProto.GetAllNotificationsRequest,
      com.skillcaptain.app.grpc.user.model.UserProto.Notifications> getGetAllNotificationsMethod() {
    io.grpc.MethodDescriptor<com.skillcaptain.app.grpc.user.model.UserProto.GetAllNotificationsRequest, com.skillcaptain.app.grpc.user.model.UserProto.Notifications> getGetAllNotificationsMethod;
    if ((getGetAllNotificationsMethod = UserServiceGrpc.getGetAllNotificationsMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetAllNotificationsMethod = UserServiceGrpc.getGetAllNotificationsMethod) == null) {
          UserServiceGrpc.getGetAllNotificationsMethod = getGetAllNotificationsMethod =
              io.grpc.MethodDescriptor.<com.skillcaptain.app.grpc.user.model.UserProto.GetAllNotificationsRequest, com.skillcaptain.app.grpc.user.model.UserProto.Notifications>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllNotifications"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.skillcaptain.app.grpc.user.model.UserProto.GetAllNotificationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.skillcaptain.app.grpc.user.model.UserProto.Notifications.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("GetAllNotifications"))
              .build();
        }
      }
    }
    return getGetAllNotificationsMethod;
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
    default void createUser(com.skillcaptain.app.grpc.user.model.UserProto.CreateUserRequest request,
        io.grpc.stub.StreamObserver<com.skillcaptain.app.grpc.user.model.UserProto.User> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateUserMethod(), responseObserver);
    }

    /**
     */
    default void getUser(com.google.protobuf.Int64Value request,
        io.grpc.stub.StreamObserver<com.skillcaptain.app.grpc.user.model.UserProto.User> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserMethod(), responseObserver);
    }

    /**
     */
    default void getAllNotifications(com.skillcaptain.app.grpc.user.model.UserProto.GetAllNotificationsRequest request,
        io.grpc.stub.StreamObserver<com.skillcaptain.app.grpc.user.model.UserProto.Notifications> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllNotificationsMethod(), responseObserver);
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
    public void createUser(com.skillcaptain.app.grpc.user.model.UserProto.CreateUserRequest request,
        io.grpc.stub.StreamObserver<com.skillcaptain.app.grpc.user.model.UserProto.User> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUser(com.google.protobuf.Int64Value request,
        io.grpc.stub.StreamObserver<com.skillcaptain.app.grpc.user.model.UserProto.User> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllNotifications(com.skillcaptain.app.grpc.user.model.UserProto.GetAllNotificationsRequest request,
        io.grpc.stub.StreamObserver<com.skillcaptain.app.grpc.user.model.UserProto.Notifications> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllNotificationsMethod(), getCallOptions()), request, responseObserver);
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
    public com.skillcaptain.app.grpc.user.model.UserProto.User createUser(com.skillcaptain.app.grpc.user.model.UserProto.CreateUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.skillcaptain.app.grpc.user.model.UserProto.User getUser(com.google.protobuf.Int64Value request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.skillcaptain.app.grpc.user.model.UserProto.Notifications getAllNotifications(com.skillcaptain.app.grpc.user.model.UserProto.GetAllNotificationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllNotificationsMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.skillcaptain.app.grpc.user.model.UserProto.User> createUser(
        com.skillcaptain.app.grpc.user.model.UserProto.CreateUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.skillcaptain.app.grpc.user.model.UserProto.User> getUser(
        com.google.protobuf.Int64Value request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.skillcaptain.app.grpc.user.model.UserProto.Notifications> getAllNotifications(
        com.skillcaptain.app.grpc.user.model.UserProto.GetAllNotificationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllNotificationsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_USER = 0;
  private static final int METHODID_GET_USER = 1;
  private static final int METHODID_GET_ALL_NOTIFICATIONS = 2;

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
        case METHODID_CREATE_USER:
          serviceImpl.createUser((com.skillcaptain.app.grpc.user.model.UserProto.CreateUserRequest) request,
              (io.grpc.stub.StreamObserver<com.skillcaptain.app.grpc.user.model.UserProto.User>) responseObserver);
          break;
        case METHODID_GET_USER:
          serviceImpl.getUser((com.google.protobuf.Int64Value) request,
              (io.grpc.stub.StreamObserver<com.skillcaptain.app.grpc.user.model.UserProto.User>) responseObserver);
          break;
        case METHODID_GET_ALL_NOTIFICATIONS:
          serviceImpl.getAllNotifications((com.skillcaptain.app.grpc.user.model.UserProto.GetAllNotificationsRequest) request,
              (io.grpc.stub.StreamObserver<com.skillcaptain.app.grpc.user.model.UserProto.Notifications>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getCreateUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.skillcaptain.app.grpc.user.model.UserProto.CreateUserRequest,
              com.skillcaptain.app.grpc.user.model.UserProto.User>(
                service, METHODID_CREATE_USER)))
        .addMethod(
          getGetUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Int64Value,
              com.skillcaptain.app.grpc.user.model.UserProto.User>(
                service, METHODID_GET_USER)))
        .addMethod(
          getGetAllNotificationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.skillcaptain.app.grpc.user.model.UserProto.GetAllNotificationsRequest,
              com.skillcaptain.app.grpc.user.model.UserProto.Notifications>(
                service, METHODID_GET_ALL_NOTIFICATIONS)))
        .build();
  }

  private static abstract class UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.skillcaptain.app.grpc.user.model.UserProto.getDescriptor();
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
              .addMethod(getCreateUserMethod())
              .addMethod(getGetUserMethod())
              .addMethod(getGetAllNotificationsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
