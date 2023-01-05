package com.example.mvc.model

import com.example.mvc.model.domain.User

class FakeDatabase {
    fun getCurrentUser():User{
        return User("Ahmed Nasser" , 1998)
    }
}