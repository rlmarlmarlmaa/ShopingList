package ru.rskryukov.android.shopinglist.domain

class AddItemShopListUseCase(private val shopListRepository: ShopListRepository) {

    fun addItem(item: ShopItem) {
        shopListRepository.addItem(item)
    }
}