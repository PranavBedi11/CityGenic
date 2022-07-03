package com.example.yeeet

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.cardview.widget.CardView



class EmailSend : AppCompatActivity() {

    lateinit var edt_email : EditText
    lateinit var edt_subject : EditText
    lateinit var edt_schoolName:EditText
    lateinit var edt_btn: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_email_send)

        edt_email = findViewById(R.id.emailAddress)
        edt_subject = findViewById(R.id.subject)
        edt_schoolName = findViewById(R.id.nameSchool)

        edt_btn = findViewById(R.id.sendBtn)

        edt_btn.setOnClickListener{
            var mail = edt_email.text.toString().trim()
            var subject = edt_subject.text.toString().trim()
            var schoolName = edt_schoolName.text.toString().trim()

            var i = Intent(Intent.ACTION_SEND)
            i.data = Uri.parse("Mail to: ")
            i.type = "text/plan"

            i.putExtra(Intent.EXTRA_EMAIL, arrayOf(mail))
            i.putExtra(Intent.EXTRA_SUBJECT, subject)
            i.putExtra(Intent.EXTRA_TEXT, schoolName)

            startActivity(Intent.createChooser(i,"Choose Email Client"))


        }



    }


}
