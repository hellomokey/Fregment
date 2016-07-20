package com.example.mylayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

public class FragLayout extends AppCompatActivity {

    private FrameLayout root;
    private ImageView IVA,IVB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frag_layout);
        root = (FrameLayout) findViewById(R.id.root);
        IVA = (ImageView) findViewById(R.id.IV1);
        IVB = (ImageView) findViewById(R.id.IV2);
        show1();
        root.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(IVA.getVisibility() ==  View.VISIBLE){
                    show2();
                }
                else{
                    show1();
                }
            }
        });
    }
    private void show1(){
        IVA.setVisibility(View.VISIBLE);
        IVB.setVisibility(View.INVISIBLE);
    }
    private void show2(){
        IVB.setVisibility(View.VISIBLE);
        IVA.setVisibility(View.INVISIBLE);
    }
}
