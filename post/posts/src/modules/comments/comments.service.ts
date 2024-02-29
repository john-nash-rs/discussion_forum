import { Injectable } from "@nestjs/common";

@Injectable()
export class CommentService{
    getComment() {
        return 'These are the comments';
    }
}