package com.example.swoosh.controller


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import android.widget.ToggleButton
import com.example.swoosh.utilities.EXTRA_LEAGUE
import com.example.swoosh.R
import com.example.swoosh.utilities.EXTRA_SKILL

class SkillActivity : BaseActivity() {

    var league=""
    var skill=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE).toString()

        val beginnerBtn = findViewById<ToggleButton>(R.id.beginnerBtn)
        val ballerBtn = findViewById<ToggleButton>(R.id.ballerBtn)
        val finishBtn = findViewById<Button>(R.id.skillFinishBtn)

        beginnerBtn.setOnClickListener{
            ballerBtn.isChecked = false
            skill = "beginner"
        }
        ballerBtn.setOnClickListener {
            beginnerBtn.isChecked = false
            skill = "baller"
        }
        finishBtn.setOnClickListener {
            if(skill != "") {
                val intent = Intent(this, FinishActivity::class.java)
                intent.putExtra(EXTRA_LEAGUE, league)
                intent.putExtra(EXTRA_SKILL, skill)
                startActivity(intent)
            }else{
                Toast.makeText(this,"Please select a skill...",Toast.LENGTH_SHORT).show()
            }
        }
    }
}