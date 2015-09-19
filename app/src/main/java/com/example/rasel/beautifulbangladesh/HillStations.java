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

public class HillStations extends Fragment implements View.OnClickListener {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(
                R.layout.fragment_hillstation, container, false);
        CardView cardView = (CardView) view.findViewById(R.id.hill1);
        CardView cardView2 = (CardView) view.findViewById(R.id.hill2);
        CardView cardView3 = (CardView) view.findViewById(R.id.hill3);
        cardView.setOnClickListener(this);
        cardView2.setOnClickListener(this);
        cardView3.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.hill1) {

            Intent myIntent = new Intent(getActivity(), Bandarban.class);
            startActivity(myIntent);

        } else if (v.getId() == R.id.hill2) {


            Intent myIntent = new Intent(getActivity(), Khagrachari.class);
            startActivity(myIntent);

        } else if (v.getId() == R.id.hill3) {


            Intent myIntent = new Intent(getActivity(), Rangamati.class);
            startActivity(myIntent);

        }


    }
}