package com.example.y.actionbartabsexample;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBar.TabListener;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements TabListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setLogo(R.drawable.ic);
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setNavigationMode(actionBar.NAVIGATION_MODE_TABS);
        actionBar.addTab(actionBar.newTab().setText("AUDIO").setIcon(R.drawable.tab2).setTabListener(this));
        actionBar.addTab(actionBar.newTab().setText("VIDEO").setIcon(R.drawable.tab2).setTabListener(this));

    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
        int tabselected = tab.getPosition();
        switch(tabselected){
            case 0:{
                setContentView(R.layout.tab1);
                return;

            }
            case 1:{
                setContentView(R.layout.tab2);
                return;
            }

        }

    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {


    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }
}
