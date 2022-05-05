package com.example.reproductorkotlin

import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Genero3 : AppCompatActivity() {

    var songs =
        arrayOf(
            R.raw.music1g3,
            R.raw.music2g3,
            R.raw.music3g3,
            R.raw.music4g3,
            R.raw.music5g3
        )
    var port = arrayOf(
        R.drawable.g3b1,
        R.drawable.g3b2,
        R.drawable.g3b3,
        R.drawable.g3b4,
        R.drawable.g3b5
    )
    var name = arrayOf(
        "Europe - Carrie",
        "Starship - Nothing's Gonna Stop Us Now",
        "Bon Jovi - Livin' on a Player",
        "REO Speedwagon - Keep on Loving You The Ride",
        "Poison - Fallen Angel"
    )
    var index = 0

    var mp = MediaPlayer();

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_genero3)

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
            val url = Uri.parse("https://music.youtube.com/channel/UC0BozWvZixt1XMFBwQTFeOA")
            val intent = Intent(Intent.ACTION_VIEW, url)
            startActivity(intent)
        } else if (index == 1) {
            val url = Uri.parse("https://music.youtube.com/channel/UCx5EhC862RMB7_dOLBUCjAg")
            val intent = Intent(Intent.ACTION_VIEW, url)
            startActivity(intent)
        } else if (index == 2) {
            val url = Uri.parse("https://music.youtube.com/channel/UCCL-yoaPLR-7bxZM1xlcQcQ")
            val intent = Intent(Intent.ACTION_VIEW, url)
            startActivity(intent)
        } else if (index == 3) {
            val url = Uri.parse("https://music.youtube.com/channel/UCfAldYkhLRUDcWJPE-xrNqQ")
            val intent = Intent(Intent.ACTION_VIEW, url)
            startActivity(intent)
        } else if (index == 4) {
            val url = Uri.parse("https://music.youtube.com/channel/UC14hqQj0-hBS8awJBdAOOWA")
            val intent = Intent(Intent.ACTION_VIEW, url)
            startActivity(intent)
        }
    }
}