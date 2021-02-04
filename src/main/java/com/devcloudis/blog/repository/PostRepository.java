package com.devcloudis.blog.repository;

import com.devcloudis.blog.model.domain.Post;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface PostRepository extends ReactiveCrudRepository<Post, String> {
}
