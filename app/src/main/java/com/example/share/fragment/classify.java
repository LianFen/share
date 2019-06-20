package com.example.share.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.share.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class classify extends BaseFragment {


    @Override
    protected void setSubListener(){

    }
    private CardView cardView0,cardView1,cardView2,cardView3,cardView4,cardView5,cardView6,cardView7,cardView8,cardView9,cardView10,cardView11;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.fragment_classify,container,false);
        cardView0=rootView.findViewById(R.id.classify_0);
        cardView1=rootView.findViewById(R.id.classify_1);
        cardView2=rootView.findViewById(R.id.classify_2);
        cardView3=rootView.findViewById(R.id.classify_3);
        cardView4=rootView.findViewById(R.id.classify_4);
        cardView5=rootView.findViewById(R.id.classify_5);
        cardView6=rootView.findViewById(R.id.classify_6);
        cardView7=rootView.findViewById(R.id.classify_7);
        cardView8=rootView.findViewById(R.id.classify_8);
        cardView9=rootView.findViewById(R.id.classify_9);
        cardView10=rootView.findViewById(R.id.classify_10);
        cardView11=rootView.findViewById(R.id.classify_11);

        ChickListener(cardView0);
        ChickListener(cardView1);
        ChickListener(cardView2);
        ChickListener(cardView3);
        ChickListener(cardView4);
        ChickListener(cardView5);
        ChickListener(cardView6);
        ChickListener(cardView7);
        ChickListener(cardView8);
        ChickListener(cardView9);
        ChickListener(cardView10);
        ChickListener(cardView11);

        return rootView;
    }

}
