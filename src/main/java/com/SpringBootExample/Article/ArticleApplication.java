package com.SpringBootExample.Article;

import com.SpringBootExample.Article.model.Article;
import com.SpringBootExample.Article.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ArticleApplication {



	@Autowired
	ArticleService articleService;

	public static void main(String[] args) {

	ApplicationContext context= SpringApplication.run(ArticleApplication.class, args);
		ArticleService articleService = context.getBean(ArticleService.class);

		Article article = new Article();

		article.setArtid(8);
		article.setArtname("Book");
		article.setArttype("English");
		article.setArtdesc("Grammer");

     articleService.insertArticle(article);

	articleService.getArticle(article.getArtid());
	}

}

