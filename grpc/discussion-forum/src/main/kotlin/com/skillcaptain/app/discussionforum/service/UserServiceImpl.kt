package com.skillcaptain.app.discussionforum.service

import com.google.protobuf.Int64Value
import com.skillcaptain.app.discussionforum.provider.NotificationDataProvider
import com.skillcaptain.app.discussionforum.provider.UserDataProvider
import com.skillcaptain.app.grpc.user.model.UserProto
import com.skillcaptain.app.grpc.user.model.UserServiceGrpc.UserServiceImplBase
import io.grpc.stub.StreamObserver
import net.devh.boot.grpc.server.service.GrpcService

@GrpcService
class UserServiceImpl(
    private val userDataProvider: UserDataProvider,
    private val notificationDataProvider: NotificationDataProvider
) : UserServiceImplBase() {

    override fun createUser(request: UserProto.CreateUserRequest?, responseObserver: StreamObserver<UserProto.User>?) {
        requireNotNull(request)
        runCatching {
            //TODO
        }.getOrElse {
            //TODO
        }
    }

    override fun getUser(request: Int64Value?, responseObserver: StreamObserver<UserProto.User>?) {
        requireNotNull(request)
        runCatching {
            //TODO
        }.getOrElse {
            //TODO
        }
    }

    override fun getAllNotifications(
        request: UserProto.GetAllNotificationsRequest?,
        responseObserver: StreamObserver<UserProto.Notifications>?
    ) {
        requireNotNull(request)
        runCatching {
            //TODO
        }.getOrElse {
            //TODO
        }
    }

}