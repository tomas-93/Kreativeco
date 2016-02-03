package com.tomas.kreativeco.controller_view.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.tomas.kreativeco.R;
import com.tomas.kreativeco.models.objects.Info;

import java.util.ArrayList;

/**
 * Created by Tomas on 03/02/2016.
 */
public class AdapterList extends  RecyclerView.Adapter <AdapterList.AdapterObject>
{
    //Lista el cual contiene la informacion del JSON
    ArrayList<Info> listInfo;
    public AdapterList(ArrayList<Info> listInfo)
    {
        this.listInfo = listInfo;
    }
    @Override
    public AdapterList.AdapterObject onCreateViewHolder(ViewGroup parent, int viewType)
    {
        //Se genera la instancia View para el Adaptador
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_card_view, parent, false);
        return new AdapterObject(view);
    }

    @Override
    public void onBindViewHolder(AdapterList.AdapterObject holder, int position)
    {
        //Cargar la informacion deacuerdo al objeto INFO
        this.loadInfo(holder, position);
    }

    //Contador de elementos de la lista
    @Override
    public int getItemCount()
    {
        return this.listInfo.size();
    }
    //Se les da el valor que contiene cada elemento de la lista.
    private void loadInfo(AdapterObject adapterObject, int position)
    {
        adapterObject.name.setText(this.listInfo.get(position).getName());
        adapterObject.isOpen.setText(this.listInfo.get(position).getIsOpen());
        adapterObject.location.setText(this.listInfo.get(position).getLocation());


    }
    //My adamtador para el recyclerview.
    public static class AdapterObject extends RecyclerView.ViewHolder
    {
        private TextView name, isOpen, location;
        public AdapterObject(View itemView)
        {
            super(itemView);
            this.name = (TextView) itemView.findViewById(R.id.nameXML);
            this.isOpen = (TextView) itemView.findViewById(R.id.isOpenXML);
            this.location =(TextView) itemView.findViewById(R.id.locationXML);
        }
    }
}
