package com.maritza.ragnar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bundle = Bundle()
        bundle.putString("origem",  getString(R.string.menu))

        btRagnar.setOnClickListener {
            val intent = Intent(this, RagnarActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }

        btLagherta.setOnClickListener {
            val intent = Intent(this, LaghertaActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }
        btBjorn.setOnClickListener {
            val intent = Intent(this, BjornActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }
        btAthelstan.setOnClickListener {
            val intent = Intent(this, AthelstanActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }
        btRollo.setOnClickListener {
            val intent = Intent(this, RolloActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }
        btFloki.setOnClickListener {
            val intent = Intent(this, FlokiActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }

    }
}
