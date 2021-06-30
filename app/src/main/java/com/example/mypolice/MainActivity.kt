package com.example.mypolice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calendarId = findViewById<View>(R.id.CalendarView)
        val emailId = findViewById<View>(R.id.EmailId)
        val videoId = findViewById<View>(R.id.VideoId)
        val imagesId = findViewById<View>(R.id.ImagesId)
        val mapId = findViewById<View>(R.id.MapId)
        val archiveId = findViewById<View>(R.id.ArchiveId)


        calendarId.setOnClickListener {
            startActivity(Intent(this,DataActivity::class.java)) }

        emailId.setOnClickListener {
            startActivity(Intent(this,EmailActivity::class.java))
        }

        videoId.setOnClickListener {
            startActivity(Intent(this,VideoActivity::class.java))
        }

        imagesId.setOnClickListener {
            startActivity(Intent(this, ImagesActivity::class.java))
        }

        mapId.setOnClickListener {
            startActivity(Intent(this, MapActivity::class.java))
        }

        archiveId.setOnClickListener {
            startActivity(Intent(this, ArchuiveActivity::class.java))
        }
    }


}

