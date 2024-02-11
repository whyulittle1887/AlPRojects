package com.ait.winemanager.dto;

import javax.persistence.*;

@Entity
public class Wine
{


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    private int year;
    private String name;
    private String grapes;
    private String country;
    private String region;
    @Lob
    private String description;
    private String picture;

    public Wine()
    {

    }

    public Wine(Long id, String name, String grapes, String country, String region, String description, String picture)
    {
        this.id = id;
        this.name = name;
        this.grapes = grapes;
        this.country = country;
        this.region = region;
        this.description = description;
        this.picture = picture;
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getGrapes()
    {
        return grapes;
    }

    public void setGrages(String grapes)
    {
        this.grapes = grapes;
    }

    public String getCountry()
    {
        return country;
    }

    public void setCountry(String country)
    {
        this.country = country;
    }

    public String getRegion()
    {
        return region;
    }

    public void setRegion(String region)
    {
        this.region = region;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getPicture()
    {
        return picture;
    }

    public void setPicture(String picture)
    {
        this.picture = picture;
    }

    @Override
    public String toString()
    {
        return "Wine [id=" + id + ", name=" + name + ", grages=" + grapes + ", country=" + country + ", region="
                + region + ", description=" + description + ", picture=" + picture + "]";
    }

    public int getYear()
    {
        return year;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

}