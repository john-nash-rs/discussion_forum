package com.skillcaptain.app.grpc.post.model;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.61.1)",
    comments = "Source: post.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PostServiceGrpc {

  private PostServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "model.PostService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.skillcaptain.app.grpc.post.model.PostProto.CreatePostRequest,
      com.skillcaptain.app.grpc.post.model.PostProto.Post> getCreatePostMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreatePost",
      requestType = com.skillcaptain.app.grpc.post.model.PostProto.CreatePostRequest.class,
      responseType = com.skillcaptain.app.grpc.post.model.PostProto.Post.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.skillcaptain.app.grpc.post.model.PostProto.CreatePostRequest,
      com.skillcaptain.app.grpc.post.model.PostProto.Post> getCreatePostMethod() {
    io.grpc.MethodDescriptor<com.skillcaptain.app.grpc.post.model.PostProto.CreatePostRequest, com.skillcaptain.app.grpc.post.model.PostProto.Post> getCreatePostMethod;
    if ((getCreatePostMethod = PostServiceGrpc.getCreatePostMethod) == null) {
      synchronized (PostServiceGrpc.class) {
        if ((getCreatePostMethod = PostServiceGrpc.getCreatePostMethod) == null) {
          PostServiceGrpc.getCreatePostMethod = getCreatePostMethod =
              io.grpc.MethodDescriptor.<com.skillcaptain.app.grpc.post.model.PostProto.CreatePostRequest, com.skillcaptain.app.grpc.post.model.PostProto.Post>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreatePost"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.skillcaptain.app.grpc.post.model.PostProto.CreatePostRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.skillcaptain.app.grpc.post.model.PostProto.Post.getDefaultInstance()))
              .setSchemaDescriptor(new PostServiceMethodDescriptorSupplier("CreatePost"))
              .build();
        }
      }
    }
    return getCreatePostMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.skillcaptain.app.grpc.post.model.PostProto.GetPostRequest,
      com.skillcaptain.app.grpc.post.model.PostProto.Post> getGetPostMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPost",
      requestType = com.skillcaptain.app.grpc.post.model.PostProto.GetPostRequest.class,
      responseType = com.skillcaptain.app.grpc.post.model.PostProto.Post.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.skillcaptain.app.grpc.post.model.PostProto.GetPostRequest,
      com.skillcaptain.app.grpc.post.model.PostProto.Post> getGetPostMethod() {
    io.grpc.MethodDescriptor<com.skillcaptain.app.grpc.post.model.PostProto.GetPostRequest, com.skillcaptain.app.grpc.post.model.PostProto.Post> getGetPostMethod;
    if ((getGetPostMethod = PostServiceGrpc.getGetPostMethod) == null) {
      synchronized (PostServiceGrpc.class) {
        if ((getGetPostMethod = PostServiceGrpc.getGetPostMethod) == null) {
          PostServiceGrpc.getGetPostMethod = getGetPostMethod =
              io.grpc.MethodDescriptor.<com.skillcaptain.app.grpc.post.model.PostProto.GetPostRequest, com.skillcaptain.app.grpc.post.model.PostProto.Post>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPost"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.skillcaptain.app.grpc.post.model.PostProto.GetPostRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.skillcaptain.app.grpc.post.model.PostProto.Post.getDefaultInstance()))
              .setSchemaDescriptor(new PostServiceMethodDescriptorSupplier("GetPost"))
              .build();
        }
      }
    }
    return getGetPostMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.skillcaptain.app.grpc.post.model.PostProto.GetPostsRequest,
      com.skillcaptain.app.grpc.post.model.PostProto.PostsResponse> getGetPostsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPosts",
      requestType = com.skillcaptain.app.grpc.post.model.PostProto.GetPostsRequest.class,
      responseType = com.skillcaptain.app.grpc.post.model.PostProto.PostsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.skillcaptain.app.grpc.post.model.PostProto.GetPostsRequest,
      com.skillcaptain.app.grpc.post.model.PostProto.PostsResponse> getGetPostsMethod() {
    io.grpc.MethodDescriptor<com.skillcaptain.app.grpc.post.model.PostProto.GetPostsRequest, com.skillcaptain.app.grpc.post.model.PostProto.PostsResponse> getGetPostsMethod;
    if ((getGetPostsMethod = PostServiceGrpc.getGetPostsMethod) == null) {
      synchronized (PostServiceGrpc.class) {
        if ((getGetPostsMethod = PostServiceGrpc.getGetPostsMethod) == null) {
          PostServiceGrpc.getGetPostsMethod = getGetPostsMethod =
              io.grpc.MethodDescriptor.<com.skillcaptain.app.grpc.post.model.PostProto.GetPostsRequest, com.skillcaptain.app.grpc.post.model.PostProto.PostsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPosts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.skillcaptain.app.grpc.post.model.PostProto.GetPostsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.skillcaptain.app.grpc.post.model.PostProto.PostsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PostServiceMethodDescriptorSupplier("GetPosts"))
              .build();
        }
      }
    }
    return getGetPostsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PostServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PostServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PostServiceStub>() {
        @java.lang.Override
        public PostServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PostServiceStub(channel, callOptions);
        }
      };
    return PostServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PostServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PostServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PostServiceBlockingStub>() {
        @java.lang.Override
        public PostServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PostServiceBlockingStub(channel, callOptions);
        }
      };
    return PostServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PostServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PostServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PostServiceFutureStub>() {
        @java.lang.Override
        public PostServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PostServiceFutureStub(channel, callOptions);
        }
      };
    return PostServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void createPost(com.skillcaptain.app.grpc.post.model.PostProto.CreatePostRequest request,
        io.grpc.stub.StreamObserver<com.skillcaptain.app.grpc.post.model.PostProto.Post> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreatePostMethod(), responseObserver);
    }

    /**
     */
    default void getPost(com.skillcaptain.app.grpc.post.model.PostProto.GetPostRequest request,
        io.grpc.stub.StreamObserver<com.skillcaptain.app.grpc.post.model.PostProto.Post> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPostMethod(), responseObserver);
    }

    /**
     */
    default void getPosts(com.skillcaptain.app.grpc.post.model.PostProto.GetPostsRequest request,
        io.grpc.stub.StreamObserver<com.skillcaptain.app.grpc.post.model.PostProto.PostsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPostsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service PostService.
   */
  public static abstract class PostServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return PostServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service PostService.
   */
  public static final class PostServiceStub
      extends io.grpc.stub.AbstractAsyncStub<PostServiceStub> {
    private PostServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PostServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PostServiceStub(channel, callOptions);
    }

    /**
     */
    public void createPost(com.skillcaptain.app.grpc.post.model.PostProto.CreatePostRequest request,
        io.grpc.stub.StreamObserver<com.skillcaptain.app.grpc.post.model.PostProto.Post> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreatePostMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPost(com.skillcaptain.app.grpc.post.model.PostProto.GetPostRequest request,
        io.grpc.stub.StreamObserver<com.skillcaptain.app.grpc.post.model.PostProto.Post> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPostMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPosts(com.skillcaptain.app.grpc.post.model.PostProto.GetPostsRequest request,
        io.grpc.stub.StreamObserver<com.skillcaptain.app.grpc.post.model.PostProto.PostsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPostsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service PostService.
   */
  public static final class PostServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<PostServiceBlockingStub> {
    private PostServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PostServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PostServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.skillcaptain.app.grpc.post.model.PostProto.Post createPost(com.skillcaptain.app.grpc.post.model.PostProto.CreatePostRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreatePostMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.skillcaptain.app.grpc.post.model.PostProto.Post getPost(com.skillcaptain.app.grpc.post.model.PostProto.GetPostRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPostMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.skillcaptain.app.grpc.post.model.PostProto.PostsResponse getPosts(com.skillcaptain.app.grpc.post.model.PostProto.GetPostsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPostsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service PostService.
   */
  public static final class PostServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<PostServiceFutureStub> {
    private PostServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PostServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PostServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.skillcaptain.app.grpc.post.model.PostProto.Post> createPost(
        com.skillcaptain.app.grpc.post.model.PostProto.CreatePostRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreatePostMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.skillcaptain.app.grpc.post.model.PostProto.Post> getPost(
        com.skillcaptain.app.grpc.post.model.PostProto.GetPostRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPostMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.skillcaptain.app.grpc.post.model.PostProto.PostsResponse> getPosts(
        com.skillcaptain.app.grpc.post.model.PostProto.GetPostsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPostsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_POST = 0;
  private static final int METHODID_GET_POST = 1;
  private static final int METHODID_GET_POSTS = 2;

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
        case METHODID_CREATE_POST:
          serviceImpl.createPost((com.skillcaptain.app.grpc.post.model.PostProto.CreatePostRequest) request,
              (io.grpc.stub.StreamObserver<com.skillcaptain.app.grpc.post.model.PostProto.Post>) responseObserver);
          break;
        case METHODID_GET_POST:
          serviceImpl.getPost((com.skillcaptain.app.grpc.post.model.PostProto.GetPostRequest) request,
              (io.grpc.stub.StreamObserver<com.skillcaptain.app.grpc.post.model.PostProto.Post>) responseObserver);
          break;
        case METHODID_GET_POSTS:
          serviceImpl.getPosts((com.skillcaptain.app.grpc.post.model.PostProto.GetPostsRequest) request,
              (io.grpc.stub.StreamObserver<com.skillcaptain.app.grpc.post.model.PostProto.PostsResponse>) responseObserver);
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
          getCreatePostMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.skillcaptain.app.grpc.post.model.PostProto.CreatePostRequest,
              com.skillcaptain.app.grpc.post.model.PostProto.Post>(
                service, METHODID_CREATE_POST)))
        .addMethod(
          getGetPostMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.skillcaptain.app.grpc.post.model.PostProto.GetPostRequest,
              com.skillcaptain.app.grpc.post.model.PostProto.Post>(
                service, METHODID_GET_POST)))
        .addMethod(
          getGetPostsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.skillcaptain.app.grpc.post.model.PostProto.GetPostsRequest,
              com.skillcaptain.app.grpc.post.model.PostProto.PostsResponse>(
                service, METHODID_GET_POSTS)))
        .build();
  }

  private static abstract class PostServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PostServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.skillcaptain.app.grpc.post.model.PostProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PostService");
    }
  }

  private static final class PostServiceFileDescriptorSupplier
      extends PostServiceBaseDescriptorSupplier {
    PostServiceFileDescriptorSupplier() {}
  }

  private static final class PostServiceMethodDescriptorSupplier
      extends PostServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    PostServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (PostServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PostServiceFileDescriptorSupplier())
              .addMethod(getCreatePostMethod())
              .addMethod(getGetPostMethod())
              .addMethod(getGetPostsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
