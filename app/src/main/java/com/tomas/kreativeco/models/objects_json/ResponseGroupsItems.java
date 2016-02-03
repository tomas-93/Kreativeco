package com.tomas.kreativeco.models.objects_json;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by Tomas on 03/02/2016.
 */
public class ResponseGroupsItems
{
    /*
        Ustedes no mencionaron que datos mostrar.
        Asi que deacuerdo estos objetos se puede ver los
        datos que tome del JSON. CABE recalcar. que en la imagen
        presentar el horario del restaurante. EL el cual en el JSON que me proporcionaron
        no vienen ni un dato que diga el horario en el cual la empresa  este trabajando.


     */
    //Contact, locatio, hours, se toman como objectos ya que contienen pripuedades en el JSON
    private ResponseGroupContact responseGroupContact;
    private ResponseGroupLocation responseGroupLocation;
    private ResponseGroupHours responseGroupHours;
    //Name es el unico que se toma como dato simple, este dato es propiedad de venue deacuerdo
    //al JSON proporcionado.
    private String name;

    public ResponseGroupsItems(JSONObject jsonObjec) throws Exception
    {
        jsonObjec = jsonObjec.getJSONObject("venue");
        this.name = jsonObjec.getString("name");
        if(!jsonObjec.isNull("contact"))this.responseGroupContact = new ResponseGroupContact(jsonObjec.getJSONObject("contact"));
        if(!jsonObjec.isNull("location"))this.responseGroupLocation = new ResponseGroupLocation(jsonObjec.getJSONObject("location"));
        if(!jsonObjec.isNull("hours"))this.responseGroupHours = new ResponseGroupHours(jsonObjec.getJSONObject("hours"));
    }
    /*
        Metodos Get y SET
     */

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
