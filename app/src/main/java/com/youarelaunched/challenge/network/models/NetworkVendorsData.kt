package com.youarelaunched.challenge.network.models

import com.google.gson.annotations.SerializedName

data class NetworkVendorsData(
    @SerializedName("vendors")
    val vendors: List<NetworkVendor>,
    @SerializedName("meta")
    val meta: NetworkListMeta?
)