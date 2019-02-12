package com.SpringBootExample.Article.service;

import com.SpringBootExample.Article.model.Article;

public interface ArticleService {
    void insertArticle(Article article);
    Article getArticle(Integer artid);


}
