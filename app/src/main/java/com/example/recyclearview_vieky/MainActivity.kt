package com.example.recyclearview_vieky

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val musicList = listOf<Music>(
            Music(
                R.drawable.dandelions,
                nameMusic = "dandelions",
                descMusic = "lyrics"
            ),
            Music(
                R.drawable.traitor,
                nameMusic = "traitor",
                descMusic = "olivia"
            ),
            Music(
                R.drawable.merasaindah,
                nameMusic = "merasa indah",
                descMusic = "tiara"
            ),
            Music(
                R.drawable.tothebone,
                nameMusic = "tothebone",
                descMusic = "pamungkas"
            ),
            Music(
                R.drawable.unconditionally,
                nameMusic = "unconditionally",
                descMusic = "katy perry"
            ),


            )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_music)
        val horizontalLayoutManagaer =
            LinearLayoutManager(this@MainActivity, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.setLayoutManager(horizontalLayoutManagaer);
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = MusicAdapter(this, musicList){
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }
    }
}