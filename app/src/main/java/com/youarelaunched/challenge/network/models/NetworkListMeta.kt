package com.youarelaunched.challenge.network.models

import com.google.gson.annotations.SerializedName

data class NetworkListMeta(
    @SerializedName("seed")
    val seed: String
)
