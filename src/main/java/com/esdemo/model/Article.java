//package com.esdemo.model;
//
//
//import static org.springframework.data.elasticsearch.annotations.FieldIndex.not_analyzed;
//import static org.springframework.data.elasticsearch.annotations.FieldType.Nested;
//
//import java.util.Arrays;
//import java.util.List;
//
//import org.springframework.data.annotation.Id;
//import org.springframework.data.elasticsearch.annotations.Document;
//import org.springframework.data.elasticsearch.annotations.Field;
//import org.springframework.data.elasticsearch.annotations.InnerField;
//import org.springframework.data.elasticsearch.annotations.MultiField;
//
//@Document(indexName = "blog", type = "article")
//public class Article {
//
//    @Id
//    private String id;
//
//    @MultiField(mainField = @Field(type = String), otherFields = { @InnerField(index = not_analyzed, suffix = "verbatim", type = String) })
//    private String title;
//
//    @Field(type = Nested)
//    private List<Actor> authors;
//
//    @Field(type = String, index = not_analyzed)
//    private String[] tags;
//
//    public Article() {
//    }
//
//    public Article(String title) {
//        this.title = title;
//    }
//
//    public String getId_movie() {
//        return id;
//    }
//
//    public void setId_movie(String id) {
//        this.id = id;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public List<Actor> getAuthors() {
//        return authors;
//    }
//
//    public void setAuthors(List<Actor> authors) {
//        this.authors = authors;
//    }
//
//    public String[] getTags() {
//        return tags;
//    }
//
//    public void setTags(String... tags) {
//        this.tags = tags;
//    }
//
//    @Override
//    public String toString() {
//        return "Article{" + "id='" + id + '\'' + ", title='" + title + '\''
//                + ", authors=" + authors + ", tags=" + Arrays.toString(tags) + '}';
//    }
//}
