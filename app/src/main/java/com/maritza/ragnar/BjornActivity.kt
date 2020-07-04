package com.maritza.ragnar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_bjorn.*

class BjornActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bjorn)

        val bundle = Bundle()
        bundle.putString("origem", "Bjorn Ironside")

        val info = intent.extras?.getString("origem")
        txOrigem.text = "Você chegou nesse personagem através de: ${info}"

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

        btAthelstan.setOnClickListener {
            val intent = Intent(this, AthelstanActivity::class.java)
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
