package com.example.reproductorkotlin

import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Genero5 : AppCompatActivity() {

    var songs =
        arrayOf(
            R.raw.music1g5,
            R.raw.music2g5,
            R.raw.music3g5,
            R.raw.music4g5,
            R.raw.music5g5
        )
    var port = arrayOf(
        R.drawable.g5b1,
        R.drawable.g5b1,
        R.drawable.g5b3,
        R.drawable.g5b4,
        R.drawable.g5b5
    )
    var name = arrayOf(
        "See Naylors - Tali Nai 'Afe'",
        "Magic System - Magic in the Air",
        "The Lumineers - Ho Hey",
        "Kodaline - The One",
        "Robert Parker - 85 Again"
    )
    var index = 0

    var mp = MediaPlayer();

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_genero5)

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
            val url = Uri.parse("https://music.youtube.com/channel/UCmIYKsTBFH0qCfM4YQpc4bg")
            val intent = Intent(Intent.ACTION_VIEW, url)
            startActivity(intent)
        } else if (index == 1) {
            val url = Uri.parse("https://music.youtube.com/channel/UCAFa7ZqFFVqoMMhACqvAR8g")
            val intent = Intent(Intent.ACTION_VIEW, url)
            startActivity(intent)
        } else if (index == 2) {
            val url = Uri.parse("https://music.youtube.com/channel/UCMcghb8JhNIYntWea9QKFGA")
            val intent = Intent(Intent.ACTION_VIEW, url)
            startActivity(intent)
        } else if (index == 3) {
            val url = Uri.parse("https://music.youtube.com/channel/UC0cymQddFci7e31o7EIznYw")
            val intent = Intent(Intent.ACTION_VIEW, url)
            startActivity(intent)
        } else if (index == 4) {
            val url = Uri.parse("https://music.youtube.com/channel/UCa1xU8hVaCScU2R0M8AU8aw")
            val intent = Intent(Intent.ACTION_VIEW, url)
            startActivity(intent)
        }
    }
}