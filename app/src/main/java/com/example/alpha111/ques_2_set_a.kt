package com.example.alpha111

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.*
import android.content.Intent
import android.view.View


class ques_2_set_a : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ques2_set)
        //variable declaration
        var usr_sex = findViewById<RadioGroup>(R.id.Radio_main)
        var ch_1 = findViewById<CheckBox>(R.id.checkbox)
        var ch_2 = findViewById<CheckBox>(R.id.checkbox1)

        //toast messages

        usr_sex.setOnCheckedChangeListener{
                group, checkedId ->
                val caption: RadioButton = group.findViewById(checkedId)
                Toast.makeText( applicationContext, " You are a ${caption.text}", Toast.LENGTH_SHORT).show()
            }

        ch_1.setOnClickListener(){
            if(ch_1.isChecked)
                Toast.makeText( applicationContext, " Sed!! You Are Unmarried", Toast.LENGTH_SHORT).show()
        }

        ch_2.setOnClickListener(){
            if(ch_2.isChecked)
                Toast.makeText( applicationContext, " Congratulations! You have Government Job", Toast.LENGTH_SHORT).show()
        }


    }

}