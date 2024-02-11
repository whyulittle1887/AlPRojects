package com.example;

public class Lion implements Comparable<Lion>
{
    private Integer age;
    private String name;
    private String gender;

    public Lion(Integer age, String name, String gender)
    {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    public void setAge(Integer age)
    {
        this.age = age;
    }

    public Integer getAge()
    {
        return age;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setGender(String gender)
    {
        this.gender = gender;
    }

    public String getGender()
    {
        return gender;
    }

    @Override
    public String toString()
    {
        return "Lion{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    @Override
    public int compareTo(Lion otherLion)
    {
        return this.getName().compareTo(otherLion.getName());   // ascending order
//        return otherLion.getName().compareTo(this.getName()); // descending order
    }
}
