package app.plantdiary.individualassignment304832

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetroFitClientInstance {
    private var retrofit: Retrofit? = null
    private val BASE_URL = "https://pkgstore.datahub.io"

    val retrofitInstance : Retrofit?
        get(){
            //has this object been created yet?
            if(retrofit == null){
                //create it
                retrofit = retrofit2.Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
            }
            return retrofit
        }
}