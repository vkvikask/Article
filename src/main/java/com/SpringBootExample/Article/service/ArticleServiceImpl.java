package com.SpringBootExample.Article.service;

import com.SpringBootExample.Article.dao.ArticleDao;
import com.SpringBootExample.Article.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class ArticleServiceImpl implements ArticleService{

    @Autowired
    JdbcTemplate jdbcTemplate;


    @Autowired
    ArticleDao articleDao;

    public void insertArticle(Article article) {

        articleDao.insertArticle(article);

    }
    public Article getArticle(Integer artid) {

        Article article = articleDao.getArticle(artid);
       // System.out.println(article);

        return article;
    }
}
