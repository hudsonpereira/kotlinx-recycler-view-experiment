package com.example.hudson.recyclerviewandkotlinx

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.song_item.view.*

class SongsAdapter : RecyclerView.Adapter<SongsAdapter.SongViewHolder>() {
    val songs: MutableList<Song> = ArrayList()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SongViewHolder {
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.song_item, parent, false)

        return SongViewHolder(view)
    }

    override fun getItemCount(): Int {
        return songs.size
    }

    override fun onBindViewHolder(holder: SongViewHolder, position: Int) {
        val song = songs[position]

        holder.setSongName(song.title)
    }

    fun add(list: List<Song>) {
        songs.addAll(list)
        notifyDataSetChanged()
    }

    class SongViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun setSongName(title: String) {
            itemView.song_name.text = title
        }
    }
}