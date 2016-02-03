package com.tomas.kreativeco.controller_view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;

import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.tomas.kreativeco.R;

public class Main extends AppCompatActivity implements OnClickListener
{
    private ImageView restaurants, bars, afters, hotels, fine, action;
    private TextView title;

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
        } else if (view.getId() == this.afters.getId())
        {
            this.afters.setBackgroundResource(R.drawable.iconoafter_makeaplan_over);
            this.title.setText(R.string.title_content_2);

        }else if(view.getId() == this.bars.getId())
        {
            this.bars.setBackgroundResource(R.drawable.iconobar_makeaplan_over);
            this.title.setText(R.string.title_content_3);

        }else if(view.getId() == this.fine.getId())
        {
            this.fine.setBackgroundResource(R.drawable.iconoparados_makeaplan_over);
            this.title.setText(R.string.title_content_4);

        }else if(view.getId() == this.action.getId())
        {
            this.action.setBackgroundResource(R.drawable.iconoaccion_makeaplanover);
            this.title.setText(R.string.title_content_5);

        }else if(view.getId() == this.hotels.getId())
        {
            this.hotels.setBackgroundResource(R.drawable.iconohotel_makeaplanover);
            this.title.setText(R.string.title_content_6);

        }


    }
    //Inicializar componentes
    private void init()
    {
        //instacia de cada componente
        this.restaurants = (ImageView) this.findViewById(R.id.restaurantsXML);
        this.bars = (ImageView) this.findViewById(R.id.barsXML);
        this.afters = (ImageView) this.findViewById(R.id.aftersXML);
        this.hotels = (ImageView) this.findViewById(R.id.hotelsXML);
        this.fine = (ImageView) this.findViewById(R.id.finoXML);
        this.action = (ImageView) this.findViewById(R.id.actionXML);

        this.title = (TextView) this.findViewById(R.id.titleXML);
        //asociar cada componente al envento click
        this.restaurants.setOnClickListener(this);
        this.bars.setOnClickListener(this);
        this.afters.setOnClickListener(this);
        this.hotels.setOnClickListener(this);
        this.fine.setOnClickListener(this);
        this.action.setOnClickListener(this);
        //se les asigna el icono que le corresponde
        this.normalizeButton();


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
}
