package com.example.a_zpharmacy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.a_zpharmacy.databinding.ActivityRegisterBinding
class Register : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var firstName: String = binding.editTextFirstName.text.toString()
        var lastName: String = binding.editTextLastName.text.toString()
        var phone: String = binding.editTextPhone.text.toString()
        var password: String = binding.editTextPassword.text.toString()

        binding.signupBtn.setOnClickListener {

            if (firstName.isNotEmpty() && lastName.isNotEmpty() && phone.isNotEmpty() && password.isNotEmpty()) {

                // navigation to another activity
                val doneIntent = Intent(this, Sections::class.java)
                startActivity(doneIntent)

            } else {
                if (password.isEmpty()) {
                    binding.editTextPassword.error = "Password required !"
                    binding.editTextPassword.requestFocus()
                    return@setOnClickListener
                }
                if (firstName.isEmpty()) {
                    binding.editTextFirstName.error = "First Name required !"
                    binding.editTextFirstName.requestFocus()
                    return@setOnClickListener
                }
                if (lastName.isNotEmpty()) {
                    binding.editTextLastName.error = "Last Name required !"
                    binding.editTextLastName.requestFocus()
                    return@setOnClickListener
                }
                if (phone.isEmpty()) {
                    binding.editTextPhone.error = "Phone required!"
                    binding.editTextPhone.requestFocus()
                    return@setOnClickListener
                }
            }

        }
        binding.loginBtn.setOnClickListener {
            val loginIntent = Intent(this, Login::class.java)
            startActivity(loginIntent)
        }
    }
}