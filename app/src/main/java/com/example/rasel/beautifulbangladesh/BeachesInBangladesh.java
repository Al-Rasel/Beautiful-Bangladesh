package com.example.rasel.beautifulbangladesh;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * it's a fragment of my tabs so first i set layout
 * i also set my card views
 * than i set click listener of each card view
 * than set what should do after a click
 */

public class BeachesInBangladesh extends Fragment implements View.OnClickListener {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(
                R.layout.fragment_beaches_in_bangladesh, container, false);
        CardView cardView = (CardView) view.findViewById(R.id.bch1);
        CardView cardView2 = (CardView) view.findViewById(R.id.bch2);
        CardView cardView3 = (CardView) view.findViewById(R.id.bch3);
        cardView.setOnClickListener(this);
        cardView2.setOnClickListener(this);
        cardView3.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.bch1) {

            Intent myIntent = new Intent(getActivity(), CoxBazar.class);
            startActivity(myIntent);

        } else if (v.getId() == R.id.bch2) {


            Intent myIntent = new Intent(getActivity(), Kuakata.class);
            startActivity(myIntent);

        } else if (v.getId() == R.id.bch3) {


            Intent myIntent = new Intent(getActivity(), MartinIsland.class);
            startActivity(myIntent);

        }


    }
}