package com.SpringBootExample.Article.dao;

import com.SpringBootExample.Article.model.Article;

public interface ArticleDao {

public void insertArticle(Article article);

Article getArticle(Integer artid);

//public void updateArticle(Article article);

//Article deleteArticle(Integer artid);

}
