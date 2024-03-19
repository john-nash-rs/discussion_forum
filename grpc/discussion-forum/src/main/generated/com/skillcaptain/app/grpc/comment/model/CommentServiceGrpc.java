package com.skillcaptain.app.grpc.comment.model;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.61.1)",
    comments = "Source: comment.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CommentServiceGrpc {

  private CommentServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "model.CommentService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.skillcaptain.app.grpc.comment.model.CommentProto.CreateCommentRequest,
      com.skillcaptain.app.grpc.comment.model.CommentProto.Comment> getCreateCommentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateComment",
      requestType = com.skillcaptain.app.grpc.comment.model.CommentProto.CreateCommentRequest.class,
      responseType = com.skillcaptain.app.grpc.comment.model.CommentProto.Comment.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.skillcaptain.app.grpc.comment.model.CommentProto.CreateCommentRequest,
      com.skillcaptain.app.grpc.comment.model.CommentProto.Comment> getCreateCommentMethod() {
    io.grpc.MethodDescriptor<com.skillcaptain.app.grpc.comment.model.CommentProto.CreateCommentRequest, com.skillcaptain.app.grpc.comment.model.CommentProto.Comment> getCreateCommentMethod;
    if ((getCreateCommentMethod = CommentServiceGrpc.getCreateCommentMethod) == null) {
      synchronized (CommentServiceGrpc.class) {
        if ((getCreateCommentMethod = CommentServiceGrpc.getCreateCommentMethod) == null) {
          CommentServiceGrpc.getCreateCommentMethod = getCreateCommentMethod =
              io.grpc.MethodDescriptor.<com.skillcaptain.app.grpc.comment.model.CommentProto.CreateCommentRequest, com.skillcaptain.app.grpc.comment.model.CommentProto.Comment>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateComment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.skillcaptain.app.grpc.comment.model.CommentProto.CreateCommentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.skillcaptain.app.grpc.comment.model.CommentProto.Comment.getDefaultInstance()))
              .setSchemaDescriptor(new CommentServiceMethodDescriptorSupplier("CreateComment"))
              .build();
        }
      }
    }
    return getCreateCommentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.skillcaptain.app.grpc.comment.model.CommentProto.GetCommentRequest,
      com.skillcaptain.app.grpc.comment.model.CommentProto.Comment> getGetCommentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetComment",
      requestType = com.skillcaptain.app.grpc.comment.model.CommentProto.GetCommentRequest.class,
      responseType = com.skillcaptain.app.grpc.comment.model.CommentProto.Comment.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.skillcaptain.app.grpc.comment.model.CommentProto.GetCommentRequest,
      com.skillcaptain.app.grpc.comment.model.CommentProto.Comment> getGetCommentMethod() {
    io.grpc.MethodDescriptor<com.skillcaptain.app.grpc.comment.model.CommentProto.GetCommentRequest, com.skillcaptain.app.grpc.comment.model.CommentProto.Comment> getGetCommentMethod;
    if ((getGetCommentMethod = CommentServiceGrpc.getGetCommentMethod) == null) {
      synchronized (CommentServiceGrpc.class) {
        if ((getGetCommentMethod = CommentServiceGrpc.getGetCommentMethod) == null) {
          CommentServiceGrpc.getGetCommentMethod = getGetCommentMethod =
              io.grpc.MethodDescriptor.<com.skillcaptain.app.grpc.comment.model.CommentProto.GetCommentRequest, com.skillcaptain.app.grpc.comment.model.CommentProto.Comment>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetComment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.skillcaptain.app.grpc.comment.model.CommentProto.GetCommentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.skillcaptain.app.grpc.comment.model.CommentProto.Comment.getDefaultInstance()))
              .setSchemaDescriptor(new CommentServiceMethodDescriptorSupplier("GetComment"))
              .build();
        }
      }
    }
    return getGetCommentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.skillcaptain.app.grpc.comment.model.CommentProto.GetAllCommentRequest,
      com.skillcaptain.app.grpc.comment.model.CommentProto.Comments> getGetAllCommentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllComment",
      requestType = com.skillcaptain.app.grpc.comment.model.CommentProto.GetAllCommentRequest.class,
      responseType = com.skillcaptain.app.grpc.comment.model.CommentProto.Comments.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.skillcaptain.app.grpc.comment.model.CommentProto.GetAllCommentRequest,
      com.skillcaptain.app.grpc.comment.model.CommentProto.Comments> getGetAllCommentMethod() {
    io.grpc.MethodDescriptor<com.skillcaptain.app.grpc.comment.model.CommentProto.GetAllCommentRequest, com.skillcaptain.app.grpc.comment.model.CommentProto.Comments> getGetAllCommentMethod;
    if ((getGetAllCommentMethod = CommentServiceGrpc.getGetAllCommentMethod) == null) {
      synchronized (CommentServiceGrpc.class) {
        if ((getGetAllCommentMethod = CommentServiceGrpc.getGetAllCommentMethod) == null) {
          CommentServiceGrpc.getGetAllCommentMethod = getGetAllCommentMethod =
              io.grpc.MethodDescriptor.<com.skillcaptain.app.grpc.comment.model.CommentProto.GetAllCommentRequest, com.skillcaptain.app.grpc.comment.model.CommentProto.Comments>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllComment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.skillcaptain.app.grpc.comment.model.CommentProto.GetAllCommentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.skillcaptain.app.grpc.comment.model.CommentProto.Comments.getDefaultInstance()))
              .setSchemaDescriptor(new CommentServiceMethodDescriptorSupplier("GetAllComment"))
              .build();
        }
      }
    }
    return getGetAllCommentMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CommentServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CommentServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CommentServiceStub>() {
        @java.lang.Override
        public CommentServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CommentServiceStub(channel, callOptions);
        }
      };
    return CommentServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CommentServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CommentServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CommentServiceBlockingStub>() {
        @java.lang.Override
        public CommentServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CommentServiceBlockingStub(channel, callOptions);
        }
      };
    return CommentServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CommentServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CommentServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CommentServiceFutureStub>() {
        @java.lang.Override
        public CommentServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CommentServiceFutureStub(channel, callOptions);
        }
      };
    return CommentServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void createComment(com.skillcaptain.app.grpc.comment.model.CommentProto.CreateCommentRequest request,
        io.grpc.stub.StreamObserver<com.skillcaptain.app.grpc.comment.model.CommentProto.Comment> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateCommentMethod(), responseObserver);
    }

    /**
     */
    default void getComment(com.skillcaptain.app.grpc.comment.model.CommentProto.GetCommentRequest request,
        io.grpc.stub.StreamObserver<com.skillcaptain.app.grpc.comment.model.CommentProto.Comment> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCommentMethod(), responseObserver);
    }

    /**
     */
    default void getAllComment(com.skillcaptain.app.grpc.comment.model.CommentProto.GetAllCommentRequest request,
        io.grpc.stub.StreamObserver<com.skillcaptain.app.grpc.comment.model.CommentProto.Comments> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllCommentMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CommentService.
   */
  public static abstract class CommentServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CommentServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CommentService.
   */
  public static final class CommentServiceStub
      extends io.grpc.stub.AbstractAsyncStub<CommentServiceStub> {
    private CommentServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CommentServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CommentServiceStub(channel, callOptions);
    }

    /**
     */
    public void createComment(com.skillcaptain.app.grpc.comment.model.CommentProto.CreateCommentRequest request,
        io.grpc.stub.StreamObserver<com.skillcaptain.app.grpc.comment.model.CommentProto.Comment> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateCommentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getComment(com.skillcaptain.app.grpc.comment.model.CommentProto.GetCommentRequest request,
        io.grpc.stub.StreamObserver<com.skillcaptain.app.grpc.comment.model.CommentProto.Comment> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCommentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllComment(com.skillcaptain.app.grpc.comment.model.CommentProto.GetAllCommentRequest request,
        io.grpc.stub.StreamObserver<com.skillcaptain.app.grpc.comment.model.CommentProto.Comments> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllCommentMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CommentService.
   */
  public static final class CommentServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CommentServiceBlockingStub> {
    private CommentServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CommentServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CommentServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.skillcaptain.app.grpc.comment.model.CommentProto.Comment createComment(com.skillcaptain.app.grpc.comment.model.CommentProto.CreateCommentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateCommentMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.skillcaptain.app.grpc.comment.model.CommentProto.Comment getComment(com.skillcaptain.app.grpc.comment.model.CommentProto.GetCommentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCommentMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.skillcaptain.app.grpc.comment.model.CommentProto.Comments getAllComment(com.skillcaptain.app.grpc.comment.model.CommentProto.GetAllCommentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllCommentMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CommentService.
   */
  public static final class CommentServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<CommentServiceFutureStub> {
    private CommentServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CommentServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CommentServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.skillcaptain.app.grpc.comment.model.CommentProto.Comment> createComment(
        com.skillcaptain.app.grpc.comment.model.CommentProto.CreateCommentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateCommentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.skillcaptain.app.grpc.comment.model.CommentProto.Comment> getComment(
        com.skillcaptain.app.grpc.comment.model.CommentProto.GetCommentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCommentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.skillcaptain.app.grpc.comment.model.CommentProto.Comments> getAllComment(
        com.skillcaptain.app.grpc.comment.model.CommentProto.GetAllCommentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllCommentMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_COMMENT = 0;
  private static final int METHODID_GET_COMMENT = 1;
  private static final int METHODID_GET_ALL_COMMENT = 2;

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
        case METHODID_CREATE_COMMENT:
          serviceImpl.createComment((com.skillcaptain.app.grpc.comment.model.CommentProto.CreateCommentRequest) request,
              (io.grpc.stub.StreamObserver<com.skillcaptain.app.grpc.comment.model.CommentProto.Comment>) responseObserver);
          break;
        case METHODID_GET_COMMENT:
          serviceImpl.getComment((com.skillcaptain.app.grpc.comment.model.CommentProto.GetCommentRequest) request,
              (io.grpc.stub.StreamObserver<com.skillcaptain.app.grpc.comment.model.CommentProto.Comment>) responseObserver);
          break;
        case METHODID_GET_ALL_COMMENT:
          serviceImpl.getAllComment((com.skillcaptain.app.grpc.comment.model.CommentProto.GetAllCommentRequest) request,
              (io.grpc.stub.StreamObserver<com.skillcaptain.app.grpc.comment.model.CommentProto.Comments>) responseObserver);
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
          getCreateCommentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.skillcaptain.app.grpc.comment.model.CommentProto.CreateCommentRequest,
              com.skillcaptain.app.grpc.comment.model.CommentProto.Comment>(
                service, METHODID_CREATE_COMMENT)))
        .addMethod(
          getGetCommentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.skillcaptain.app.grpc.comment.model.CommentProto.GetCommentRequest,
              com.skillcaptain.app.grpc.comment.model.CommentProto.Comment>(
                service, METHODID_GET_COMMENT)))
        .addMethod(
          getGetAllCommentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.skillcaptain.app.grpc.comment.model.CommentProto.GetAllCommentRequest,
              com.skillcaptain.app.grpc.comment.model.CommentProto.Comments>(
                service, METHODID_GET_ALL_COMMENT)))
        .build();
  }

  private static abstract class CommentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CommentServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.skillcaptain.app.grpc.comment.model.CommentProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CommentService");
    }
  }

  private static final class CommentServiceFileDescriptorSupplier
      extends CommentServiceBaseDescriptorSupplier {
    CommentServiceFileDescriptorSupplier() {}
  }

  private static final class CommentServiceMethodDescriptorSupplier
      extends CommentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    CommentServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (CommentServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CommentServiceFileDescriptorSupplier())
              .addMethod(getCreateCommentMethod())
              .addMethod(getGetCommentMethod())
              .addMethod(getGetAllCommentMethod())
              .build();
        }
      }
    }
    return result;
  }
}
