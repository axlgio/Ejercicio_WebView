package com.example.ejercicio_web_view_s4

import Progra
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ejercicio_web_view_s4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val Progras = arrayListOf<Progra>(

        Progra(
            name = "Kootlin",
            descriptor = "El mejor",
            url = "https://developer.android.com/kotlin?gclid=CjwKCAjw95yJBhAgEiwAmR\n" +
                    "rutKGbTS8V7e_vepfIh2t7PzbhQh0N5kYJFd57eU7jCr9BP0boyx19CxoCL\n" +
                    "8UQAvD_BwE&gclsrc=aw.ds"
        ),
        Progra(
            name = "Java",
            descriptor = "Pura mamada",
            url = "https://docs.oracle.com/en/java/"
        )

    )

    lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        Info()
        addUrl()

    }




    private fun Info(){

        binding.apply {

            tvTitle1.text = Progras[0].name
            tvDescription1.text = Progras[0].descriptor

            tvTitle2.text = Progras[1].name
            tvDescription2.text = Progras[1].descriptor


        }

    }



    private fun addUrl(){

        val intent = Intent(this, WebViewActivity::class.java)
        val key = "url"


        binding.apply {

            btnPrueba1.setOnClickListener {
                intent.putExtra(key, Progras[0].url)
                startActivity(intent)
            }
            btnPrueba2.setOnClickListener {
                intent.putExtra(key, Progras[1].url)
                startActivity(intent)
            }


        }

    }



}

