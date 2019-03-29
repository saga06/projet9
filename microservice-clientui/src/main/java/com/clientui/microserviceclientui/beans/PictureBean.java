package com.clientui.microserviceclientui.beans;

public class PictureBean {

    private int picture_id;
    private int adventure_id;
    private String path;

    public PictureBean() {
    }

    public int getPicture_id() {
        return picture_id;
    }

    public void setPicture_id(int picture_id) {
        this.picture_id = picture_id;
    }

    public int getAdventure_id() {
        return adventure_id;
    }

    public void setAdventure_id(int adventure_id) {
        this.adventure_id = adventure_id;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "PictureBean{" +
                "picture_id=" + picture_id +
                ", adventure_id=" + adventure_id +
                ", path='" + path + '\'' +
                '}';
    }
}
