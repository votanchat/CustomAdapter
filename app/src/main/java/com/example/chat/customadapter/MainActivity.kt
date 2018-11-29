package com.example.chat.customadapter

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var arrayList = ArrayList<Contact>()
        val contact1 = Contact("Trương Đình Chiến", "0988 933 xxx",Color.BLACK)
        val contact2 = Contact("Chất Đẹp Trai", "0944 943 xxx",Color.BLUE)
        val contact3 = Contact("Võ Văn Tài", "0933 223 xxx",Color.GREEN)
        arrayList.add(contact1)
        arrayList.add(contact2)
        arrayList.add(contact3)
        val customAdapter = CustomAdapter(this, R.layout.layout, arrayList);
        lv_contact.adapter = customAdapter
    }
}
