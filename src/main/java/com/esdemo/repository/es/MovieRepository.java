package com.esdemo.repository.es;

import java.util.List;

import com.esdemo.model.Movie;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface MovieRepository extends ElasticsearchRepository<Movie, String> {

    List<Movie> findAll();

//    @Query("{\n" +
//            "   \"query\": {\n" +
//            "      \"term\": {\n" +
//            "         \"title\": {\n" +
//            "            \"value\": \"apocalypse\"\n" +
//            "         }\n" +
//            "      }\n" +
//            "   }\n" +
//            "}")
    List<Movie> findByTitle(String title);
}