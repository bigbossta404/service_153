package com.example.service_153

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.net.Uri
import android.media.MediaPlayer
import android.content.Intent
import android.provider.MediaStore
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_pesbuk.setOnClickListener ({
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/rfakhri.dantiano"))
            startActivity(i)
        })

        btn_insta.setOnClickListener({
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/fakhri_fadlan"))
            startActivity(i)
        })

        //MEDIA PLAYER
        val MediaPlayer: MediaPlayer? = MediaPlayer.create(this,R.raw.singstreet)

        btn_play.setOnClickListener {
            MediaPlayer?.start()
        }

        btn_paus.setOnClickListener {
            MediaPlayer?.pause()
        }

        btn_stop.setOnClickListener {
            MediaPlayer?.stop()
            MediaPlayer?.seekTo(0)
        }
    }
}
