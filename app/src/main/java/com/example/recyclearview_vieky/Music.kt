package com.example.recyclearview_vieky

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Music(
    val imgMusic: Int,
    val nameMusic: String,
    val descMusic: String,
) : Parcelable
