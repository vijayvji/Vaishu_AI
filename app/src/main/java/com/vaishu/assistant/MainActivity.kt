package com.vaishu.assistant

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.provider.Settings
import android.widget.Button

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startBtn = findViewById<Button>(R.id.startServiceBtn)
        startBtn.setOnClickListener {
            val intent = Intent(this, FloatingService::class.java)
            startService(intent)
        }

        val permissionBtn = findViewById<Button>(R.id.permissionBtn)
        permissionBtn.setOnClickListener {
            val intent = Intent(Settings.ACTION_MANAGE_OVERLAY_PERMISSION)
            startActivity(intent)
        }
    }
}
