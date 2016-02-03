package com.tomas.kreativeco.models.objects;

/**
 * Created by Tomas on 03/02/2016.
 */
public class Info
{
    private String name;
    private String isOpen;
    private String location;
    public Info(String name, String isOpen, String location)
    {
        this.name = name;
        this.isOpen = isOpen;
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    public String getName()
    {
        return name;
    }



    public void setName(String name)

    {
        this.name = name;
    }

    public String getIsOpen()
    {
        return isOpen;
    }

    public void setIsOpen(String isOpen)
    {
        this.isOpen = isOpen;
    }
}
