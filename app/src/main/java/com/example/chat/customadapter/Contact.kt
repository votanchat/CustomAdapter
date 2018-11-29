package com.example.chat.customadapter

class Contact {
    var name: String? = null
    var phoneNumber: String? = null
    var color: Int = 0

    constructor(name: String, phoneNumber: String, color: Int) {
        this.name = name
        this.phoneNumber = phoneNumber
        this.color = color
    }

}