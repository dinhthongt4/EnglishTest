package com.example.thongdt.englishtest.api;

import com.example.thongdt.englishtest.objects.GrammarResponse;

import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by thongdt on 11/11/2015.
 */
public interface GetListGrammar {
    @GET("/grammar")
    void getGrammar(Callback<GrammarResponse> call);
}
