package com.tomas.kreativeco.models.objects_json;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by Tomas on 03/02/2016.
 */
public class Response
{
    ArrayList<ResponseGroups> listGroups;
    public Response(JSONObject json)throws Exception
    {
        this.listGroups = new ArrayList<>();
        JSONArray jsonArray = json.optJSONArray("groups");
        for(int count = 0; count < jsonArray.length(); count++ )
        {
            this.listGroups.add(new ResponseGroups(jsonArray.getJSONObject(count)));
        }
    }

    public ArrayList<ResponseGroups> getListGroup()
    {
        return listGroups;
    }

    public void setListGroup(ArrayList<ResponseGroups> listGroup)
    {
        this.listGroups = listGroup;
    }
}
