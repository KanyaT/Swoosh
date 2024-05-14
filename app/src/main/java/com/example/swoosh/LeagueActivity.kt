package com.example.swoosh

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button

class LeagueActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)

        val btn = findViewById<Button>(R.id.leagueNextBtn)
        btn.setOnClickListener {
            val intent = Intent(this, SkillActivity::class.java)
            startActivity(intent)
        }
    }
}