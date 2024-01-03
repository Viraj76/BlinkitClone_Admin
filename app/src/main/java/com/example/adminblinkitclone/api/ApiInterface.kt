package com.example.userblinkitclone.api

import com.example.adminblinkitclone.model.Notification
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.HeaderMap
import retrofit2.http.Headers
import retrofit2.http.POST
import retrofit2.http.Path

interface ApiInterface {


    @Headers(
        "Content-Type: application/json",
        "Authorization: key=AAAAp2kSaZY:APA91bH24Pq-jFcisHkaGbU9tpuzbj8Se0wlfPtHTe8KLdr7Jpp33yj6BHqYuJhmW-u0zcQB5icDMbcs8cFUx7eukdxcdmTt3Z8BpmoQ_qPl_kIvHFUU_zMt4PAM-E8MVU1DmQldjGah"
    )
    @POST("fcm/send")
    fun sendNotification(@Body notification : Notification) : Call<Notification>
}