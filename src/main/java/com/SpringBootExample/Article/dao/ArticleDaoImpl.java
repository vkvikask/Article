package com.SpringBootExample.Article.dao;

import com.SpringBootExample.Article.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.ResultSet;
import java.sql.SQLException;


@Repository
class ArticleDaoImpl implements ArticleDao{

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public void insertArticle(Article article) {
        String sql="INSERT INTO ARTICLES" + "( artid,artname,arttype,artdesc) VALUES(?,?,?,?)";
        jdbcTemplate.update(sql,new Object[]{article.getArtid(),article.getArtname(),article.getArttype(),article.getArtdesc()});

    }

    @Override
    public Article getArticle(Integer artid) {
        String sql = "SELECT * FROM ARTICLES  WHERE artid = ?";

        return jdbcTemplate.queryForObject(sql, new Object[]{artid}, new RowMapper<Article>() {
            @Override
            public Article mapRow(ResultSet resultSet, int i) throws SQLException {

                Article article = new Article();

                article.setArtid(resultSet.getInt("artid"));
                article.setArtname(resultSet.getString("artname"));
                article.setArttype(resultSet.getString("arttype"));
                article.setArtdesc(resultSet.getString("artdesc"));

                return article;
            }
        });
    }
}