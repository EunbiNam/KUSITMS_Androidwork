package com.example.Cienma;

import android.graphics.Movie;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    MovieAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.listView);

        adapter = new MovieAdapter();
        adapter.addItem(new Movieitem("kym71**", "10분전\n", "적당히 재밌다. 오랜만에 잠 안오는 영화 봤네요.",
                "\n추천 0  | ", "\n신고하기", R.drawable.user1));
        adapter.addItem(new Movieitem("kym71**", "10분전\n", "적당히 재밌다. 오랜만에 잠 안오는 영화 봤네요.",
                "\n추천 0  | ", "\n신고하기", R.drawable.user1));


        listView.setAdapter(adapter);


    }

    class MovieAdapter extends BaseAdapter {
        ArrayList<Movieitem> items = new ArrayList<>();

        public int getCount() {
            return items.size();
        }

        public void addItem(Movieitem item) {
            items.add(item);
        }

        @Override
        public Object getItem(int position) {
            return items.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            MovieitemView view = null;
            if (convertView == null) {
                view = new MovieitemView(getApplicationContext());
            } else {
                view = (MovieitemView) convertView;
            }

            Movieitem item = items.get(position);
            view.setName(item.getName());
            view.setTime(item.getTime());
            view.setRecom(item.getRecom());
            view.setReport(item.getReport());
            view.setReview(item.getReview());
            view.setImageViewa(item.getResId());

            return view;


        }
    }
}
