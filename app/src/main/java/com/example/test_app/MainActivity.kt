package com.example.test_app

import Multiply
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        System.out.println(Multiply.multiply(6, 2));
        Multiply.printTheMessage("sdfghjkl")
    }
}