package com.bitcodetech.machine_test_volley_product

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bitcodetech.machine_test_product.VolleyRequestQueue

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        VolleyRequestQueue.getRequestQueue(this)
    }
}