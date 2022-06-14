package com.netflix.api.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;

@Document(collection = "Cast")
public class Cast {

    //TODO : This can also be called ActorandActressEntity

    @Id
    private Long id;

    private String name;

    private String socialmedia;

    private String imdblink;

    private String about;

    protected Cast() {
        super();
    }

    public Cast(String name, String socialmedia, String imdblink, String about) {
        super();
        this.name = name;
        this.socialmedia = socialmedia;
        this.imdblink = imdblink;
        this.about = about;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSocialmedia() {
        return socialmedia;
    }

    public void setSocialmedia(String socialmedia) {
        this.socialmedia = socialmedia;
    }

    public String getImdblink() {
        return imdblink;
    }

    public void setImdblink(String imdblink) {
        this.imdblink = imdblink;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }
}
