package com.example.pushnotificationfcm.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.Toast
import com.example.pushnotificationfcm.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // If you want Sending a Test Message background apps(inactive/killed)
        // FCM Automatically Displays the Notification using tokens
        // No Code Execution in onMessageReceived() for notification payload
        // Limited control (system controls look & behavior)
        // Quick alerts like promotions, reminders


    }
}