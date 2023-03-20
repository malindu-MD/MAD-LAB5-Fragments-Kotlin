package com.example.lab5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        getSupportActionBar()?.hide()

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val imgHome:ImageView=findViewById(R.id.imageView)
        val imgUser:ImageView=findViewById(R.id.imageView2)

        val fragmentHome=HomeFragment()
        val fragmentUser=UserFragement()

        imgUser.setOnClickListener{

            imgHome.setImageResource(R.drawable.unselected_home)
            imgUser.setImageResource(R.drawable.selected_user_24)

            supportFragmentManager.beginTransaction().apply {

                replace(R.id.fragmentContainerView5,fragmentUser)
                commit()
            }

        }
        imgHome.setOnClickListener{

            imgHome.setImageResource(R.drawable.selected_home)
            imgUser.setImageResource(R.drawable.unselected_user_24)

            supportFragmentManager.beginTransaction().apply {

                replace(R.id.fragmentContainerView5,fragmentHome)
                commit()
            }

        }




    }
}