package com.example.test_app
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mylibrary.Multiply


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Multiply.multiply(9, 2)
        Multiply.printTheMessage("wertyuiop")
    }
}