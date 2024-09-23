package com.tesco.rewards.repository;

import org.springframework.data.repository.CrudRepository;

import com.tesco.rewards.entity.Article;

public interface ArticleRepository extends CrudRepository<Article, Long>  {
}
