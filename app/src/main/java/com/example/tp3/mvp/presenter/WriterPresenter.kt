package com.example.tp3.mvp.presenter

import com.example.tp3.mvp.contract.WriterContract

class WriterPresenter(private val view: WriterContract.View) : WriterContract.Presenter {
    override fun onShowTextButtonPressed(text: String) {
        view.showToast(text)
    }
}
