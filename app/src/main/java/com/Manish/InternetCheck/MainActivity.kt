package com.Manish.InternetCheck

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.manish.InternetCheck.R


class MainActivity : AppCompatActivity() {


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


      val btn_checkIinternet = findViewById<TextView>(R.id.btn_check_internet)
        btn_checkIinternet.setOnClickListener {
            if(ConnrctivityManager().CheckConectivity(this@MainActivity))
            {
                val dialog = AlertDialog.Builder(this@MainActivity)
                dialog.setTitle("Success")
                dialog.setMessage("Internet Connection Found")
                dialog.setPositiveButton("ok"){
                    text,listner->

                }
                dialog.setNegativeButton("cancel"){
                    text,listner->
                }
                dialog.create()
                dialog.show()

            }
            else
            {
                val dialog = AlertDialog.Builder(this@MainActivity)
                dialog.setTitle("Oops internet Not Found")
                dialog.setMessage("Internet Connection Not Found")
                dialog.setPositiveButton("ok"){
                        text,listner->
                    

                }
                dialog.setNegativeButton("cancel"){
                        text,listner->
                }
                dialog.create()
                dialog.show()

            }
        }






    }
}