package com.example.mvc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mvc.databinding.ActivityMainBinding
import com.example.mvc.model.FakeApiService
import com.example.mvc.model.FakeDatabase

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val api = FakeApiService()
    private val database = FakeDatabase()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        fetchAWisdom()
        fetchUserInfo()

    }


    private fun fetchAWisdom() {
        binding.apply {
            buttonFetch.setOnClickListener {
                textContent.text = api.getRandomWisdom().content
                textDate.text = api.getRandomWisdom().publishDate
            }
        }
    }
    private fun fetchUserInfo() {
        binding.textUsername.text = database.getCurrentUser().name
    }

}