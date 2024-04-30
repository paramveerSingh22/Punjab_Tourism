package com.webrose.punjabtourism

import android.os.Parcel
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class TourismData(
    var image: Int? = null,
    var title:String?=null,
    var description: String? =null,
    /*var subList: ArrayList<TourismData>?=null*/
):Parcelable