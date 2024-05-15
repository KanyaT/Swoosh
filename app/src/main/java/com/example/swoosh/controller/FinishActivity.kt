package com.example.swoosh.controller


import android.os.Bundle
import android.widget.TextView
import com.example.swoosh.Model.Player
import com.example.swoosh.R
import com.example.swoosh.utilities.EXTRA_PLAYER

class FinishActivity : BaseActivity() {

   lateinit var player: Player
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        player = intent.getParcelableExtra(EXTRA_PLAYER)!!

        val finishText = findViewById<TextView>(R.id.finishText)
        finishText.text = "Looking for a ${player.league} ${player.skill} like you....."
    }
}