package com.infinitude.dost.activities

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.infinitude.dost.R
import io.reactivex.annotations.NonNull

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        // Add code for session

    }

    companion object {
        fun changeActivity(@NonNull context: Context): Intent {
            val intent = Intent(context, MainActivity::class.java)
            return intent
        }
    }
}
