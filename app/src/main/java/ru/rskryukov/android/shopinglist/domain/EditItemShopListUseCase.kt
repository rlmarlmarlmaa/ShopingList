package ru.rskryukov.android.shopinglist.domain

class EditItemShopListUseCase(private val shopListRepository: ShopListRepository) {

    fun editItem(shopItem: ShopItem) {
        shopListRepository.editItem(shopItem)
    }
}