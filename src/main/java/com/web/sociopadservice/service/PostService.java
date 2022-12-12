package com.web.sociopadservice.service;

import com.web.sociopadservice.model.Post;

import java.util.List;

public interface PostService {
    Post addPost(Post post) throws Exception;

    List<Post> getPost();
}
