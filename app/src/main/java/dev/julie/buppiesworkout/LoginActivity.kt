package dev.julie.buppiesworkout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout

class LoginActivity : AppCompatActivity() {
    lateinit var tvsign:TextView
    lateinit var etemail:TextView
    lateinit var etpassword:TextView
    lateinit var btnlogin:Button
    lateinit var tilEmail:TextInputLayout
    lateinit var tilpassword:TextInputLayout


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        tvsign = findViewById(R.id.tvsign)
        etemail=findViewById(R.id.etEmail)
        etpassword=findViewById(R.id.etpassword)
        tilEmail = findViewById(R.id.tilEmail)
        tilpassword = findViewById(R.id.tilpassword)
        btnlogin=findViewById(R.id.btnlogin)
        btnlogin.setOnClickListener {
            val intent=Intent(this,HomeActivity::class.java)
            startActivity(intent)

        }
        tvsign.setOnClickListener{
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

