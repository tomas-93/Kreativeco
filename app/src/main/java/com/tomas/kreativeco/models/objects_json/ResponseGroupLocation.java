package com.tomas.kreativeco.models.objects_json;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Created by Tomas on 03/02/2016.
 */
public class ResponseGroupLocation
{
    private String location;
    public ResponseGroupLocation(JSONObject jsonObject)throws Exception
    {
        JSONArray jsonArray = jsonObject.optJSONArray("formattedAddress");
        for(int count = 0; count < jsonArray.length(); count++)
        {
            if(!jsonArray.isNull(count))
                this.location += " "+jsonArray.getString(count);
            Log.e(this.location, this.location);
        }

    }

    public String getLocation()
    {
        return location;
    }

    public void setLocation(String location)
    {
        this.location = location;
    }
}
