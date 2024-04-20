package com.ifs21033.lostandfound.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
@Parcelize
data class DelcomLost(
    val id: Int,
    val userId: Int,
    val title: String,
    val description: String,
    val status: String,
    var isComplete: Boolean,
) : Parcelable