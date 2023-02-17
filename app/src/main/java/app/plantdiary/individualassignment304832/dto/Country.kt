package app.plantdiary.individualassignment304832.dto

import com.google.gson.annotations.SerializedName

data class Country(@SerializedName("Code")var Code : String, @SerializedName("Name")var Name : String) {
    override fun toString(): String{
        return Name;
    }
}