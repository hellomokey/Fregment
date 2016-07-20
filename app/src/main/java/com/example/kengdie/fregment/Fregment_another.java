package com.example.kengdie.fregment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by kengdie on 2016/7/20.
 */

public class Fregment_another extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println("onCreate");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fregment_another,container,false);
        root.findViewById(R.id.buttonBack).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager().popBackStack();
            }
        });
        return root;
    }

    @Override
    public void onPause() {
        super.onPause();
        System.out.println("on pause");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        System.out.println("on destroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        System.out.println("on destroy");
    }
}
