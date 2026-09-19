package com.remotelink.app

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnHost = findViewById<Button>(R.id.btnHost)
        val btnClient = findViewById<Button>(R.id.btnClient)

        btnHost.setOnClickListener {
            Toast.makeText(
                this,
                "Mode HOST dipilih",
                Toast.LENGTH_SHORT
            ).show()
        }

        btnClient.setOnClickListener {
            Toast.makeText(
                this,
                "Mode KLIEN dipilih",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}
