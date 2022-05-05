package com.example.reproductorkotlin

import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Genero2 : AppCompatActivity() {

    var songs =
        arrayOf(
            R.raw.music1g2,
            R.raw.music2g2,
            R.raw.music3g2,
            R.raw.music4g2,
            R.raw.music5g2
        )
    var port = arrayOf(
        R.drawable.g2b1,
        R.drawable.g2b2,
        R.drawable.g2b3,
        R.drawable.g2b4,
        R.drawable.g2b5
    )
    var name = arrayOf(
        "Mike Perry - Lighthouse",
        "Vanze - Outline",
        "Alesso - Heroes",
        "Krewella - Enjoy The Ride",
        "Martin Garrix - Don´t Look Down"
    )
    var index = 0

    var mp = MediaPlayer();

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_genero2)

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
            val url = Uri.parse("https://music.youtube.com/channel/UCi1LWfHjcZVEeDzunGjjiiA")
            val intent = Intent(Intent.ACTION_VIEW, url)
            startActivity(intent)
        } else if (index == 1) {
            val url = Uri.parse("https://music.youtube.com/channel/UCzd6Rnyhtd3xLhNfVoYSYpQ")
            val intent = Intent(Intent.ACTION_VIEW, url)
            startActivity(intent)
        } else if (index == 2) {
            val url = Uri.parse("https://music.youtube.com/channel/UCyFLp2WBpLae_p0j73_lGLA")
            val intent = Intent(Intent.ACTION_VIEW, url)
            startActivity(intent)
        } else if (index == 3) {
            val url = Uri.parse("https://music.youtube.com/channel/UCle2QnAfGyzlb71ydgBDx3A")
            val intent = Intent(Intent.ACTION_VIEW, url)
            startActivity(intent)
        } else if (index == 4) {
            val url = Uri.parse("https://music.youtube.com/channel/UCqJnSdHjKtfsrHi9aI-9d3g")
            val intent = Intent(Intent.ACTION_VIEW, url)
            startActivity(intent)
        }
    }


}