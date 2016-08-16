package com.example.linearalgebra.slark0.view;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.linearalgebra.slark0.R;
import com.example.linearalgebra.slark0.api.Network;
import com.example.linearalgebra.slark0.model.MySet;
import com.example.linearalgebra.slark0.model.Item;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import icepick.Icepick;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by LinearAlgebra on 16/08/2016.
 */
public class DetailActivity extends AppCompatActivity {

    @BindView(R.id.setsdetail_recycler_view)
    RecyclerView recycleView;
    @BindView(R.id.setdetail_title)
    TextView setdetail_title;

    @BindView(R.id.setdetail_body)
    TextView setdetail_body;

    private static final String EXTRA_ITEMS = "extra.items";
    private static final String EXTRA_TITLE = "extra.title";
    private static final String EXTRA_BODY = "extra.body";
    private static final String EXTRA_TEMP_IMAGE = "extra.temp.image";

    private Network network;
    DetailAdapter adapter;

    public static Intent getIntent(Context context, MySet set) {
        Intent intent = new Intent(context, DetailActivity.class);
        intent.putParcelableArrayListExtra(EXTRA_ITEMS, set.getItems());
        intent.putExtra(EXTRA_TITLE, set.getTitle());
        intent.putExtra(EXTRA_BODY, set.getBody());
        intent.putExtra(EXTRA_TEMP_IMAGE, set.getTempImage());
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_list);
        ButterKnife.bind(this);
        Icepick.restoreInstanceState(this, savedInstanceState);
        network = App.getInstance(getApplicationContext()).getClient();
        populateItems(network);
        setSetTitle(getIntent().getStringExtra(EXTRA_TITLE));
        setSetBody(getIntent().getStringExtra(EXTRA_BODY));
    }

    @Override public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Icepick.saveInstanceState(this, outState);
    }

    private void populateItems(Network client) {

        recycleView.setLayoutManager(new LinearLayoutManager(this));

        adapter = new DetailAdapter(getApplicationContext());
        recycleView.setAdapter(adapter);

        ArrayList<Item> items = getIntent().getParcelableArrayListExtra(EXTRA_ITEMS);

        for (Item item : items) {
            client.fetchEpisode(item)
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(mySet -> {
                        adapter.add(mySet);
                        adapter.notifyItemInserted(adapter.getItemCount());
                    }, Throwable::printStackTrace);
        }
    }

    public void setSetTitle(String setTitle) {
        setdetail_title.setText(setTitle);
    }

    public void setSetBody(String setBody) {
        setdetail_body.setText(setBody);
    }
}
