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
import com.tomas.kreativeco.models.objects_json.ResponseGroups;
import com.tomas.kreativeco.models.objects_json.ResponseGroupsItems;
import com.tomas.kreativeco.utils.JSON;

import org.json.JSONObject;

import java.util.ArrayList;
/*
    Prueba.
    Gracias por la oportunidad :D

    En el caso de que lo llegue a pasar.
    Espero de su parte una observacion se lo agradesco mucho.
 */

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
        Evento click
     */
    @Override
    public void onClick(View view)
    {
        //Normmalizar botones, se cambian los icono originales de cada boton
        this.normalizeButton();
        /*
            Condiciones para cambiar el icono.
         */
        if (view.getId() == this.restaurants.getId())
        {
            //Cambia la imagen del boton
            this.restaurants.setBackgroundResource(R.drawable.icono_makeaplan_over);
            //Cambia el titulo
            this.title.setText(R.string.title_content_1);
            //Busca la informacion del JSON
            this.selectJSON(REST);
            //Genera de nuevo la lista.
            this.instaceList();
        } else if (view.getId() == this.afters.getId())
        {
            //Se cambia el icono
            this.afters.setBackgroundResource(R.drawable.iconoafter_makeaplan_over);
            //Se cambia el titulo.
            this.title.setText(R.string.title_content_3);

        }else if(view.getId() == this.bars.getId())
        {
            //Se cambia el icono del boton
            this.bars.setBackgroundResource(R.drawable.iconobar_makeaplan_over);
            //Se cambia el titlo
            this.title.setText(R.string.title_content_2);
            //Se busca el contenido de JSON bars
            this.selectJSON(BARS);
            //Se genera la nueva lista
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
            //Se cambia el icono del boton
            this.hotels.setBackgroundResource(R.drawable.iconohotel_makeaplanover);
            //Se cambia el titlo
            this.title.setText(R.string.title_content_4);
            //Se busca el contenido
            this.selectJSON(HOTELS);
            //Se genera la nueva lista
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
    //Normalizar componentes con el anterior icono. esto ocurre cuando se preciona un nuevo boton.
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
    /*
        Se buscara el JSON deacuerdo a la constante que se le pase.

        El metodo GETJSON se encuentra ubicado en paquete UTILS.

     */
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
            /*
                La forma en la que se recorre el JSON es de la siguiente manera.

                En el JSON cuentan con Response, el cual lo interpreto como un objecto.
                todos los datos individuales o mejor dicho que no son un conjunto de datos
                como por ejememplo Phone o Twitter, los interpreto como una propiedad de un
                objecto.

                Todos aquellos datos que tengan un conjunto de datos los interpreto como objectos
                como por ejemplo Response -> Group-> ITEMS.
                Items a su vez puede tener propiedades que se puedan interpretar como Objetos o
                como datos simples.

                El nombre del objeto va deacuerdo a la profundidad en la que se encuentra.
                Que quiere decir esto? en el JSON Response tiene un propiedad llamada Group que tiene
                un conjuto de informacion. entoces el objeto se llamara ResponseGroup ya que group
                es hijo de response.

                Cuando se pasa JSONOBJECT al Response en el contructor empieza hacer un tipo
                mapeo de cada objecto que se encuentre en el JSON, cabe recalcar que el recorrido
                no es dinamico, esta definido por la extructura de los archivos que se proporciono.

                Solo mostre una cantidad de datos limitada.

                Para obtener los valores es necesario realizar un ciclo
                por cada conjunto de objecto.

             */

            for(ResponseGroups var: reponse.getListGroup())
            {
                for(ResponseGroupsItems item: var.getListItemGroup())
                {
                    if(item.getResponseGroupHours() == null && item.getResponseGroupLocation() != null)
                        this.listInfo.add(new Info(item.getName(), "Horario Desconocido", item.getResponseGroupLocation().getLocation()));
                    else if(item.getResponseGroupHours() != null && item.getResponseGroupLocation() == null)
                        this.listInfo.add(new Info(item.getName(), item.getResponseGroupHours().getStatus(), "Ubicacion Desconocida"));
                    else if(item.getResponseGroupHours() != null && item.getResponseGroupLocation() != null)
                        this.listInfo.add(new Info(item.getName(),item.getResponseGroupHours().getStatus(),item.getResponseGroupLocation().getLocation()));
                    else
                        this.listInfo.add(new Info(item.getName(), "Horario Desconocido", "Ubicacion Desconocida"));
                }
            }

        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    //Se genera la vista recyclerview
    private void instaceList()
    {
        this.myAdapter = new AdapterList(this.listInfo);
        this.recyclerView = (RecyclerView) this.findViewById(R.id.list_card_view);
        RecyclerView.LayoutManager myManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(myManager);
        recyclerView.setAdapter(myAdapter);
    }
}
