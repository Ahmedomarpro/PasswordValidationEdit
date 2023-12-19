package com.omar.towvalidation

import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.EditText
import android.widget.TextView

fun validateEditPassword(view : EditText){
    view.addTextChangedListener(  object : TextWatcher {
        override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

        }

         override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            //validatePassword(p0.toString())
        }

        override fun afterTextChanged(p0: Editable?) {

        }

    })
}


val st1 = " x " +  " x "

fun validatePassword(string: String,textLowercase : TextView,st : Any) {
    val st1 = " x " +  " x "

    if  (string.isBlank() || string.chars().anyMatch(Character::isLowerCase).not()){
        //lowercase

        textLowercase.text = st.toString()

    }else{


        textLowercase.text = st.toString()

    }    }


