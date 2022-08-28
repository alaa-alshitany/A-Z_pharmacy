package com.example.a_zpharmacy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import com.example.a_zpharmacy.databinding.ActivityLoginBinding

class Login : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var password:String=binding.password.text.toString()
        var email:String=binding.editTextEmail.text.toString()



        binding.loginBtn.setOnClickListener{
            val doneIntent = Intent(this,Sections::class.java)
            startActivity(doneIntent)
        }
            /* if (email.isNotEmpty() && password.isNotEmpty()){

                 // navigation to another activity


             }else{
                 if (password.isEmpty()) {
                     binding.password.error= "Password required !"
                     binding.password.requestFocus()
                     return@setOnClickListener
                 }
                 if (email.isEmpty()) {
                     binding.editTextEmail.error= "Phone required !"
                     binding.editTextEmail.requestFocus()
                     return@setOnClickListener
                 }
             }
 */


        binding.signupBtn.setOnClickListener {
            val registerIntent  = Intent(this@Login , Register::class.java)
            startActivity(registerIntent)
            finish()
        }
    }




}