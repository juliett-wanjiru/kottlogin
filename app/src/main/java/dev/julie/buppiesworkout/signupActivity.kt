package dev.julie.buppiesworkout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout
import dev.julie.buppiesworkout.databinding.ActivityLoginBinding
import dev.julie.buppiesworkout.databinding.ActivitySignupBinding

class signupActivity : AppCompatActivity() {
    lateinit var binding: ActivitySignupBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setContentView(R.layout.activity_signup)

        binding.btnsignup.setOnClickListener {
         validateSignup()
        }
        binding.tvsignup.setOnClickListener {
            var intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }


    }

    fun validateSignup() {
        val firstname = binding.etfirstname.text.toString()
        val secondname = binding.etsecondname.text.toString()
        val password = binding.etpassword.text.toString()

        if (firstname.isBlank()) {
            binding.tilfirstname.error = "first name is required"
        }

        if (secondname.isBlank()) {
            binding.tilSecondname.error = "second name is required"
        }

        if (password.isBlank()) {
            binding.tilpassword.error = "second name is required"

        }
    }
}
//fun validate(){
//    var firstname=etfirstname.text.toString()
//    var secondname=etsecondname.text.toString()
//    var password=etpassword.text.toString()
//
//
//
//
//}
