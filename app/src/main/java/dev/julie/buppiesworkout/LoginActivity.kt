package dev.julie.buppiesworkout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.julie.buppiesworkout.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.tvSignUp.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)

        }
        binding.btnLogin.setOnClickListener {
            val intent = Intent(this, signupActivity::class.java)
            startActivity(intent)
            validateLogin()

        }
        finish()

    }

    fun validateLogin() {
        val Email = binding.etEmail.text.toString()
        val password = binding.etpassword.text.toString()
        var error = false

        if (Email.isBlank()) {
            binding.tilEmail.error = "password is required"

            if (password.isBlank()) {
                binding.tilpassword.error = "password is required"

            }
        }
    }
}
