package com.devcloudis.blog.model.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.Date;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Post {

    @Id
    private String id;

    private String title;

    private String content;

    private Date createdOn;
}
