package com.skillcaptain.app.discussionforum.provider

import com.skillcaptain.app.grpc.dto.model.DtoProto.PostDto
import org.springframework.stereotype.Repository

interface PostDataProvider {
    fun createPost (postDto: PostDto)
    fun findPost (postId : Long) : PostDto
    fun findPosts () : List<PostDto>
}

@Repository
class PostDataProviderImpl : PostDataProvider{
    override fun createPost(postDto: PostDto) {
        TODO("Not yet implemented  -- - waiting for notification service integration")
    }

    override fun findPost(postId: Long): PostDto {
        TODO("Not yet implemented  -- - waiting for notification service integration")
    }

    override fun findPosts(): List<PostDto> {
        TODO("Not yet implemented  -- - waiting for notification service integration")
    }

}