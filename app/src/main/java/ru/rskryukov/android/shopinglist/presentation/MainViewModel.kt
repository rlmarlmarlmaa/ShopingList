package ru.rskryukov.android.shopinglist.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ru.rskryukov.android.shopinglist.data.ShopListRepositoryImpl
import ru.rskryukov.android.shopinglist.domain.*

class MainViewModel : ViewModel() {

    private val repository = ShopListRepositoryImpl

    private val getShopListUseCase = GetShopListUseCase(repository)

    private val deleteItemShopListUseCase = DeleteItemShopListUseCase(repository)

    private val editItemShopListUseCase = EditItemShopListUseCase(repository)

    val shopList = getShopListUseCase.getShopList()

    fun deleteItem(shopItem: ShopItem) {
        deleteItemShopListUseCase.deleteItem(shopItem)
    }

    fun changeEnableState(shopItem: ShopItem) {
        val newItem = shopItem.copy(enabled = !shopItem.enabled)
        editItemShopListUseCase.editItem(newItem)
    }
}