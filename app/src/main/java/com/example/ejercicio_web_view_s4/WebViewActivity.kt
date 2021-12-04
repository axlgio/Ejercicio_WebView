package com.example.ejercicio_web_view_s4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ejercicio_web_view_s4.databinding.ActivityWebViewBinding

class WebViewActivity : AppCompatActivity() {

    lateinit var binding: ActivityWebViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWebViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var url = intent.getStringExtra("url").toString()
        binding.wvProgra.loadUrl(url)

    }
}