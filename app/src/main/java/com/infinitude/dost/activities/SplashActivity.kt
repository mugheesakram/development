package com.infinitude.dost.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.infinitude.dost.R

class SplashActivity : AppCompatActivity() {

    var handler = Handler()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        handler.postDelayed(runnable, 3000)
    }

    private val runnable = Runnable { changeActivity() }


    private fun changeActivity() {
        val intent = MainActivity.changeActivity(this)
        startActivity(intent)
        finish()
    }

    override fun onDestroy() {
        super.onDestroy()
        handler.removeCallbacks(runnable)
    }
}
