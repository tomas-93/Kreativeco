package com.tomas.kreativeco.models.objects_json;

import org.json.JSONObject;

/**
 * Created by Tomas on 03/02/2016.
 */
public class ResponseGroupContact
{
    private String phone, twitter, facebook;
    public ResponseGroupContact(JSONObject jsonObject)throws Exception
    {
        if(!jsonObject.isNull("phone"))this.phone = jsonObject.getString("phone");
        if(!jsonObject.isNull("twitter"))this.twitter = jsonObject.getString("twitter");
        if(!jsonObject.isNull("facebookName"))this.facebook = jsonObject.getString("facebookName");
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter)
    {
        this.twitter = twitter;
    }

    public String getFacebook()
    {
        return facebook;
    }

    public void setFacebook(String facebook)
    {
        this.facebook = facebook;
    }
}
