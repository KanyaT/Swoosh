package com.example.swoosh.controller


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import android.widget.ToggleButton
import com.example.swoosh.Model.Player
import com.example.swoosh.R
import com.example.swoosh.utilities.EXTRA_PLAYER

class SkillActivity : BaseActivity() {

    lateinit var player: Player
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player = intent.getParcelableExtra(EXTRA_PLAYER)!!

        val beginnerBtn = findViewById<ToggleButton>(R.id.beginnerBtn)
        val ballerBtn = findViewById<ToggleButton>(R.id.ballerBtn)
        val finishBtn = findViewById<Button>(R.id.skillFinishBtn)

        beginnerBtn.setOnClickListener{
            ballerBtn.isChecked = false
            player.skill = "beginner"
        }
        ballerBtn.setOnClickListener {
            beginnerBtn.isChecked = false
            player.skill = "baller"
        }
        finishBtn.setOnClickListener {
            if(player.skill != "") {
                val intent = Intent(this, FinishActivity::class.java)
                intent.putExtra(EXTRA_PLAYER, player)
                startActivity(intent)
            }else{
                Toast.makeText(this,"Please select a skill...",Toast.LENGTH_SHORT).show()
            }
        }
    }
}