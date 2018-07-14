package com.alegs0501.explicitintent

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_b.*

class ActivityB : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)

        val extras = intent.extras ?:return
        textView2.text = extras.getString("pregunta")
    }

    fun responderPregunta(view: View){
        finish()
    }

    override fun finish() {
        val data = Intent()
        data.putExtra("respuesta", editText2.text.toString())
        setResult(Activity.RESULT_OK, data)
        super.finish()
    }
}
