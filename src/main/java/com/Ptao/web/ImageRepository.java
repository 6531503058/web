package com.Ptao.web;

import org.springframework.data.repository.CrudRepository;

import com.Ptao.web.Domain.Photo;

public interface ImageRepository extends CrudRepository<Photo,Long>{
    
}
