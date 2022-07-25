package com.qonita.toastandsnackbar2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import com.qonita.toastandsnackbar2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        //Button Snacbar
      binding.btnSnackbar.setOnClickListener {
          val snackbar = Snackbar.make(binding.root, "Ini adalah Snacbar", Snackbar.LENGTH_SHORT).show()
      }

    //button Toast
        binding.btnToast.setOnClickListener {
            Toast.makeText(this, "Ini adalah Toast", Toast.LENGTH_SHORT).show()
        }





    }
}