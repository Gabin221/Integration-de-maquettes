package com.example.easypaymentapp

import android.content.Intent
import android.graphics.Color
import android.graphics.LinearGradient
import android.graphics.Shader
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.WindowManager
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

@Suppress("DEPRECATION")
class SplashScreen : AppCompatActivity() {

    lateinit var titleH1: TextView
    lateinit var titleH2: TextView
    lateinit var titleH3: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000)

        val paint = titleH1.paint
        val width = paint.measureText(titleH1.text.toString())
        val textShader: Shader = LinearGradient(0f, 0f, width, titleH1.textSize, intArrayOf(
            Color.parseColor(getColor(R.color.startDegradeGreen).toString()),
            Color.parseColor(getColor(R.color.endDegradeYellow).toString())
        ), null, Shader.TileMode.REPEAT)

        titleH1.paint.setShader(textShader)
    }
}
