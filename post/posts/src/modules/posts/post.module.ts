import { Module } from '@nestjs/common';
import { PostController } from './post.controller';
import { PostService } from './post.service';
import { CommentModule } from '../comments/comments.module';

@Module({
  imports: [CommentModule],
  controllers: [PostController],
  providers: [PostService],
})
export class PostModule {}
