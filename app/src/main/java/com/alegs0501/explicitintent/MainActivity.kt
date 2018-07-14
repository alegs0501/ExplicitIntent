package com.alegs0501.explicitintent

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun hacerPregunta(view: View){
        val intent = Intent(this, ActivityB::class.java)
        intent.putExtra("pregunta", editText.text.toString())
        startActivityForResult(intent, 101)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 101){
            if (resultCode == Activity.RESULT_OK){
                if(data!!.hasExtra("respuesta")){
                    textView.text = data.extras.getString("respuesta")
                }
            }
        }
    }
}
