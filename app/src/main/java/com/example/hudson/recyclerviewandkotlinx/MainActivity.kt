package com.example.hudson.recyclerviewandkotlinx

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val songs = ArrayList<Song>()

        songs.add(Song("Anything"))
        songs.add(Song("Anything"))
        songs.add(Song("Anything"))
        songs.add(Song("Anything"))

        val adapter = SongsAdapter()
        songs_list.adapter = adapter
        songs_list.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        adapter.add(songs)
    }
}
