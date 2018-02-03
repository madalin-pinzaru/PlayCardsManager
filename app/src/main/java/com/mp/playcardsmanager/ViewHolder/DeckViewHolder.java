package com.mp.playcardsmanager.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.ContextMenu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.mp.playcardsmanager.Common.Common;
import com.mp.playcardsmanager.Interface.ItemClickListener;
import com.mp.playcardsmanager.R;

/**
 * Created by Madalin on 28-Ian-18.
 */

public class DeckViewHolder extends RecyclerView.ViewHolder implements
        View.OnClickListener,
        View.OnCreateContextMenuListener{



    public TextView deck_name;
    public ImageView deck_image;

    private ItemClickListener itemClickListener;

    public DeckViewHolder(View itemView) {
        super(itemView);

        deck_name = (TextView)itemView.findViewById(R.id.deck_name);
        deck_image =(ImageView)itemView.findViewById(R.id.deck_image);

        itemView.setOnCreateContextMenuListener(this);
        itemView.setOnClickListener(this);

    }

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    @Override
    public void onClick(View view) {

        itemClickListener.onClick(view,getAdapterPosition(),false);
    }

    @Override
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo  contextMenuInfo) {
        contextMenu.setHeaderTitle("Select an action");

        contextMenu.add(0,0,getAdapterPosition(), Common.UPDATE);
        contextMenu.add(0,1,getAdapterPosition(), Common.DELETE);
    }
}