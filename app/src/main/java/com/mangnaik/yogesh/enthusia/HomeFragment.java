package com.mangnaik.yogesh.enthusia;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Yogesh on 7/16/2017.
 */

public class HomeFragment extends android.support.v4.app.Fragment  {

    public HomeFragment(){

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        String string = getArguments().getString("homepart");
        System.out.println(string);
        assert string != null;
        View view;
        switch (string){
            case "home":
                view =  inflater.inflate(R.layout.sample, container, false);
                return view;

            case "event":
                view = inflater.inflate(R.layout.fragment_event, container, false);
                View v = view.findViewById(R.id.cricket_card);
                v.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        System.out.println("Pressed");
                        Intent i = new Intent(getActivity(), EventActivity.class);
                        getActivity().startActivity(i);
                    }
                });
                View v1 = view.findViewById(R.id.cricket_card1);
                v1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        System.out.println("Pressed");
                        Intent i = new Intent(getActivity(), EventActivity.class);
                        getActivity().startActivity(i);
                    }
                });
                View v2 = view.findViewById(R.id.cricket_card2);
                v2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        System.out.println("Pressed");
                        Intent i = new Intent(getActivity(), EventActivity.class);
                        getActivity().startActivity(i);
                    }
                });
                View v3 = view.findViewById(R.id.cricket_card3);
                v3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        System.out.println("Pressed");
                        Intent i = new Intent(getActivity(), EventActivity.class);
                        getActivity().startActivity(i);
                    }
                });

                return view;
        }

        return super.onCreateView(inflater,container,savedInstanceState);
    }
}
