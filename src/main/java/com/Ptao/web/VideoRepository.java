package com.Ptao.web;
import org.springframework.data.repository.CrudRepository;

import com.Ptao.web.Domain.Video;

public interface VideoRepository extends CrudRepository<Video,Long> {
    
}
