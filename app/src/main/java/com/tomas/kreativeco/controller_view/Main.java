package com.tomas.kreativeco.controller_view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.View.OnClickListener;

import android.widget.ImageView;
import android.widget.TextView;

import com.tomas.kreativeco.R;
import com.tomas.kreativeco.controller_view.adapter.AdapterList;
import com.tomas.kreativeco.models.objects.Info;
import com.tomas.kreativeco.models.objects_json.Response;
import com.tomas.kreativeco.models.objects_json.ResponseGroupHours;
import com.tomas.kreativeco.models.objects_json.ResponseGroups;
import com.tomas.kreativeco.models.objects_json.ResponseGroupsItems;
import com.tomas.kreativeco.utils.JSON;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.jar.JarEntry;

public class Main extends AppCompatActivity implements OnClickListener
{
    private ImageView restaurants, bars, afters, hotels, fine, action;
    private TextView title;
    private ArrayList<Info> listInfo;
    private AdapterList myAdapter;
    private RecyclerView recyclerView;
    private static final int REST = 816;
    private static final int BARS = 882;
    private static final int HOTELS = 433;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);
        //Inicializar  los botones
        this.init();

    }

    /*
        evento click
     */
    @Override
    public void onClick(View view)
    {
        //Normmalizar botones
        this.normalizeButton();
        /*
            Condiciones para cambiar el icono.
         */
        if (view.getId() == this.restaurants.getId())
        {
            this.restaurants.setBackgroundResource(R.drawable.icono_makeaplan_over);
            this.title.setText(R.string.title_content_1);
            this.selectJSON(REST);
            this.instaceList();
        } else if (view.getId() == this.afters.getId())
        {
            this.afters.setBackgroundResource(R.drawable.iconoafter_makeaplan_over);
            this.title.setText(R.string.title_content_3);

        }else if(view.getId() == this.bars.getId())
        {
            this.bars.setBackgroundResource(R.drawable.iconobar_makeaplan_over);
            this.title.setText(R.string.title_content_2);
            this.selectJSON(BARS);
            this.instaceList();
        }else if(view.getId() == this.fine.getId())
        {
            this.fine.setBackgroundResource(R.drawable.iconoparados_makeaplan_over);
            this.title.setText(R.string.title_content_5);

        }else if(view.getId() == this.action.getId())
        {
            this.action.setBackgroundResource(R.drawable.iconoaccion_makeaplanover);
            this.title.setText(R.string.title_content_6);

        }else if(view.getId() == this.hotels.getId())
        {
            this.hotels.setBackgroundResource(R.drawable.iconohotel_makeaplanover);
            this.title.setText(R.string.title_content_4);
            this.selectJSON(HOTELS);
            this.instaceList();


        }


    }
    //Inicializar componentes
    private void init()
    {
        //Inciar busqueda en JSON
        this.selectJSON(REST);
        //instacia de cada componente
        this.restaurants = (ImageView) this.findViewById(R.id.restaurantsXML);
        this.bars = (ImageView) this.findViewById(R.id.barsXML);
        this.afters = (ImageView) this.findViewById(R.id.aftersXML);
        this.hotels = (ImageView) this.findViewById(R.id.hotelsXML);
        this.fine = (ImageView) this.findViewById(R.id.finoXML);
        this.action = (ImageView) this.findViewById(R.id.actionXML);

        this.title = (TextView) this.findViewById(R.id.titleXML);

        //instancia del componente adapterlist y recyclerView
        this.instaceList();

        //asociar cada componente al envento click
        this.restaurants.setOnClickListener(this);
        this.bars.setOnClickListener(this);
        this.afters.setOnClickListener(this);
        this.hotels.setOnClickListener(this);
        this.fine.setOnClickListener(this);
        this.action.setOnClickListener(this);
        //se les asigna el icono que le corresponde
        this.normalizeButton();
        this.restaurants.setBackgroundResource(R.drawable.icono_makeaplan_over);



    }
    //Normalizar componentes.
    private void normalizeButton()
    {
        this.restaurants.setBackgroundResource(R.drawable.icono_restaurantesmakeaplan);
        this.afters.setBackgroundResource(R.drawable.iconoafter_makeaplan);
        this.bars.setBackgroundResource(R.drawable.iconobar_makeaplan);
        this.fine.setBackgroundResource(R.drawable.iconoparados_makeaplan);
        this.action.setBackgroundResource(R.drawable.iconoaccion_makeaplan);
        this.hotels.setBackgroundResource(R.drawable.iconohotel_makeaplan);

    }
    //Seleccionar JSON
    private void selectJSON(int i)
    {
        try
        {
            this.listInfo = new ArrayList<>();
            Response reponse = null;
            if (REST == i)
            {
                JSONObject jsonOb = new JSONObject(JSON.getJSON_resta());
                reponse = new Response(jsonOb.getJSONObject("response"));

            } else if (BARS == i)
            {
                JSONObject jsonOb = new JSONObject(JSON.getJSON_bar());
                reponse = new Response(jsonOb.getJSONObject("response"));
            }else if(HOTELS == i)
            {
                JSONObject jsonOb = new JSONObject(JSON.getJSON_hotel());
                reponse = new Response(jsonOb.getJSONObject("response"));
            }

            for(ResponseGroups var: reponse.getListGroup())
            {
                for(ResponseGroupsItems item: var.getListItemGroup())
                {
                    if(item.getResponseGroupHours() == null && item.getResponseGroupLocation() != null)
                        this.listInfo.add(new Info(item.getName(), "Horario Desconocido", item.getResponseGroupLocation().getLocation()));
                    else if(item.getResponseGroupHours() != null && item.getResponseGroupLocation() == null)
                        this.listInfo.add(new Info(item.getName(), item.getResponseGroupHours().getStatus(), "Ubicacion Desconocida"));
                    else if(item.getResponseGroupHours() == null && item.getResponseGroupLocation() == null)
                        this.listInfo.add(new Info(item.getName(), "Horario Desconocido", "Ubicacion Desconocida"));
                    else
                        this.listInfo.add(new Info(item.getName(),item.getResponseGroupHours().getStatus(),item.getResponseGroupLocation().getLocation()));

                }
            }

        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    //Recicle view y myadapter
    private void instaceList()
    {
        this.myAdapter = new AdapterList(this.listInfo);
        this.recyclerView = (RecyclerView) this.findViewById(R.id.list_card_view);
        RecyclerView.LayoutManager myManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(myManager);
        recyclerView.setAdapter(myAdapter);
    }
}
