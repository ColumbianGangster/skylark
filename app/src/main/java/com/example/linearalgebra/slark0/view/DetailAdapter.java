package com.example.linearalgebra.slark0.view;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.linearalgebra.slark0.R;
import com.example.linearalgebra.slark0.model.MySet;
import com.example.linearalgebra.slark0.model.RealEpisode;

import java.util.ArrayList;

/**
 * Created by LinearAlgebra on 16/08/2016.
 */
public class DetailAdapter extends RecyclerView.Adapter<DetailViewHolder>{
    private ArrayList<RealEpisode> mySets;
    LayoutInflater layoutInflater;

    public DetailAdapter(Context context) {
        layoutInflater = LayoutInflater.from(context);
        mySets = new ArrayList<>();
    }

    @Override
    public DetailViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new DetailViewHolder(layoutInflater.inflate(R.layout.recyclerview_item, parent, false));
    }

    @Override
    public void onBindViewHolder(DetailViewHolder holder, int position) {
        holder.bind(mySets.get(position));
    }

    @Override
    public int getItemCount() {
        return mySets.size();
    }

    public void add(RealEpisode mySet) {
        mySets.add(mySet);
    }
}
