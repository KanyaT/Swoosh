package com.example.swoosh.controller


import android.os.Bundle
import android.widget.TextView
import com.example.swoosh.R
import com.example.swoosh.utilities.EXTRA_LEAGUE
import com.example.swoosh.utilities.EXTRA_SKILL

class FinishActivity : BaseActivity() {

    var league = ""
    var skill = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        league = intent.getStringExtra(EXTRA_LEAGUE).toString()
        skill = intent.getStringExtra(EXTRA_SKILL).toString()

        val finishText = findViewById<TextView>(R.id.finishText)
        finishText.text = "Looking for a $league $skill like you....."
    }
}