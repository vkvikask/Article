package com.SpringBootExample.Article.model;

public class Article {
    public Integer artid;
   public String artname;
  public String arttype;
    public String  artdesc;


    public Article(Integer artid,String artname,String arttype, String artdesc){
        this.artid= artid;
        this.artname= artname;
        this.arttype= arttype;
        this.artdesc=artdesc;
    }

    public Article(){

    }

    public Integer getArtid() {
        return artid;
    }

    public void setArtid(Integer artid) {
        this.artid = artid;
    }

    public String getArtname() {
        return artname;
    }

    public void setArtname(String artname) {
        this.artname = artname;
    }

    public String getArttype() {
        return arttype;
    }

    public void setArttype(String arttype) {
        this.arttype = arttype;
    }

    public String getArtdesc() {
        return artdesc;
    }

    public void setArtdesc(String artdesc) {
        this.artdesc = artdesc;
    }

    @Override
    public String toString() {
        return "Article{" +
                "artid=" + artid +
                ", artname='" + artname + '\'' +
                ", arttype='" + arttype + '\'' +
                ", artdesc='" + artdesc + '\'' +
                '}';
    }
}

