package com.example.linearalgebra.slark0.view;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.linearalgebra.slark0.R;
import com.example.linearalgebra.slark0.model.MySet;

import java.util.ArrayList;

/**
 * Created by LinearAlgebra on 16/08/2016.
 */
public class MainAdapter extends RecyclerView.Adapter<MainViewHolder>{
    private final LayoutInflater layoutInflater;
    private ArrayList<MySet> sets;

    public MainAdapter(Context context) {
        layoutInflater = LayoutInflater.from(context);
        sets = new ArrayList<>();
    }

    @Override
    public MainViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = layoutInflater.inflate(R.layout.recyclerview_item, parent, false);
        return new MainViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MainViewHolder holder, int position) {
        holder.bind(sets.get(position));
    }

    @Override
    public int getItemCount() {
        return sets.size();
    }

    public void setSets(ArrayList<MySet> sets) {
        this.sets = sets;
    }
}
