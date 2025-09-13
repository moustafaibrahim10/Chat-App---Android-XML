package com.example.chatapp

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.splash)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        Handler().postDelayed({
            val  intent = Intent(this,Onboarding :: class.java)
            startActivity(intent)
            finish()

        },
            3000
        )

    }
}



/*
Handler().postDelayed({
            // Create an Intent to open the next Activity
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)

            // Finish the current Activity so the user can't go back to the splash screen
            finish()
        }, 3000)
 */