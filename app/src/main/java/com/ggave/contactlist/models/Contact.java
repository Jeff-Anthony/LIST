package com.ggave.contactlist.models;

public class Contact {



    private Integer id;
    private String fullname;
    private String email;
    private String picture;


    public Contact(Integer id, String fullname, String email, String picture) {
        this.id = id;
        this.fullname = fullname;
        this.email = email;
        this.picture = picture;
    }




    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}
