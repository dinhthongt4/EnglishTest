package com.example.thongdt.englishtest;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;

import com.example.thongdt.englishtest.adapter.MenuRecyclerViewAdapter;
import com.example.thongdt.englishtest.fragment.GrammarFragment_;
import com.example.thongdt.englishtest.objects.Menu;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import java.util.ArrayList;

@EActivity(R.layout.activity_main)
public class MainActivity extends FragmentActivity {

    @ViewById(R.id.toolbar)
    Toolbar mToolbar;

    @ViewById(R.id.drawerLayout)
    DrawerLayout mDrawerLayout;

    @ViewById(R.id.recyclerViewMenu)
    RecyclerView mRecyclerViewDrawer;

    private ActionBarDrawerToggle mDrawerToggle;
    private ArrayList<Menu> mMenus;
    private MenuRecyclerViewAdapter mMenuRecyclerViewAdapter;

    @AfterViews
    void init() {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerViewDrawer.setLayoutManager(layoutManager);

        if (mToolbar != null) {
            mToolbar.setTitle("English training");
            mToolbar.setTitleTextColor(0xffffffff);
        }

        initDrawer();
        getListMenu();

        mMenuRecyclerViewAdapter = new MenuRecyclerViewAdapter(mMenus);
        mRecyclerViewDrawer.setAdapter(mMenuRecyclerViewAdapter);

        setListener();
        getData();
    }

    private void getData() {

    }

    private void getListMenu() {
        mMenus = new ArrayList<>();

        Menu menu = new Menu();
        menu.setType(0);
        menu.setTitle(getResources().getString(R.string.title_menu_knowledge));
        mMenus.add(menu);

        Menu menu1 = new Menu();
        menu1.setType(1);
        menu1.setMenu(getResources().getString(R.string.menu_knowledge_grammar));
        menu1.setIdImage(R.drawable.ic_grammar);
        mMenus.add(menu1);

        Menu menu2 = new Menu();
        menu2.setType(1);
        menu2.setMenu(getResources().getString(R.string.menu_knowledge_listening));
        menu2.setIdImage(R.drawable.ic_listening);
        mMenus.add(menu2);

        Menu menu3 = new Menu();
        menu3.setType(1);
        menu3.setMenu(getResources().getString(R.string.menu_knowledge_speaking));
        menu3.setIdImage(R.drawable.ic_speaking);
        mMenus.add(menu3);

        Menu menu4 = new Menu();
        menu4.setType(0);
        menu4.setTitle(getResources().getString(R.string.title_menu_training));
        mMenus.add(menu4);

        Menu menu5 = new Menu();
        menu5.setType(1);
        menu5.setMenu(getResources().getString(R.string.menu_training_grammar));
        menu5.setIdImage(R.drawable.ic_reading);
        mMenus.add(menu5);

        Menu menu6 = new Menu();
        menu6.setType(1);
        menu6.setMenu(getResources().getString(R.string.menu_training_listening));
        menu6.setIdImage(R.drawable.ic_listening);
        mMenus.add(menu6);

        Menu menu7 = new Menu();
        menu7.setType(1);
        menu7.setMenu(getResources().getString(R.string.menu_training_video));
        menu7.setIdImage(R.drawable.ic_video);
        mMenus.add(menu7);

        Menu menu8 = new Menu();
        menu8.setType(0);
        menu8.setTitle(getResources().getString(R.string.title_menu_toeic));
        mMenus.add(menu8);

        Menu menu9 = new Menu();
        menu9.setType(0);
        menu9.setTitle(getResources().getString(R.string.title_menu_relax));
        mMenus.add(menu9);
    }

    void initDrawer() {
        mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, mToolbar, R.string.drawer_open, R.string.drawer_close) {
            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
            }

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
            }
        };

        mDrawerLayout.setDrawerListener(mDrawerToggle);
        mDrawerToggle.syncState();
    }

    private void setListener() {
        mMenuRecyclerViewAdapter.setOnMenuClickListener(new MenuRecyclerViewAdapter.OnMenuClickListener() {
            @Override
            public void onClick(int position) {

                setDefaultSelected();
                mDrawerLayout.closeDrawer(Gravity.LEFT);

                switch (position) {
                    case 1: {

                        mMenus.get(position).setIsSelected(true);
                        moveGrammarFragment();
                        break;
                    }
                }

                mMenuRecyclerViewAdapter.notifyDataSetChanged();
            }
        });
    }

    private void moveGrammarFragment() {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        GrammarFragment_ grammarFragment = new GrammarFragment_();
        fragmentTransaction.add(R.id.rlContain,grammarFragment).commit();
    }

    private void setDefaultSelected() {
        for (int i = 0 ; i < mMenus.size(); i ++) {
            mMenus.get(i).setIsSelected(false);
        }
    }

    @Override
    public void onPostCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onPostCreate(savedInstanceState, persistentState);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        mDrawerToggle.onConfigurationChanged(newConfig);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        if (mDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
