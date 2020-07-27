package com.example.tugas_besar_mc;

public class DataList {
    private int imageid;
    private String title;
    private String price;
    private String deskripsi;
    private String deskripsi2;
    private String deskripsi3;
    private int photo1;
    private int photo2;
    private int photo3;
    private String link;

    public DataList(int imageid, String title, String price, String deskripsi, String deskripsi2, String deskripsi3, int photo1, int photo2, int photo3, String link) {
        this.imageid = imageid;
        this.title = title;
        this.price = price;
        this.deskripsi = deskripsi;
        this.deskripsi2 = deskripsi2;
        this.deskripsi3 = deskripsi3;
        this.photo1 = photo1;
        this.photo2 = photo2;
        this.photo3 = photo3;
        this.link = link;
    }

    public int getImageid() {
        return imageid;
    }

    public void setImageid(int imageid) {
        this.imageid = imageid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getDeskripsi2() {
        return deskripsi2;
    }

    public void setDeskripsi2(String deskripsi2) {
        this.deskripsi2 = deskripsi2;
    }

    public String getDeskripsi3() {
        return deskripsi3;
    }

    public void setDeskripsi3(String deskripsi3) {
        this.deskripsi3 = deskripsi3;
    }

    public int getPhoto1() {
        return photo1;
    }

    public void setPhoto1(int photo1) {
        this.photo1 = photo1;
    }

    public int getPhoto2() {
        return photo2;
    }

    public void setPhoto2(int photo2) {
        this.photo2 = photo2;
    }

    public int getPhoto3() {
        return photo3;
    }

    public void setPhoto3(int photo3) {
        this.photo3 = photo3;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
