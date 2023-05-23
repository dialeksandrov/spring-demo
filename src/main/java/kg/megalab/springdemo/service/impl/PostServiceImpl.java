package kg.megalab.springdemo.service.impl;

import kg.megalab.springdemo.dal.entity.PostEntity;
import kg.megalab.springdemo.dal.repository.PostRepository;
import kg.megalab.springdemo.model.post.PostDto;
import kg.megalab.springdemo.service.PostService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;

    @Override
    public void savePost(PostDto post) {
        PostEntity entity = new PostEntity(post);
        postRepository.save(entity);
    }

    @Override
    public List<PostDto> getAllPosts() {
        List<PostEntity> posts = (List<PostEntity>) postRepository.findAll();
        return posts.stream()
                .map(PostDto::new)
                .collect(Collectors.toList());
    }
}
