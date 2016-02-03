package com.tomas.kreativeco.models.objects_json;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by Tomas on 03/02/2016.
 */
public class ResponseGroupsItems
{
    private ResponseGroupContact responseGroupContact;
    private ResponseGroupLocation responseGroupLocation;
    private ResponseGroupHours responseGroupHours;
    private String name;

    public ResponseGroupsItems(JSONObject jsonObjec) throws Exception
    {
        jsonObjec = jsonObjec.getJSONObject("venue");
        this.name = jsonObjec.getString("name");
        if(!jsonObjec.isNull("contact"))this.responseGroupContact = new ResponseGroupContact(jsonObjec.getJSONObject("contact"));
        if(!jsonObjec.isNull("location"))this.responseGroupLocation = new ResponseGroupLocation(jsonObjec.getJSONObject("location"));
        if(!jsonObjec.isNull("hours"))this.responseGroupHours = new ResponseGroupHours(jsonObjec.getJSONObject("hours"));
    }

    public ResponseGroupContact getResponseGroupContact()
    {
        return responseGroupContact;
    }

    public void setResponseGroupContact(ResponseGroupContact responseGroupContact)
    {
        this.responseGroupContact = responseGroupContact;
    }

    public ResponseGroupLocation getResponseGroupLocation()
    {
        return responseGroupLocation;
    }

    public void setResponseGroupLocation(ResponseGroupLocation responseGroupLocation)
    {
        this.responseGroupLocation = responseGroupLocation;
    }

    public ResponseGroupHours getResponseGroupHours()
    {
        return responseGroupHours;
    }

    public void setResponseGroupHours(ResponseGroupHours responseGroupHours)
    {
        this.responseGroupHours = responseGroupHours;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
