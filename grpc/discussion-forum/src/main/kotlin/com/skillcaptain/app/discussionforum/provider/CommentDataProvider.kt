package com.skillcaptain.app.discussionforum.provider

import com.skillcaptain.app.grpc.dto.model.DtoProto.CommentDto
import org.springframework.stereotype.Repository


interface CommentDataProvider {

    fun createComment (commentDto: CommentDto) : CommentDto
    fun findComment (commentId :Long) : CommentDto
    fun findAllCommentForPost (postId: Long) : List<CommentDto>
}

@Repository
class CommentDataProviderImpl: CommentDataProvider{

    override fun createComment(commentDto: CommentDto): CommentDto {
        TODO("Not yet implemented - waiting for comment service integration")
    }

    override fun findComment(commentId: Long): CommentDto {
        TODO("Not yet implemented - waiting for comment service integration")
    }

    override fun findAllCommentForPost(postId: Long): List<CommentDto> {
        TODO("Not yet implemented - waiting for comment service integration")
    }

}