package com.example.user.pagerslide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.sothree.slidinguppanel.SlidingUpPanelLayout;

/**
 * Created by user on 11.01.18.
 */

public class CustomFragment extends Fragment {
    SlidingUpPanelLayout slidingUpPanelLayout;
    LinearLayout footer;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view =  inflater.inflate(R.layout.custom_fragment, null, false);
        ((TextView) view.findViewById(R.id.textView)).setText("CF_1");

        footer = view.findViewById(R.id.ll_footer);



        slidingUpPanelLayout = (SlidingUpPanelLayout) view.findViewById(R.id.sliding_panel);

        slidingUpPanelLayout
                .addPanelSlideListener(
                        new SlidingUpPanelLayout.PanelSlideListener() {
                            @Override
                            public void onPanelSlide(View panel, float slideOffset) {

                                Log.d("DTAG", "onPanelSlide: " + slideOffset);

                                float previousValue = 0f;

                                if (previousValue<slideOffset && slideOffset>0.7){
                                    footer.setVisibility(View.GONE);
                                }



                            }

                            @Override
                            public void onPanelStateChanged(View panel, SlidingUpPanelLayout.PanelState previousState, SlidingUpPanelLayout.PanelState newState) {
                                Log.d("DTAG", "onPanelStateChanged: " + newState);

                                if (newState.equals(SlidingUpPanelLayout.PanelState.EXPANDED)){
                                    footer.setVisibility(View.GONE);

                                }

                                else if (newState.equals(SlidingUpPanelLayout.PanelState.COLLAPSED)){
                                    footer.setVisibility(View.VISIBLE);
                                }
                            }
                        });

        slidingUpPanelLayout.setFadeOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("DTAG", "onClick: fade");
            }
        });



        return view;



    }



}
