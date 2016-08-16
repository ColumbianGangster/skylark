package com.example.linearalgebra.slark0.view;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.linearalgebra.slark0.R;
import com.example.linearalgebra.slark0.model.MySet;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by LinearAlgebra on 16/08/2016.
 */
public class MainViewHolder  extends RecyclerView.ViewHolder{
    @BindView(R.id.rv_item_text)
    TextView title;
    private MySet set;

    public MainViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
        itemView.setOnClickListener(v -> {
            Intent intent = DetailActivity.getIntent(v.getContext(), set);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            v.getContext().startActivity(intent);
        });
    }

    public void bind(MySet skylarkSet) {
        title.setText(skylarkSet.getTitle());
        set = skylarkSet;
    }
}
