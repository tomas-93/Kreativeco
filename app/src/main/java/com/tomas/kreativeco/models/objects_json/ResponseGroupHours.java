package com.tomas.kreativeco.models.objects_json;

import org.json.JSONObject;

/**
 * Created by Tomas on 03/02/2016.
 */
public class ResponseGroupHours
{
    private String status, isOpen;
    public ResponseGroupHours(JSONObject jsonObject)throws Exception
    {
        if(!jsonObject.isNull("status"))this.status = jsonObject.getString("status");
        if(!jsonObject.isNull("isOpen"))this.isOpen = jsonObject.getString("isOpen");
    }

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
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
