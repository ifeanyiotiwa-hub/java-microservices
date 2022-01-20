package com.example.ec.domain;


import javax.persistence.*;

@Entity
public class Tour {

    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private String title;

    @Column(length = 2000)
    private String description;

    @Column(length = 2000)
    private String blurb;

    @Column
    private Integer price;

    @Column
    private String duration;

    @Column(length = 2000)
    private String bullets;

    @Column
    private String keywords;

    @ManyToOne
    private TourPackage tourPackage;

    @Column
    @Enumerated
    private Difficulty difficulty;

    @Column
    @Enumerated
    private  Region region;

    public Tour(String title, String description, String blurb,
                Integer price, String duration, String bullets, String keywords,
                TourPackage tourPackage, Difficulty difficulty, Region region) {
        this.title = title;
        this.description = description;
        this.blurb = blurb;
        this.price = price;
        this.duration = duration;
        this.bullets = bullets;
        this.keywords = keywords;
        this.tourPackage = tourPackage;
        this.difficulty = difficulty;
        this.region = region;
    }

    protected Tour() {

    }

    //Getters
    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getBlurb() {
        return blurb;
    }

    public Integer getPrice() {
        return price;
    }

    public String getDuration() {
        return duration;
    }

    public String getBullets() {
        return bullets;
    }

    public String getKeywords() {
        return keywords;
    }

    public TourPackage getTourPackage() {
        return tourPackage;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public Region getRegion() {
        return region;
    }


    //Setters
    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setBlurb(String blurb) {
        this.blurb = blurb;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public void setBullets(String bullets) {
        this.bullets = bullets;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public void setTourPackage(TourPackage tourPackage) {
        this.tourPackage = tourPackage;
    }

    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }

    public void setRegion(Region region) {
        this.region = region;
    }
}
