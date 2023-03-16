package com.example.tp3

import com.example.tp3.mvp.contract.WriterContract
import com.example.tp3.mvp.presenter.WriterPresenter
import io.mockk.MockKAnnotations
import io.mockk.impl.annotations.MockK
import io.mockk.verify
import org.junit.Before
import org.junit.Test

class WriterPresenterTest {

    private lateinit var writerPresenter: WriterContract.Presenter

    @MockK
    private lateinit var writerView: WriterContract.View

    @Before
    fun setup() {
        MockKAnnotations.init(this, relaxed = true)
        writerPresenter = WriterPresenter(writerView)
    }

    @Test
    fun `Mocked presenter Test`() {
        writerPresenter.onShowTextButtonPressed("Hello")
        verify { writerView.showToast("Hello") }
    }
}
