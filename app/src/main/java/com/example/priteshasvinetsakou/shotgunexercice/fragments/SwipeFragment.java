package com.example.priteshasvinetsakou.shotgunexercice.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.andtinder.model.CardModel;
import com.andtinder.view.CardContainer;
import com.andtinder.view.SimpleCardStackAdapter;
import com.example.priteshasvinetsakou.shotgunexercice.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SwipeFragment extends Fragment {
    View                        rootview;


    public SwipeFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        rootview    =   inflater.inflate(R.layout.fragment_swipe, container, false);
        CardContainer mCardContainer = (CardContainer) rootview.findViewById(R.id.layoutview);
        SimpleCardStackAdapter adapter = new SimpleCardStackAdapter(getActivity());
        adapter.add(new CardModel("", "", getActivity().getDrawable(R.drawable.louvre)));
        adapter.add(new CardModel("", "", getActivity().getDrawable(R.drawable.moscou)));
        adapter.add(new CardModel("", "", getActivity().getDrawable(R.drawable.france)));
        adapter.add(new CardModel("", "", getActivity().getDrawable(R.drawable.gw_china)));

        mCardContainer.setAdapter(adapter);
        // Inflate the layout for this fragment
        return rootview;

    }


}
