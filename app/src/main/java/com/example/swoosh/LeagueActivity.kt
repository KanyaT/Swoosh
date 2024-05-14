package com.example.swoosh

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import android.widget.ToggleButton

class LeagueActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)

        var selected = ""

        val nextBtn = findViewById<Button>(R.id.leagueNextBtn)
        val menLeagueBtn = findViewById<ToggleButton>(R.id.menLeagueBtn)
        val womenLeagueBtn = findViewById<ToggleButton>(R.id.womenLeagueBtn)
        val coedLeagueBtn = findViewById<ToggleButton>(R.id.coedLeagueBtn)

        nextBtn.setOnClickListener {
            if(!selected.equals("")) {
                val intent = Intent(this, SkillActivity::class.java)
                intent.putExtra(EXTRA_LEAGUE, selected)
                startActivity(intent)
            }else{
                Toast.makeText(this,"Please select a league...", Toast.LENGTH_SHORT).show()
            }
        }

        menLeagueBtn.setOnClickListener {
            womenLeagueBtn.isChecked = false
            coedLeagueBtn.isChecked = false
            selected = "men"
        }

        womenLeagueBtn.setOnClickListener {
            menLeagueBtn.isChecked = false
            coedLeagueBtn.isChecked = false
            selected = "women"
        }

        coedLeagueBtn.setOnClickListener {
            womenLeagueBtn.isChecked = false
            menLeagueBtn.isChecked = false
            selected = "coed"
        }
    }
}