package com.example.tp3.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tp3.databinding.ActivityMainBinding
import com.example.tp3.mvp.contract.WriterContract
import com.example.tp3.mvp.presenter.WriterPresenter
import com.example.tp3.mvp.view.WriterView

class MainActivity : AppCompatActivity() {
    private lateinit var presenter: WriterContract.Presenter

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter = WriterPresenter(WriterView(this))
        binding.pilButton.setOnClickListener {
            presenter.onShowTextButtonPressed(binding.pilTextInput.text.toString())
        }
    }
}
