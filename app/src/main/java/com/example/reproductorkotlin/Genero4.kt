package com.example.reproductorkotlin

import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Genero4 : AppCompatActivity() {

    var songs =
        arrayOf(
            R.raw.music1g4,
            R.raw.music2g4,
            R.raw.music3g4,
            R.raw.music4g4,
            R.raw.music5g4
        )
    var port = arrayOf(
        R.drawable.g4b1,
        R.drawable.g4b1,
        R.drawable.g4b3,
        R.drawable.g4b4,
        R.drawable.g4b5
    )
    var name = arrayOf(
        "Khalid - 8TEEN",
        "Khalid - Young Dumb & Broke",
        "Frenship - 1000 Nights",
        "Bastille - Glory",
        "Bastille - Oblivion"
    )
    var index = 0

    var mp = MediaPlayer();

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_genero4)

        findViewById<TextView>(R.id.txtNombre).text = name[index]
        findViewById<ImageView>(R.id.imgSong).setBackgroundResource(port[index])
    }

    fun play(v: View){
        playSound()
    }
    fun pause(v: View){
        mp.pause()
    }
    fun prev(view: View) {
        index--
        if (index < 0) index = 4
        playSound()
    }
    fun next(view: View) {
        index++
        if (index > 4) index = 0
        playSound()
    }

    fun playSound(){
        mp.stop()
        findViewById<TextView>(R.id.txtNombre).text = name[index]
        findViewById<ImageView>(R.id.imgSong).setBackgroundResource(port[index])
        mp = MediaPlayer.create(this,songs[index])
        mp.start()
    }

    fun autor(view: View) {
        if (index == 0) {
            val url = Uri.parse("https://music.youtube.com/channel/UCnfeNQJ7TgUCPCBD0q5Zh-Q")
            val intent = Intent(Intent.ACTION_VIEW, url)
            startActivity(intent)
        } else if (index == 1) {
            val url = Uri.parse("https://music.youtube.com/channel/UCnfeNQJ7TgUCPCBD0q5Zh-Q")
            val intent = Intent(Intent.ACTION_VIEW, url)
            startActivity(intent)
        } else if (index == 2) {
            val url = Uri.parse("https://music.youtube.com/channel/UChL8mzJCvRgZSlQb5d_SCZA")
            val intent = Intent(Intent.ACTION_VIEW, url)
            startActivity(intent)
        } else if (index == 3) {
            val url = Uri.parse("https://music.youtube.com/channel/UCw81Qqzprmu2NKgRpZHiPrg")
            val intent = Intent(Intent.ACTION_VIEW, url)
            startActivity(intent)
        } else if (index == 4) {
            val url = Uri.parse("https://music.youtube.com/channel/UCw81Qqzprmu2NKgRpZHiPrg")
            val intent = Intent(Intent.ACTION_VIEW, url)
            startActivity(intent)
        }
    }
}