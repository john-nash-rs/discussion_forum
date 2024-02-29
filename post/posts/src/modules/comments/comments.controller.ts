import { Controller, Get } from "@nestjs/common";
import { CommentService } from "./comments.service";

@Controller('comment')
export class CommentController {
    constructor(private readonly commentService: CommentService) {}

    @Get()
    getComment(){
        return this.commentService.getComment()
    }
}