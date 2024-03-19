package com.skillcaptain.app.discussionforum.provider


import com.skillcaptain.app.grpc.dto.model.DtoProto.NotificationDto
import org.springframework.stereotype.Repository

interface NotificationDataProvider {
    fun findAllNotifications(userId: Long): List<NotificationDto>
    fun createNotification(notificationDto: NotificationDto)
}

@Repository
class NotificationDataProviderImpl : NotificationDataProvider {

    override fun findAllNotifications(userId: Long): List<NotificationDto> {
        TODO("Not yet implemented -- - waiting for notification service integration")
    }

    override fun createNotification(notificationDto: NotificationDto) {
        TODO("Not yet implemented -- - waiting for notification service integration")
    }

}