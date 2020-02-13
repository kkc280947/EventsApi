package com.example.eventslibrary.model

import com.google.gson.annotations.SerializedName

data class AuthModelClass (
    @SerializedName("access_token")
    val access_token: String,
    @SerializedName("expires_in")
    val expireIn: Long,
    @SerializedName("scope")
    val scope: String,
    @SerializedName("token_type")
    val token_type: String
)