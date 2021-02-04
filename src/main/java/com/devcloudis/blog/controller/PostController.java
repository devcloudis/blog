package com.devcloudis.blog.controller;

import com.devcloudis.blog.model.domain.Post;
import com.devcloudis.blog.repository.PostRepository;
import no.finn.unleash.Unleash;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class PostController {

    private final PostRepository repository;

    private final Unleash unleash;

    PostController(PostRepository repository, Unleash unleash) {
        this.repository = repository;
        this.unleash = unleash;
    }

    @GetMapping("/posts")
    public Flux<Post> getAllPosts() {
        if(unleash.isEnabled("GetPostFeature")) {
            return repository.findAll();
        }
        else {
            return Flux.just(new Post());
        }
    }
}
