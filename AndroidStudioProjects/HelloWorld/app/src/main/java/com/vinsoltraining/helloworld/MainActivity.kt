package com.vinsoltraining.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

fun testInput() {
    val items = listOf(1,2,3,4,5,6)

    items.forEach{ item ->
        val x = item * 100
        println("$item x 100 = $x")
    }
}

fun main(){
    testInput()
}