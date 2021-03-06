package com.example.thongdt.englishtest.fragment;

import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.thongdt.englishtest.R;
import com.example.thongdt.englishtest.adapter.GrammarRecyclerViewAdapter;
import com.example.thongdt.englishtest.api.GetListGrammar;
import com.example.thongdt.englishtest.common.SpacesItemDecoration;
import com.example.thongdt.englishtest.objects.GrammarResponse;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;

import java.util.ArrayList;

/**
 * Created by thongdt on 30/10/2015.
 */

@EFragment(R.layout.fragment_grammar)
public class GrammarFragment extends Fragment {

    @ViewById(R.id.recyclerViewGrammar)
    RecyclerView mRecyclerViewGrammar;

    private ArrayList<GrammarResponse.Grammar> mGrammars;
    private GrammarRecyclerViewAdapter mGrammarRecyclerViewAdapter;

    @AfterViews
    void init() {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        mRecyclerViewGrammar.setLayoutManager(layoutManager);

        mGrammars = new ArrayList<>();

        mRecyclerViewGrammar.addItemDecoration(new SpacesItemDecoration(5));

        getData();
        mGrammarRecyclerViewAdapter = new GrammarRecyclerViewAdapter(mGrammars);
        mRecyclerViewGrammar.setAdapter(mGrammarRecyclerViewAdapter);
    }


    private void getData() {

        GrammarResponse grammarResponse = new GrammarResponse();

        GrammarResponse.Grammar grammar = grammarResponse.new Grammar();
        grammar.setName("Hien tai don");
        grammar.setAvatar(R.drawable.avatar + "");
        mGrammars.add(grammar);
        mGrammars.add(grammar);
        mGrammars.add(grammar);
        mGrammars.add(grammar);
        mGrammars.add(grammar);
    }
}
