package dev.julie.buppiesworkout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout

class LoginActivity : AppCompatActivity() {
    lateinit var tvSignUp: TextView
    lateinit var etEmail: TextInputLayout
    lateinit var etPassword:TextInputLayout
    lateinit var tilEmail: TextInputLayout
    lateinit var tilPassword:TextInputLayout
    lateinit var btnLogin:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        tvSignUp=findViewById(R.id.tvsignup)
        etEmail=findViewById(R.id.etEmail)
        etPassword=findViewById(R.id.etpassword)
        tilEmail=findViewById(R.id.tilEmail)
        tilPassword=findViewById(R.id.tilpassword)
        btnLogin=findViewById(R.id.btnLogin)
        setContentView(R.layout.activity_login)

        tvSignUp.setOnClickListener {
            val intent=Intent(this,HomeActivity::class.java)
            startActivity(intent)

        }
        btnLogin.setOnClickListener{
            val intent=Intent(this,signupActivity::class.java)
            startActivity(intent)

        }
//       var email=etemail.text.toString()
//       var password=etpassword.text.toString()
//
//       if(email.isBlank()){
//           tilEmail.error="email is required"
//       }
//      if(password.isBlank()){
//
    //            tilpassword.error="password is required" }

}

}

