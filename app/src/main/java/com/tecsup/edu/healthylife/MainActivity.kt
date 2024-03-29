package com.tecsup.edu.healthylife


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.tecsup.edu.healthylife.login.LoginActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        val buttonLogin = findViewById<Button>(R.id.btnLogin)
        buttonLogin.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }

        val buttonRegistrar = findViewById<Button>(R.id.btnRegistrar)
        buttonRegistrar.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }


    }

    override fun onBackPressed() {
        // Dejar vacío para no realizar ninguna acción al presionar el botón de retroceso
    }


}