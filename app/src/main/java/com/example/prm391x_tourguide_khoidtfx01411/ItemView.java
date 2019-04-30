package com.example.prm391x_tourguide_khoidtfx01411;

public class ItemView {
    private String name, urlImg, detail;

    public ItemView(String name, String urlImg, String detail) {
        this.name = name;
        this.urlImg = urlImg;
        this.detail = detail;
    }

    public ItemView() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrlImg() {
        return urlImg;
    }

    public void setUrlImg(String urlImg) {
        this.urlImg = urlImg;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
