package com.sand_corporation.www.pagingwithretrofit.RestAPI;

import com.sand_corporation.www.pagingwithretrofit.Model.StackAPIResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface APIService {

    @GET("answers")
    Call<StackAPIResponse>getAnswers(
            @Query("page") int page,
            @Query("pagesize") int size,
            @Query("site") String site
     );
}
