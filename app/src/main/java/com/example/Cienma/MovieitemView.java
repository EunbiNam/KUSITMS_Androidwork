package com.example.Cienma;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.jar.Attributes;

public class MovieitemView extends LinearLayout {

    TextView textViewa;
    TextView textViewb;
    TextView textViewc;
    TextView textViewd;
    TextView textViewe;

    ImageView imageViewa;

    public MovieitemView(Context context){
        super(context);

        init(context);
    }

    public MovieitemView(Context context, AttributeSet attrs){
        super(context, attrs);

        init(context);
    }

    private void init(Context context){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.movie_item, this, true);

        textViewa = (TextView) findViewById(R.id.textViewa);
        textViewb = (TextView) findViewById(R.id.textViewb);
        textViewc = (TextView) findViewById(R.id.textViewc);
        textViewd = (TextView) findViewById(R.id.textViewd);
        textViewe = (TextView) findViewById(R.id.textViewe);
        imageViewa = (ImageView) findViewById(R.id.ImageViewa);
    }

    public void setName(String name){
        textViewa.setText(name);
    }

    public void setTime(String time){
        textViewb.setText(time);
    }

    public void setReview(String review){
        textViewc.setText(review);
    }

    public void setRecom(String recom){
        textViewd.setText(recom);
    }

    public void setReport(String report){
        textViewe.setText(report);
    }

    public void setImageViewa(int resId){
        imageViewa.setImageResource(resId);
    }
}
