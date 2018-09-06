package com.galvanize.model;

public class Review {

    private long id;
    private String title;
    private int rating;



    private String text;
    private int snack_id;

    public Review(long id, String title, String text, int rating, int snack_id) {
        this.id = id;
        this.title = title;
        this.rating = rating;
        this.text = text;
        this.snack_id = snack_id;
    }

    public Review() {

    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getSnack_id() {
        return snack_id;
    }

    public void setSnack_id(int snack_id) {
        this.snack_id = snack_id;
    }




}

