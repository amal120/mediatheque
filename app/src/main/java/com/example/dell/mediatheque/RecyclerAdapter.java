package com.example.dell.mediatheque;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by DELL on 13/04/2016.
 */
public class RecyclerAdapter extends RecyclerView.Adapter <RecyclerAdapter.RecyclerViewHolder> {
    private static final int TYPE_HEAD = 0 ;
    private static final int TYPE_LIST = 1 ;
    ArrayList<Document> arrayList = new ArrayList<>();

    public RecyclerAdapter(ArrayList<Document> arrayList)
    {
        this.arrayList = arrayList;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        if(viewType==TYPE_HEAD) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.header_layout,parent,false);
            RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(view,viewType);
            return recyclerViewHolder;

        }
        else if (viewType==TYPE_LIST)
        {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout,parent,false);
            RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(view,viewType);
            return recyclerViewHolder;
        }
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {

        if (holder.viewType == TYPE_LIST) {
            Document document = arrayList.get(position-1);
            holder.Code.setText(document.getCode());
            holder.Titre.setText(document.getTitre());
            holder.Auteur.setText(document.getAuteur());
            holder.Type.setText(document.getType());
        }

    }
    @Override
    public int getItemCount() {
        return arrayList.size()+1;
    }
    public static class RecyclerViewHolder extends RecyclerView.ViewHolder
    {
        TextView Code,Titre,Auteur,Type;
        int viewType;
        public RecyclerViewHolder(View view,int viewType)
        {
            super(view);
            if(viewType==TYPE_LIST) {
                Code = (TextView) view.findViewById(R.id.code);
                Titre = (TextView) view.findViewById(R.id.titre);
                Auteur = (TextView) view.findViewById(R.id.auteur);
                Type = (TextView) view.findViewById(R.id.type);
                this.viewType = TYPE_LIST;
            }
            else if (viewType == TYPE_HEAD)
            {
                this.viewType = TYPE_HEAD;
            }
        }
    }

    @Override
    public int getItemViewType(int position) {
        if (position==0)
            return  TYPE_HEAD;
            return TYPE_LIST;

    }
}
