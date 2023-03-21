package ru.rskryukov.android.shopinglist.domain

class GetItemShopListUseCase(private val shopListRepository: ShopListRepository) {

    fun getItem(id: Int): ShopItem {
        return shopListRepository.getItem(id)

    }
}