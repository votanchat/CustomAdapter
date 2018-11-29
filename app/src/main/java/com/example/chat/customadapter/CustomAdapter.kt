package com.example.chat.customadapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class CustomAdapter(context: Context,val resource: Int, val objects: MutableList<Contact>) :
    ArrayAdapter<Contact>(context, resource, objects) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val convertView = LayoutInflater.from(context).inflate(resource,parent,false)
        val arrContact = objects
        var contact : Contact = arrContact.get(position)
        val Avatar: TextView = convertView.findViewById(R.id.tvAvatar)
        val name: TextView = convertView.findViewById(R.id.tvName)
        val sdt: TextView = convertView.findViewById(R.id.tvPhoneNumber)
        Avatar.setBackgroundColor(contact.color)
        Avatar.text = (position+1).toString()
        name.text = contact.name
        sdt.text = contact.phoneNumber
        return convertView
    }

}