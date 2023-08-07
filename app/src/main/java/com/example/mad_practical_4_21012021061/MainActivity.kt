package com.example.mad_practical_4_21012021061

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val login=findViewById<Button>(R.id.Login)
        val signup=findViewById<Button>(R.id.Signup)

        login.setOnClickListener(){
            Intent(this@MainActivity,LoginActivity::class.java).also{startActivity(it)}
        }
        signup.setOnClickListener(){
            Intent(this@MainActivity,RegistrationActivity::class.java).also{startActivity(it)}
        }


    }
}