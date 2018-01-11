package com.example.user.pagerslide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by user on 11.01.18.
 */

public class CustomFragment1 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view =  inflater.inflate(R.layout.custom_fragment, null, false);
        ((TextView) view.findViewById(R.id.textView)).setText("CF_2");
        ((TextView) view.findViewById(R.id.textView2)).setText("CF_22");
        return view;

    }
}
