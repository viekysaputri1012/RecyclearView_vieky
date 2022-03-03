package com.example.recyclearview_vieky

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MusicAdapter(private val context: Context, private val movie: List<Music>, val listener: (Music) -> Unit)
    : RecyclerView.Adapter<MusicAdapter.MusicViewHolder>(){

    class MusicViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val imgMusic = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameMusic = view.findViewById<TextView>(R.id.tv_item_name)
        val descMusic = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(Music: Music, listener: (Music) -> Unit) {
            imgMusic.setImageResource(Music.imgMusic)
            nameMusic.text = Music.nameMusic
            descMusic.text = Music.descMusic
            itemView.setOnClickListener{
                listener(Music)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MusicViewHolder {
        return MusicViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_rv, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MusicViewHolder, position: Int) {
        holder.bindView(movie[position], listener)
    }

    override fun getItemCount(): Int = movie.size
}