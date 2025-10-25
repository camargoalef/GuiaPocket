package com.AC.guiapocket.model

import java.io.Serializable

data class Service(
    val nameResId: Int,
    val categoryResId: Int,
    val descriptionResId: Int,
    val imageId: Int,
    val phone: String,
    val websiteUrl: String,
    val latitude: Double,
    val longitude: Double
) : Serializable