package com.example.chatapp

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.button.MaterialButton

class Onboarding : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_onboarding)
       val signInBtn = findViewById<TextView>(R.id.logIn_onBoarding)
        val intent = Intent(this, SignIn::class.java)
        signInBtn.setOnClickListener {
            startActivity(intent)
        }
        val signUpBtn = findViewById<MaterialButton>(R.id.sign_up_with_email);
        val intent2 = Intent(this,signUp::class.java);
        signUpBtn.setOnClickListener {
            startActivity(intent2)
        }

    }
}