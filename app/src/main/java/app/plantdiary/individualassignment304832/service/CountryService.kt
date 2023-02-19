package app.plantdiary.individualassignment304832.service

import app.plantdiary.individualassignment304832.RetroFitClientInstance
import app.plantdiary.individualassignment304832.dao.ICountryDAO
import app.plantdiary.individualassignment304832.dto.Country
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.withContext
import retrofit2.awaitResponse

interface ICountryService {
    suspend fun fetchCountries() : List<Country>?
}

class CountryService : ICountryService {
    override suspend fun fetchCountries() : List<Country>?{
        return withContext(Dispatchers.IO){
            val service = RetroFitClientInstance.retrofitInstance?.create(ICountryDAO::class.java)
            val countries = async {service?.getAllCountries()}
            var result = countries.await()?.awaitResponse()?.body()
            return@withContext result
        }
    }
}