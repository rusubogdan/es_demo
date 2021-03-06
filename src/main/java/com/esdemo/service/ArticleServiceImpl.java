//package com.esdemo.service;
//
//import com.esdemo.model.Article;
//import com.esdemo.repository.es.ArticleRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.stereotype.Service;
//
//@Service
//public class ArticleServiceImpl implements ArticleService {
//
//    private final ArticleRepository articleRepository;
//
//    @Autowired
//    public ArticleServiceImpl(ArticleRepository articleRepository) {
//        this.articleRepository = articleRepository;
//    }
//
//    public Article save(Article article) {
//        return articleRepository.save(article);
//    }
//
//    public Article findOne(String id) {
//        return articleRepository.findOne(id);
//    }
//
//    public Iterable<Article> findAll() {
//        return articleRepository.findAll();
//    }
//
//    public Page<Article> findByAuthorName(String name, Pageable pageable) {
//        return articleRepository.findByAuthorsName(name, pageable);
//    }
//
//    public Page<Article> findByAuthorNameUsingCustomQuery(String name, Pageable pageable) {
//        return articleRepository.findByAuthorsNameUsingCustomQuery(name, pageable);
//    }
//
//    public long count() {
//        return articleRepository.count();
//    }
//
//    public void delete(Article article) {
//        articleRepository.delete(article);
//    }
//}
