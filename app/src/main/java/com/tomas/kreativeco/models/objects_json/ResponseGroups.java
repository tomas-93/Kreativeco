package com.tomas.kreativeco.models.objects_json;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by Tomas on 03/02/2016.
 */
public class ResponseGroups
{
    private ArrayList<ResponseGroupsItems> listItemGroup;
    public ResponseGroups(JSONObject jsonObject)throws Exception
    {
        this.listItemGroup = new ArrayList<>();
        JSONArray jsonArray = jsonObject.optJSONArray("items");
        for(int count = 0; count < jsonArray.length(); count++)
        {
            this.listItemGroup.add(new ResponseGroupsItems(jsonArray.getJSONObject(count)));
        }
    }

    public ArrayList<ResponseGroupsItems> getListItemGroup()
    {
        return listItemGroup;
    }

    public void setListItemGroup(ArrayList<ResponseGroupsItems> listItemGroup)
    {
        this.listItemGroup = listItemGroup;
    }
}
