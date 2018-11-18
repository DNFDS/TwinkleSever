package com.model;

public abstract class human {
    protected String id;
    protected String name;
    protected String image;

    public human(){}
    public void setId(String id){this.id = id;}
    public String getId(){return id;}

    public void setName(String name){this.name = name;}
    public String getName(){return name;}

    public void setImage(String image){this.image = image;}
    public String getImage(){return image;}
}
