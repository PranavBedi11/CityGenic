package com.example.yeeet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.yeeet.modle.UserData
import com.example.yeeet.view.UserAdapter
import com.google.android.material.floatingactionbutton.FloatingActionButton

class places : AppCompatActivity() {
    private lateinit var addsBtn:FloatingActionButton
    private lateinit var recv:RecyclerView
    private lateinit var userList:ArrayList<UserData>
    private lateinit var userAdapter: UserAdapter




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_places)
        addsBtn = findViewById(R.id.addingBtn)
        recv = findViewById(R.id.mRecycler)
        userList = ArrayList()
        userAdapter = UserAdapter(this,userList)
        recv.layoutManager = LinearLayoutManager(this)
        recv.adapter = userAdapter
        addsBtn.setOnClickListener{addInfo()}

    }




    private fun addInfo(){
        val inflter = LayoutInflater.from(this)
        val v = inflter.inflate(R.layout.add_item, null)
        val userName = v.findViewById<EditText>(R.id.userName)
        val userNo = v.findViewById<EditText>(R.id.userNo)
        val addDialog = AlertDialog.Builder(this)
        addDialog.setView(v)
        addDialog.setPositiveButton("Ok"){

                dialog,_->
                val names = userName.text.toString()
                val number = userNo.text.toString()
                userList.add(UserData("Name: $names", "Address: $number"))
                userAdapter.notifyDataSetChanged()

                Toast.makeText(this,"Adding User Information Success",Toast.LENGTH_SHORT).show()
                dialog.dismiss()


        }
        addDialog.setNegativeButton("Cancel") {
                dialog, _ ->
                dialog.dismiss()
                Toast.makeText(this,"Cancel",Toast.LENGTH_SHORT).show()
        }
        addDialog.create()
        addDialog.show()
    }












}