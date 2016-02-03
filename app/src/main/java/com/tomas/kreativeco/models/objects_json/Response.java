package com.tomas.kreativeco.models.objects_json;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by Tomas on 03/02/2016.
 *
 * Esta clase hace referencia a una structura de datos
 * en expresada en el JSON
 *
 * Este conjunto de datos puede contener varios grupos.
 */
public class Response
{
    //Es por ello que su propiedad se represento como una lista
    ArrayList<ResponseGroups> listGroups;
    //En el contructor se le pasa el objeto Json posicionado en RESPONSE
    public Response(JSONObject json)throws Exception
    {
        //Instancia de la lista
        this.listGroups = new ArrayList<>();
        //Se posicionado en el obecto Groups
        JSONArray jsonArray = json.optJSONArray("groups");
        //Ya que groups es un conjunto, se recorrera cada elemento y se guardara el una lista
        for(int count = 0; count < jsonArray.length(); count++ )
        {
            this.listGroups.add(new ResponseGroups(jsonArray.getJSONObject(count)));
        }
    }

    /*
        Metodos GET Y SET
     */
    public ArrayList<ResponseGroups> getListGroup()
    {
        return listGroups;
    }

    public void setListGroup(ArrayList<ResponseGroups> listGroup)
    {
        this.listGroups = listGroup;
    }
}
