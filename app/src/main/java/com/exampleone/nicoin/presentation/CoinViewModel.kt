package com.exampleone.nicoin.presentation

import androidx.lifecycle.ViewModel
import com.exampleone.nicoin.domain.GetCoinInfoListUseCase
import com.exampleone.nicoin.domain.GetCoinInfoUseCase
import com.exampleone.nicoin.domain.LoadDataUseCase
import javax.inject.Inject

class CoinViewModel @Inject constructor(
    private val getCoinInfoListUseCase: GetCoinInfoListUseCase,
    private val getCoinInfoUseCase: GetCoinInfoUseCase,
    private val loadDataUseCase: LoadDataUseCase
) : ViewModel() {

    val coinInfoList = getCoinInfoListUseCase()

    fun getDetailInfo(fSym: String) = getCoinInfoUseCase(fSym)

    init {
        loadDataUseCase()
    }
}
