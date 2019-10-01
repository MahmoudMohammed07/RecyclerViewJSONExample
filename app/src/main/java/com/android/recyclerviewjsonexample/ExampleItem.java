package com.android.recyclerviewjsonexample;

public class ExampleItem {
    private String imageUrl;
    private String creator;
    private int likes;

    public ExampleItem() {
    }

    public ExampleItem(String imageUrl, String creator, int likes) {
        this.imageUrl = imageUrl;
        this.creator = creator;
        this.likes = likes;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }
}
