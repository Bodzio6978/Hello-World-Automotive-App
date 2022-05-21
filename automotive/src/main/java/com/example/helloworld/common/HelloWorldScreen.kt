package com.example.helloworld.common

import androidx.car.app.CarContext
import androidx.car.app.CarToast
import androidx.car.app.Screen
import androidx.car.app.model.ItemList
import androidx.car.app.model.ListTemplate
import androidx.car.app.model.Row
import androidx.car.app.model.Template

class HelloWorldScreen(carContext: CarContext) : Screen(carContext) {

    override fun onGetTemplate(): Template {
        val row = Row.Builder()
            .setTitle("Hello World")
            .setOnClickListener {
                CarToast.makeText(carContext,"Hi!",CarToast.LENGTH_LONG).show()
            }
            .build()

        val list = ItemList.Builder().addItem(row).build()

        return ListTemplate.Builder()
            .setSingleList(list)
            .setTitle("Hello World Title")
            .build()
    }

}