package com.example.recyclearview_vieky

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val music = intent.getParcelableExtra<Music>(MainActivity.INTENT_PARCELABLE)

        val imgMusic = findViewById<ImageView>(R.id.img_item_photo)
        val nameMusic = findViewById<TextView>(R.id.tv_item_name)
        val descMusic = findViewById<TextView>(R.id.tv_item_description)

        imgMusic.setImageResource(music?.imgMusic!!)
        nameMusic.text = music.nameMusic
        descMusic.text = music.descMusic
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
