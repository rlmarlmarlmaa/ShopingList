package ru.rskryukov.android.shopinglist.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import ru.rskryukov.android.shopinglist.R
import ru.rskryukov.android.shopinglist.domain.ShopItem

class MainActivity : AppCompatActivity() {
    var count: Int = 0
    private lateinit var viewModel: MainViewModel
    private val itemDeletable = ShopItem("Name 1", 1, true, 1)
    private val itemEdited = ShopItem("Name 2", 2, true, 2)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        viewModel.shopList.observe(this) {
            Log.d("MainActivityTest", it.toString())
        }
    }
}