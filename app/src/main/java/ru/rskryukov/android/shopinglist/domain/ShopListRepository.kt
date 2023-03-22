package ru.rskryukov.android.shopinglist.domain

import androidx.lifecycle.LiveData


interface ShopListRepository {

    fun addItem(item: ShopItem)

    fun deleteItem(shopItem: ShopItem)

    fun editItem(shopItem: ShopItem)

    fun getItem(id: Int): ShopItem

    fun getShopList(): LiveData<List<ShopItem>>
}