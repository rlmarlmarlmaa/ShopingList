package ru.rskryukov.android.shopinglist.domain

class DeleteItemShopListUseCase(private val shopListRepository: ShopListRepository) {

    fun deleteItem(shopItem: ShopItem) {
        shopListRepository.deleteItem(shopItem)
    }
}