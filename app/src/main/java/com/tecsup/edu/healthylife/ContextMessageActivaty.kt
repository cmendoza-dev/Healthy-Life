package com.tecsup.edu.healthylife

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ContextMessageActivaty: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_textmessage)

        supportActionBar?.hide()

        val buttonLogin = findViewById<Button>(R.id.btnSend)
        buttonLogin.setOnClickListener {
            startActivity(Intent(this, NewPasswordActivity::class.java))
        }

    }

}