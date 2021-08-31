package com.example.domain.Model
import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep
 data class Model(
  @SerializedName("id")
  var name: String,
 @SerializedName("type")
  var id: String,
  @SerializedName("url")
  var url : String,


)