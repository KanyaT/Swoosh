package com.example.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import android.widget.ToggleButton
import com.example.swoosh.Model.Player
import com.example.swoosh.R
import com.example.swoosh.utilities.EXTRA_PLAYER

class LeagueActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)

        val player = Player("","")

        val nextBtn = findViewById<Button>(R.id.leagueNextBtn)
        val menLeagueBtn = findViewById<ToggleButton>(R.id.menLeagueBtn)
        val womenLeagueBtn = findViewById<ToggleButton>(R.id.womenLeagueBtn)
        val coedLeagueBtn = findViewById<ToggleButton>(R.id.coedLeagueBtn)

        nextBtn.setOnClickListener {
            if(!player.league.equals("")) {
                val intent = Intent(this, SkillActivity::class.java)
                intent.putExtra(EXTRA_PLAYER, player)
                startActivity(intent)
            }else{
                Toast.makeText(this,"Please select a league...", Toast.LENGTH_SHORT).show()
            }
        }

        menLeagueBtn.setOnClickListener {
            womenLeagueBtn.isChecked = false
            coedLeagueBtn.isChecked = false
            player.league = "men"
        }

        womenLeagueBtn.setOnClickListener {
            menLeagueBtn.isChecked = false
            coedLeagueBtn.isChecked = false
            player.league = "women"
        }

        coedLeagueBtn.setOnClickListener {
            womenLeagueBtn.isChecked = false
            menLeagueBtn.isChecked = false
            player.league = "coed"
        }
    }
}