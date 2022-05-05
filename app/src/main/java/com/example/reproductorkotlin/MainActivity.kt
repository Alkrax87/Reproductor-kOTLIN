package com.example.reproductorkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun genero1(view: View) {
        val genero1 = Intent(this,Genero1::class.java)
        startActivity(genero1)
    }
    fun genero2(view: View) {
        val genero2 = Intent(this,Genero2::class.java)
        startActivity(genero2)
    }
    fun genero4(view: View) {
        val genero3 = Intent(this,Genero3::class.java)
        startActivity(genero3)
    }
    fun genero3(view: View) {
        val genero4 = Intent(this,Genero4::class.java)
        startActivity(genero4)
    }
    fun genero5(view: View) {
        val genero5 = Intent(this,Genero5::class.java)
        startActivity(genero5)
    }
}