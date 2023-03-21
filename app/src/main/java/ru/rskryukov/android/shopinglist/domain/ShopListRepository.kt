package ru.rskryukov.android.shopinglist.domain

interface ShopListRepository {

    fun addItem(item: ShopItem)

    fun deleteItem(shopItem: ShopItem)

    fun editItem(shopItem: ShopItem)

    fun getItem(id: Int): ShopItem

    fun getShopList(): List<ShopItem>
}