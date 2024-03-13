package com.example.movieapp.core

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.Retrofit

open class NetworkResponseHandler(private val retrofit: Retrofit) {
    suspend fun <RM : RemoteModel> safeApiCall(apiToBeCalled: suspend () -> Response<RM>): DataResult<RM> {
        return withContext(Dispatchers.IO) {
            try {
                val response = apiToBeCalled()
                if (response.isSuccessful) {
                    DataResult.Success(data = response.body()!!)
                } else {
                    DataResult.Error(convertErrorBody(response.errorBody()))
                }
            } catch (exception: Exception) {
                DataResult.Error(
                    AppException(msg = exception.message ?: "")
                )
            }
        }
    }

    private fun convertErrorBody(errorBody: ResponseBody?): AppException = try {
        errorBody?.let {
            retrofit.responseBodyConverter<AppException>(
                AppException::class.java,
                arrayOfNulls(0)
            ).convert(it)
        } ?: AppException(
            code = 400,
            msg = ""
        )
    } catch (exception: Exception) {
        AppException(
            code = 400,
            msg = exception.message ?: ""
        )
    }
}