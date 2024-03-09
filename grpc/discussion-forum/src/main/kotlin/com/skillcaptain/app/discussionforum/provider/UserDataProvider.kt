package com.skillcaptain.app.discussionforum.provider

import com.skillcaptain.app.grpc.dto.model.DtoProto.UserDto
import org.springframework.stereotype.Repository

interface UserDataProvider {

    fun createUser(userDto: UserDto)
    fun getUser(userId: Long): UserDto
}

@Repository
class UserDataProviderImpl : UserDataProvider {

    override fun createUser(userDto: UserDto) {
        TODO("Not yet implemented  -- - waiting for user service integration")
    }

    override fun getUser(userId: Long): UserDto {
        TODO("Not yet implemented  -- - waiting for user service integration")
    }


}