package com.example.linearalgebra.slark0.view;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.linearalgebra.slark0.BaseActivity;
import com.example.linearalgebra.slark0.R;
import com.example.linearalgebra.slark0.api.Network;

import butterknife.BindView;
import butterknife.ButterKnife;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class MainActivity extends BaseActivity {

    @BindView(R.id.sets_recycler_view)
    RecyclerView recyclerView;
    Network network;

    @Override
    protected void onCreateView() {
        network = App.getInstance(getApplicationContext()).getClient();
        ButterKnife.bind(this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        MainAdapter adapter = new MainAdapter(getApplicationContext());
        recyclerView.setAdapter(adapter);
        fetchSets(adapter);
    }

    private void fetchSets(final MainAdapter adapter) {
        network.fetchSets()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(skylarkSets -> {
                    adapter.setSets(skylarkSets);
                    adapter.notifyDataSetChanged();
                    Log.i("Bert", "fetchSets: "+skylarkSets.size());
                }, Throwable::printStackTrace);
    }
}
