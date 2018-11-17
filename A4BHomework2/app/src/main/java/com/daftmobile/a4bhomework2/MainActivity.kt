package com.daftmobile.a4bhomework2

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*



@Suppress("PLUGIN_WARNING")
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        redButton.setOnClickListener {
            val builder=AlertDialog.Builder(this@MainActivity)
            builder.setMessage("Button red was tapped")
            val dialog:AlertDialog=builder.create()
            dialog.show()
        }
        blueButton.setOnClickListener {
            val builder=AlertDialog.Builder(this@MainActivity)
            builder.setMessage("Button blue was tapped")
            val dialog:AlertDialog=builder.create()
            dialog.show()
        }
        greenButton.setOnClickListener {
            val builder=AlertDialog.Builder(this@MainActivity)
            builder.setMessage("Button green was tapped")
            val dialog:AlertDialog=builder.create()
            dialog.show()
        }

    }

}
