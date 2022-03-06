package com.surge.springboot.web.dto;

import com.surge.springboot.domain.posts.Posts;
import lombok.Getter;

@Getter
public class PostsResponseDto {

    private Long id;
    private String title;
    private String content;
    private String author;

    public PostsResponseDto(Posts entity) {
        this.id = entity.getId();
        this.content = entity.getContent();
        this.title = entity.getTitle();
        this.author = entity.getAuthor();
    }
}
