package com.example.recyclerviewbestpractice2023;

public class datamodel {

    int images;
    String header, desc;

    public datamodel(int images, String header, String desc) {
        this.images = images;
        this.header = header;
        this.desc = desc;
    }

    public int getImages() {
        return images;
    }

    public void setImages(int images) {
        this.images = images;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
