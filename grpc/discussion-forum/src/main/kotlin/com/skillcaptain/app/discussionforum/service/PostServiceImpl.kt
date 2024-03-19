package com.skillcaptain.app.discussionforum.service

import com.skillcaptain.app.discussionforum.provider.NotificationDataProvider
import com.skillcaptain.app.discussionforum.provider.PostDataProvider
import com.skillcaptain.app.discussionforum.provider.UserDataProvider
import com.skillcaptain.app.grpc.post.model.PostProto
import com.skillcaptain.app.grpc.post.model.PostServiceGrpc.PostServiceImplBase
import io.grpc.stub.StreamObserver
import net.devh.boot.grpc.server.service.GrpcService

@GrpcService
class PostServiceImpl(
    private val userDataProvider: UserDataProvider,
    private val postDataProvider: PostDataProvider,
    private val notificationDataProvider: NotificationDataProvider
) :  PostServiceImplBase(){

    override fun createPost(request: PostProto.CreatePostRequest?, responseObserver: StreamObserver<PostProto.Post>?) {
        requireNotNull(request)
        runCatching {
            //TODO
        }.getOrElse {
            //TODO
        }
    }

    override fun getPost(request: PostProto.GetPostRequest?, responseObserver: StreamObserver<PostProto.Post>?) {
        requireNotNull(request)
        runCatching {
            //TODO
        }.getOrElse {
            //TODO
        }
    }

    override fun getPosts(
        request: PostProto.GetPostsRequest?,
        responseObserver: StreamObserver<PostProto.PostsResponse>?
    ) {
        requireNotNull(request)
        runCatching {
            //TODO
        }.getOrElse {
            //TODO
        }
    }

}