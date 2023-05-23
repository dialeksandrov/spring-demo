package kg.megalab.springdemo.service;

import kg.megalab.springdemo.model.post.PostDto;

import java.util.List;

public interface PostService {

    void savePost(PostDto post);

    List<PostDto> getAllPosts();
}
