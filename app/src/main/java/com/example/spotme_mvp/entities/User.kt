package com.example.spotme_mvp.entities

class User {
    var id: Long? = null
    var username: String? = null
    var password: String? = null
    var email: String? = null
    var phone: String? = null

    constructor()

    constructor(username: String?, password: String?, email: String?, phone: String?) {
        this.username = username
        this.password = password
        this.email = email
        this.phone = phone
    }
}
