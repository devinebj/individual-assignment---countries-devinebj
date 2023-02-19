package app.plantdiary.individualassignment304832

import app.plantdiary.individualassignment304832.service.CountryService
import app.plantdiary.individualassignment304832.service.ICountryService
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

@JvmField
val appModule = module {
    viewModel { MainViewModel() }
    single<ICountryService> { CountryService() }
}