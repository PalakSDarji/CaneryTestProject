package com.palak.canerytestproject.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class User(val name : String, val address: Address) : Parcelable