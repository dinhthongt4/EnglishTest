package com.example.thongdt.englishtest;

import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

/**
 * Created by thongdt on 10/11/2015.
 */

@EActivity(R.layout.activity_grammar_detail)
public class GrammarDetailActivity extends FragmentActivity {

    @ViewById(R.id.recyclerViewGrammarDetail)
    RecyclerView mRecyclerViewGrammarDetail;

    @AfterViews
    void init() {
        
    }
}
