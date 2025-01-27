package com.proteam.loginscreen

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.proteam.loginscreen.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        onClick()
    }

    @SuppressLint("SetTextI18n")
    private fun onClick() {
        binding.btnLogin.setOnClickListener {
            val username = binding.inUsername.text.toString()
            val password = binding.inPassword.text.toString()
            binding.txtResult.text = "Username: $username, \nPassword: $password"

            Toast.makeText(baseContext, "Username: $username, \nPassword: $password", Toast.LENGTH_SHORT).show()
        }
    }
}