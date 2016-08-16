package com.example.linearalgebra.slark0.view;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.linearalgebra.slark0.R;
import com.example.linearalgebra.slark0.model.RealEpisode;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by LinearAlgebra on 16/08/2016.
 */
public class EpisodeActivity extends AppCompatActivity {

    private static final String EXTRA_TITLE = "extra.title";
    private static final String EXTRA_SUBTITLE = "extra.subtitle";

    @BindView(R.id.episode_title) TextView episode_title;
    @BindView(R.id.episode_subtitle) TextView episode_subtitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_episode);
        ButterKnife.bind(this);
        episode_title.setText(getIntent().getStringExtra(EXTRA_TITLE));
        episode_subtitle.setText(getIntent().getStringExtra(EXTRA_SUBTITLE));
    }

    public static Intent intent(Context context, String title, String subtitle) {
        Intent intent = new Intent(context, EpisodeActivity.class);
        intent.putExtra(EXTRA_TITLE, title);
        intent.putExtra(EXTRA_SUBTITLE, subtitle);
        return intent;
    }
}
