package com.mycompany.product.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ID;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private int catID;

    public Product()
    {

    }

    public Product(int ID)
    {
        this.ID = ID;
    }

    public int getID()
    {
        return ID;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getCatID()
    {
        return catID;
    }

    public void setCatID(int catID)
    {
        this.catID = catID;
    }
}