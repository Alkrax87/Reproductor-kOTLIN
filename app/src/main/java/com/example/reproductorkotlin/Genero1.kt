package com.example.reproductorkotlin

import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Genero1 : AppCompatActivity() {

    var songs =
        arrayOf(
            R.raw.music1g1,
            R.raw.music2g1,
            R.raw.music3g1,
            R.raw.music4g1,
            R.raw.music5g1
        )
    var port = arrayOf(
        R.drawable.g1b1,
        R.drawable.g1b2,
        R.drawable.g1b3,
        R.drawable.g1b4,
        R.drawable.g1b5
    )
    var name = arrayOf(
        "My Buddy Mike - Mad Love",
        "Kygo - Stargazing",
        "Ehrling - Sunshine",
        "Ehrling - Lovesick",
        "MBB - Sax"
    )
    var index = 0

    var mp = MediaPlayer();

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_genero1)

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
            val url = Uri.parse("https://music.youtube.com/channel/UClrogChduUvmxWsg54rpr-g")
            val intent = Intent(Intent.ACTION_VIEW, url)
            startActivity(intent)
        } else if (index == 1) {
            val url = Uri.parse("https://music.youtube.com/channel/UCkhjJ1ozo9YkGtZ2Vl-QpwA")
            val intent = Intent(Intent.ACTION_VIEW, url)
            startActivity(intent)
        } else if (index == 2) {
            val url = Uri.parse("https://music.youtube.com/channel/UCehltvwFEKIuSpJ0ktRxGpQ")
            val intent = Intent(Intent.ACTION_VIEW, url)
            startActivity(intent)
        } else if (index == 3) {
            val url = Uri.parse("https://music.youtube.com/channel/UCehltvwFEKIuSpJ0ktRxGpQ")
            val intent = Intent(Intent.ACTION_VIEW, url)
            startActivity(intent)
        } else if (index == 4) {
            val url = Uri.parse("https://music.youtube.com/channel/UCaeGVBkdQVb6IC7tTCHFy7A")
            val intent = Intent(Intent.ACTION_VIEW, url)
            startActivity(intent)
        }
    }
}