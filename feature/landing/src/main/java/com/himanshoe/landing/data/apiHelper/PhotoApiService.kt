package com.himanshoe.landing.data.apiHelper

import com.himanshoe.landing.data.response.PhotoResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface PhotoApiService {

    @GET("list")
    suspend fun getAppConfig(
        @Query("page") pageNumber: Int,
        @Query("limit") limit: Int = 100
    ): Response<List<PhotoResponse>>


}