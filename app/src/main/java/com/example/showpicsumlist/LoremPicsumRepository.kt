package com.example.showpicsumlist

import com.google.gson.Gson
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class LoremPicsumRepository(private val service: LoremPicsumApiService) {

    fun getImageInfo(imageId: String): Flow<ImageInfo> = flow {
        val response = service.imageInfo(imageId)
        if(response.isSuccessful) {
            kotlin.runCatching {
                Gson().fromJson(
                    response.body()?.string(),
                    ResImageInfo.Response::class.java)
            }.onSuccess {
                emit(it.mapper())
            }.onFailure {
                throw RuntimeException("invalid JSON File.")
            }
        } else {
            throw RuntimeException("response is Failed.")
        }
    }

}