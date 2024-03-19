package com.skillcaptain.app.discussionforum.service

import com.skillcaptain.app.discussionforum.provider.CommentDataProvider
import com.skillcaptain.app.discussionforum.provider.UserDataProvider
import com.skillcaptain.app.grpc.comment.model.CommentProto
import com.skillcaptain.app.grpc.comment.model.CommentServiceGrpc.CommentServiceImplBase
import io.grpc.stub.StreamObserver
import net.devh.boot.grpc.server.service.GrpcService

@GrpcService
class CommentServiceImpl(
    private val userDataProvider: UserDataProvider,
    private val postDataProvider: UserDataProvider,
    private val commentDataProvider: CommentDataProvider
) : CommentServiceImplBase() {

    override fun createComment(
        request: CommentProto.CreateCommentRequest?,
        responseObserver: StreamObserver<CommentProto.Comment>?
    ) {
        requireNotNull(request)
        runCatching {
            //TODO
        }.getOrElse {
            //TODO
        }
    }

    override fun getComment(
        request: CommentProto.GetCommentRequest?,
        responseObserver: StreamObserver<CommentProto.Comment>?
    ) {
        requireNotNull(request)
        runCatching {
            //TODO
        }.getOrElse {
            //TODO
        }
    }

    override fun getAllComment(
        request: CommentProto.GetAllCommentRequest?,
        responseObserver: StreamObserver<CommentProto.Comments>?
    ) {
        requireNotNull(request)
        runCatching {
            //TODO
        }.getOrElse {
            //TODO
        }
    }
}