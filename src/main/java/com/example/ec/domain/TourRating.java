package com.example.ec.domain;

import javax.persistence.*;

@Entity
public class TourRating {
    @EmbeddedId
    private TourRatingPk pk;

    @Column(nullable = false)
    private Integer score;

    @Column
    private String comment;

    public TourRating(TourRatingPk pk, Integer score, String comment) {
        this.score = score;
        this.comment = comment;
        this.pk = pk;
    }

    protected TourRating() {
    }

    public TourRatingPk getPk() {
        return pk;
    }

    public Integer getScore() {
        return score;
    }

    public String getComment() {
        return comment;
    }

    public void setPk(TourRatingPk pk) {
        this.pk = pk;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
