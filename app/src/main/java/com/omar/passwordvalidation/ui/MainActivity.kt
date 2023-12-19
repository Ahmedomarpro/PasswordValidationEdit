package com.omar.passwordvalidation.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.databinding.DataBindingUtil
import com.omar.passwordvalidation.PasswordValidationView
import com.omar.passwordvalidation.R
import com.omar.passwordvalidation.R.id.pvv
import com.omar.passwordvalidation.R.layout.activity_main
import com.omar.passwordvalidation.databinding.ActivityMainBinding
import com.omar.towvalidation.validatePassword

class MainActivity : AppCompatActivity() {
   lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // setContentView(activity_main)
        binding = DataBindingUtil.setContentView(this@MainActivity,activity_main)


        binding.pvv.passwordEditText = binding.passwordEt
        binding.pvv.passwordMinLength = 10
        binding.pvv.setOnValidationListener{
            binding.btn.isEnabled = it
        }

        validatePassword("AAAAA",binding.textLowercase,"dhdhdh")




    }
}