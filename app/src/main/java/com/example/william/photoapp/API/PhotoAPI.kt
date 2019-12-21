package com.example.william.photoapp.API

import com.example.william.photoapp.models.PhotoList
import retrofit2.Call
import retrofit2.http.GET

interface PhotoAPI {
    @GET("?key=9608159-788c68c255cd856bfe2bd64a4&q=nature&image_type=photo")
    fun getPhotos(): Call<PhotoList>
}