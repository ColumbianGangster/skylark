package com.example.linearalgebra.slark0.view;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

import com.example.linearalgebra.slark0.R;
import com.example.linearalgebra.slark0.model.RealEpisode;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by LinearAlgebra on 16/08/2016.
 */
class DetailViewHolder extends RecyclerView.ViewHolder {
    @BindView(R.id.rv_item_text)
    TextView title;
    String subtitle;

    public DetailViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
        itemView.setOnClickListener(view -> {
            Intent intent = EpisodeActivity.intent(view.getContext(), title.getText().toString(), subtitle);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            view.getContext().startActivity(intent);
        });
    }

    public void bind(RealEpisode mySet) {
        String title = mySet.getTitle();
        this.subtitle = mySet.getSubtitle();
        this.title.setText(TextUtils.isEmpty(title) ? "<Title Unknown>" : title);
    }
}
