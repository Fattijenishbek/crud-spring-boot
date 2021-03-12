package com.example.cscrudapp.repo;

import com.example.cscrudapp.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
