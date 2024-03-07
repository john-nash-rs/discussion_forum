import { Controller, Delete, Get, Post, Put } from '@nestjs/common';
import { PostService } from './post.service';

@Controller('post')
export class PostController {
  constructor(private readonly postService: PostService) {}

  @Get()
  getAllPosts() {
    // return this.postService.getAllPost();
  }

  @Get()
  getPost() {
    return this.postService.getPost();
  }

  @Post()
  addPost() {}

  @Put()
  updatePost() {}

  @Delete()
  deletePost() {}
}
