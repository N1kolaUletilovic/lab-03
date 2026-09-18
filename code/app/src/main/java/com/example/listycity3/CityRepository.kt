
package com.example.listycity3
import androidx.compose.runtime.mutableStateListOf


class CityRepository {
    private val _cities = mutableStateListOf(
        City("Edmonton", "AB"),
        City("Vancouver", "BC"),
        City("Toronto", "ON"),
        City("Red Deer", "AB"),
        City("St. Albert", "AB"),
        City("Toronto", "ON")
    )


    val cities: List<City>
        get() = _cities


    fun addCity(city: City) {
        _cities.add(city)
    }


    fun updateCity(prevCity: City, newCity: City) {
        val index = _cities.indexOf(prevCity)
        if (index != -1) {
            _cities[index] = newCity
        }
    }
}


