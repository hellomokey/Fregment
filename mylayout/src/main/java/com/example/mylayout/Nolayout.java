package com.example.mylayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class Nolayout extends AppCompatActivity implements View.OnClickListener {

    private LinearLayout root;
    private Button click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        setContentView(root);
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.WRAP_CONTENT);
        for (int i=0; i<5; i++) {
            click = new Button(this);
            click.setText("Remove");
            click.setOnClickListener(this);
            lp.weight = 1;
            root.addView(click,lp);
        }
//        root.addView(click,LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT);
//        root.addView(click);
//        root.addView(click,300,200);
    }

    @Override
    public void onClick(View view) {
        root.removeView(view);
    }
}
