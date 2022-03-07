package com.surge.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;
public interface PostsRepository extends JpaRepository<Posts,Long> {

    @Query("SELECT p from Posts p ORDER BY p.id DESC")
    List<Posts> findAllDesc();
}
