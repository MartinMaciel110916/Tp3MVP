package com.example.tp3.mvp.view

import android.app.Activity
import android.widget.Toast
import com.example.tp3.mvp.contract.WriterContract
import com.example.tp3.mvp.view.base.ActivityView

class WriterView(activity: Activity) : ActivityView(activity), WriterContract.View {

    override fun showToast(text: String) {
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show()
    }
}
