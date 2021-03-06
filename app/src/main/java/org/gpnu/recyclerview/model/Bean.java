package org.gpnu.recyclerview.model;

public class Bean {
    private String imgUrl;
    private String title;

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Bean() {
    }

    public Bean(String imgUrl, String title) {
        this.imgUrl = imgUrl;
        this.title = title;
    }
}
